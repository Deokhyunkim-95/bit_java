############################
table 생성 DDL (auto commit)

테이블은 실제로 데이터들이 저장되는 곳 이라고 생각하면 쉽게 이해 할 수 있으며,
CREATE TABLE 명령어를 이용해서 테이블을 생성 할 수 있다.
############################

drop table book;

create table book(
bookno number(5),
title varchar2(30),
author varchar2(30),
pubdate date
);

select * from book;

insert into book values(1,'java','kim',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍',sysdate);
insert into book values(2,'jsp','홍','19/02/12');
commit; 확정
rollback; 취소

insert into book(bookno,title) values (3,'db');
insert into book (bookno,title,author,pubdate) values(4,'db',null,null);

delete from book;
rollback;
delete from book where title = 'db';
delete from book where author is null;
delete from book where author = '홍';

desc book; // 테이블구조

alter table book add(price number(7)); //구조 변경 컬럼 추가
insert into book (bookno,title,author,pubdate,price) values(4,'db',null,null,900);

update book set price =1000.99;
commit;
rollback;
update book set price = 900 where title = 'db';
select * from book;

update book set author = '~~~~~' , price = 900,pubdate = sysdate where bookno=3;

update book set price =null;
alter table book modify(price number(7,2));
update book set price =1000.99;
commit;

alter table book drop column price; //price colum삭제

drop table book;

create table book(
bookno number(5),
title varchar2(30),
author varchar2(30),
pubdate date
);

alter table book add(price number(7)); //구조 변경 컬럼 추가
alter table book modify(price number(7,2));
alter table book drop column price; //price column삭제
rename book to book2;
rename book2 to book;

alter table emp2 rename column deptno to deptnono;// column의 이름 변경


insert into book (bookno,title,author,pubdate) values(4,'db',null,null);
delete from book where author = '홍';
update book set author = '~~~~~' , price = 900,pubdate = sysdate where bookno=3;

delete from book; //데이터 삭제 rollback 가능
truncate table book; //데이터 삭제 rollback 불가능auto commit;
drop table book; auto commit;

select * from book;
######################################################################
######################################################################

select * from emp;
select * from dept;

create table emp2 as select * from emp;  // emp를 사용하여 똑같은 데이터를 가진 emp2 table 생성 제약조건은 복사되지 않는다.
create table dept2 as select * from dept;

commit;
insert into dept values (50,'EDU','SEOUL');
insert into dept2 values (50,'EDU','SEOUL');

insert into emp(empno,ename,hiredate,sal,deptno) values(9999,'홍길동',sysdate,0,90);
insert into emp2(empno,ename,hiredate,sal,deptno) values(9999,'홍길동',sysdate,0,90);

drop table book;
create table book(
bookno number(5) constraint scott_book_pk primary key,
title varchar2(30) constraint scott_book_title_unique unique ,
author varchar2(30) ,
price number(7,2) constraint book_price_check check(price>0),
pubdate date default sysdate
);
insert into book (bookno,title,author,price,pubdate) values(1,'db','홍길동',900,sysdate);
insert into book (bookno,title,author,price,pubdate) values(2,'jsp','홍길동',22000,sysdate);
insert into book (bookno,title,author,price,pubdate) values(3,'java','김길동',32000,default);

commit;

###BOOK테이블에 걸린 제약조건 확인
select CONSTRAINT_name
from user_cons_columns
where table_name='BOOK';

drop table book;
create table book(
bookno number(5) ,
title varchar2(30) unique ,
author varchar2(30) ,
price number(7,2) check(price>0),
pubdate date default sysdate
);

alter table book add CONSTRAINT book_bookno_pk primary key(bookno);
alter table book drop CONSTRAINT book_bookno_pk;

insert into book (bookno,title,author,price,pubdate) values(1,null,'김길동',32000,default);
insert into book (bookno,title,author,price) values(5,null,'김길동',32000);

#############################################################################
emp dept
############################################################################
delete from dept where deptno=50;
commit;

drop table dept2;
create table dept2 as select * from dept;
alter table dept2 add CONSTRAINT dept2_pk primary key(deptno);

drop table emp2;
create table emp2 as select * from emp;
##################################################################
alter table emp2 add CONSTRAINT emp2_pk primary key(empno);
alter table emp2 add foreign key(deptno) references dept2;
alter table emp2 add foreign key(mgr) references emp2;
###################################################################

select * from dept2;
insert into dept2 values (50,'EDU','SEOUL');

select * from emp2;
insert into emp2(empno,ename,hiredate,sal,deptno) values(9999,'홍길동',sysdate,0,50);
insert into emp2(empno,ename,hiredate,sal,deptno) values(7777,'고길동',sysdate,0,null);
insert into emp2(empno,ename,hiredate,sal,deptno,mgr) values(8888,'이길동',sysdate,0,null,10);

drop table emp2 cascade CONSTRAINT;
drop table dept2 cascade CONSTRAINT;

CASCADE: 참조되는 테이블의 행이 삭제되었을 경우에는 참조하는 테이블과 대응되는 모든 행들이 삭제된다. 참조되는 테이블의 행이 갱신되었을 경우에는 참조하는 테이블의 외래 키 값은 같은 값으로 갱신된다.
RESTRICT: 참조하는 테이블의 행이 남아 있는 경우에는 참조되는 테이블의 행을 갱신하거나 삭제할 수 없다. 이 경우에는 데이터 변경이 이루어지지 않는다.

#########################################################
트랙잭션 멀티스레드와 비슷한 개념 한군데에서 사용하고 commit이나 rollback을 안하면 다른곳에서 쓰기 작업이 불가하다.
#########################################################
create table emp2 as select * from emp;
select * from emp2;

창1
delete from emp2 where deptno=10;

창2
update emp2 set comm=0 where deptno=10;
block 되는 거 확인 => 창1에서 commit or rollback 명령 수행하면 lock 풀림










