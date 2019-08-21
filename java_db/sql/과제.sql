CREATE TABLE board (
    seq       INTEGER NOT NULL
    title     VARCHAR2(50),
    content   VARCHAR2(1000),
    regdate   DATE,
    cnt       INTEGER,
    id        VARCHAR2(8) NOT NULL 
)

CREATE TABLE users (
    id         VARCHAR2(8) NOT NULL,
    password   VARCHAR2(20),
    name       VARCHAR2(20),
    role       VARCHAR2(20) default user
)

alter table users add constaraint user_id primary key(id);
alter table board add constaraint board_seq primary key(seq);
alter table board add constaraint board_fk foreign key (id) references users;

회원등록
insert into users(id,password,name) values ('fff','111','fff');
회원정보수정
update users set name='abc' where id='abc';
로그인
select * from users where id = 'aaa' and password ='111';
게시판 글등록
insert into board(seq,title,content,regdate,cnt,id) 
values((select nvl(max(seq),0)+1 from board)  ,'zxcv','1234','2019/05/11',0,'fff');
글수정
update board set title = 'abc' where title = 'aaa';
게시판 글 삭제
delete from board where seq=1;
데이터검색
select * from board where title = 'abc';
전체 등록글 수
select count(*) as 등록글수 from board;
사용자별 등록글수
select id,count(*) as 등록글수 from board group by id;
월별 개시글수
select to_char(regdate,'mm')as 월 ,count(seq) 
from board group by to_char(regdate,'mm') order by to_char(regdate,'mm');
사용자별 게시글 검색
select * from board where id= 'aaa';

제목으로 게시글 검색
select * from board where title = 'zxcv';
