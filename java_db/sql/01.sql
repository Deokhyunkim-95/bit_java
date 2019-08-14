

alter user hr identified by hr account unlock;

sqlplus hr/hr

select * from tab;

--tablespace생성
create tablespace bit
datafile 'c:\lib\bit.dbf'
size 30M
autoextend on next 2M maxsize UNLIMITED;

-- 계정생성
create user test01 identified by 1234
default tablespace bit;

--계정권한부여 test01/1234
grant connect to test01;

select * from tab;
--권한회수
revoke connect from test01;

grant connect,resource to test01;
--계정삭제
drop user test01 cascade;

--connect는 conn하고 같다.

-- 계정생성 SCOTT/TIGER
create user SCOTT identified by TIGER
default tablespace bit;

GRANT CONNECT,RESOURCE TO SCOTT IDENTIFIED BY TIGER;

ALTER USER SCOTT DEFAULT TABLESPACE bit;
ALTER USER SCOTT TEMPORARY TABLESPACE TEMP;

@c:\lib\scott.sql

show linesize;
set linesize 300;

show pagesize;
set pagesize 20;

--오라클 휴지통비우기
purge recyclebin;
--화면 클리어
cl scr
 
--관리자에서만 사용
select tablespace_name from dba_tablespaces;

