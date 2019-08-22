drop table board;
drop table users;

CREATE TABLE board (
    seq       INTEGER NOT NULL constraint add user_id primary key;
    title     VARCHAR2(50),
    content   VARCHAR2(1000),
    regdate   DATE,
    cnt       INTEGER,
    id        VARCHAR2(8) NOT NULL 
);

CREATE TABLE users (
    id         VARCHAR2(8) NOT NULL,
    password   VARCHAR2(20),
    name       VARCHAR2(20),
    role       VARCHAR2(20) default 'user'
);

alter table users add constraint user_id primary key(id);
alter table board add constraint board_seq primary key(seq);
alter table board add constraint board_fk foreign key (id) references users;

회원등록
insert into users(id,password,name,role) values ('aaa','111','aaa','manager');
insert into users(id,password,name) values ('bbb','222','bbb');
insert into users(id,password,name) values ('ccc','333','ccc');
insert into users(id,password,name) values ('ddd','444','ddd');
insert into users(id,password,name) values ('eee','555','eee');
insert into users(id,password,name) values ('fff','666','fff');
commit;
회원정보수정
update users set name='가길동' where id='aaa';
update users set name='나길동' where id='bbb';
update users set name='다길동' where id='ccc';
update users set name='라길동' where id='ddd';
update users set name='마길동' where id='eee';
update users set name='바길동' where id='fff';
commit;
로그인
select * from users where id = 'aaa' and password ='111';
select * from users where id = 'bbb' and password ='222';
select * from users where id = 'ccc' and password ='333';
select * from users where id = 'ddd' and password ='444';
select * from users where id = 'eee' and password ='555';
select * from users where id = 'fff' and password ='666';

게시판 글등록
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'가길동글','가길동글','2019/01/11',0,'aaa');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'가길동글','가길동글','2019/02/11',0,'aaa');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'나길동글','나길동글','2019/01/13',0,'bbb');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'다길동글','다길동글','2019/05/11',0,'ccc');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'다길동글','다길동글','2019/05/11',0,'ccc');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'라길동글','라길동글','2019/10/18',0,'ddd');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'바길동글','바길동글','2019/12/01',0,'fff');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'바길동글','바길동글','2019/08/12',0,'fff');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'바길동글','바길동글','2019/08/15',0,'fff');
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'바길동글','바길동글','2019/08/31',0,'fff');
commit;
글수정
update board set content = '가길동님의 글입니다' where title = '가길동글';
commit;
게시판 글 삭제
delete from board where seq=1;
commit;
데이터검색
select * from board where title = '가길동글';
전체 등록글 수
select count(*) as 등록글수 from board;
사용자별 등록글수
select id,count(*) as 등록글수 from board group by id order by id;
월별 개시글수
select to_char(regdate,'mm')as 월 ,count(seq) 
from board group by to_char(regdate,'mm') order by to_char(regdate,'mm');
사용자별 게시글 검색
select * from board where id= 'aaa';

제목으로 게시글 검색
select * from board where title = '바길동글';
