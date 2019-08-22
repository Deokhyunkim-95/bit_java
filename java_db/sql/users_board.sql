drop table users;
create table users(
	id varchar2(10) constraint users_id_pk primary key ,
	password varchar2(10) constraint password_not_null not null,
	name varchar2(20),
	role varchar2(10) default 'user' check(role in ('user','admin'))
);

drop table board;
/* board table */
create table board(
	seq number(5) constraint board_seq_pk primary key,
	title varchar2(100) constraint title_not_null not null,
	content varchar2(1000),
	regdate date default sysdate,
	cnt number(5) default 0,
	id varchar2(10) constraint id_fk references users
);

insert into users values ('admin', '1234', '관리자', 'admin');
insert into users values ('java01', 'java01', '홍자바', 'user');
insert into users values ('java02', '1234', 'lee', 'user');
insert into users values ('java03', '1234', '홍길동', 'user');

insert into users(id, password, name) values ('java04', 'java04', '고길동');

/* 회원정보 수정 */
update users set role = 'user';
update users set password = '1234' where id='java01';

/* 로그인 */

select * from users where id = 'java01' and password = 'java01';
select * from users where id = 'java01' and password = '1234';

select * from users where id = 'java01' and password = '1234';

alter table board modify(title varchar2(40));
alter table board modify(content varchar2(100));

/* 게시판 글등록 */
create sequence seq;
drop sequence seq;


insert into board 
values (seq.nextval, 'java의 정석','java for while loop', '19/05/05', default, 'java');

insert into board 
values (seq.nextval, 'sql 더쉽게, 더 깊게', 'create grant select',
'19/02/24', default, 'JAVA');

delete  


drop sequence seq;

/* 글 수정 */
update board set content = 'jsp jps jspsdpf sjp', title ='jsp' where seq = 4;

/* 글 삭제 */
delete from board where title is null;

/* 데이터검색 */
select * from board 
where (lower(title) like lower('%PO%'))
or (lower(content) like lower('%PO%'));


/* 전체 등록글 수 */
select count(*) from board;

/* 사용자별 등록글수 */
select id, count(*) from board group by id;

/* 월별게시글수 */
select to_char(regdate,'mm') as 월, count(*)
from board
group by to_char(regdate,'mm');

/* 사용자별 게시글 검색 */
select * from board where id='java01';

/* 제목으로 게시글 검색 */
select id, title, regdate
from board
where title like '%sql%';