select * from employees;

select * from emp;
select * from dept;
select ename,hiredate from emp;
select ENAME,HIREDATE from EMP;
SELECT ENAME,HIREDATE FROM EMP;

desc dept;
select ENAME,SAL,comm from emp ;
SELECT ENAME,SAL,SAL*12,comm FROM EMP;
SELECT ENAME,SAL,SAL*12 as 년봉,comm FROM EMP;

SELECT ENAME,SAL,SAL*12 as "년    봉",comm FROM EMP;
SELECT ENAME,SAL,SAL*12 "년    봉",comm FROM EMP;

select Dname,loc from dept;	


conn hr/hr;
select * from emloyees;
select first_name,job_id,department_id from employees;


conn SCOTT/TIGER

--null을 포함한 산술식은 null
--nvl함수 nvl(comm,0) comm에 있는 null값은 0으로 바꿔준다 comm과,0의 데이터타입이 일치해야함
SELECT empno,ENAME,SAL,comm FROM EMP;
SELECT empno,ENAME,SAL,comm,sal+comm FROM EMP;
SELECT empno,ENAME,SAL,comm,sal+comm as 월급여 FROM EMP;

SELECT empno,ENAME,SAL,comm,nvl(comm,0) FROM EMP;
SELECT empno,ENAME,SAL,comm,nvl(comm,0), sal+nvl(comm,0) as 월급여 FROM EMP;
SELECT empno,ENAME,SAL,comm,nvl(comm,0), (sal+nvl(comm,0))*12 as 년봉 FROM EMP;

select empno,ename,mgr,deptno from emp;
select empno,ename,nvl(mgr,'CEO')as mgr,deptno from emp;
select empno,ename,nvl(to_char(mgr),'CEO')as mgr,deptno from emp;

--문자열 연결 연산자||
select empno, ename, deptno from emp;
select empno||'         '||ename||'        '||deptno from emp;
select empno,ename,sal||'원' from emp;

--dual 가상의 테이블
select 10*24*24 from emp;
select 10*24*24 from dual;

select sysdate from dual;

--중복제거 distinct
select job from emp;
select distinct job from emp;

select deptno from emp;
select distinct deptno from emp;

select * from emp;
--row 제한 where 절 사용 별칭 사용 안됨
select * 
from emp 
where deptno = 10;

--대소문자바꾸는 함수 upper() lower()
select *
from emp
where job = 'manager';

select *
from emp
where upper(job) = upper('MANAGER');

select sysdate from dual;

select *
from emp
where hiredate = '81/09/28';

--81/09/28 이후
select *
from emp
where hiredate > '81/09/28';

--81/09/28 이전
select *
from emp
where hiredate < '81/09/28';

select *
from emp
where hiredate <> '81/09/28';

select *
from emp
where hiredate != '81/09/28';

select *
from emp
where hiredate <='81/12/31' and hiredate >='81/01/01';

select *
from emp
where sal>=3000 and sal<=5000;

--between은 하한값은 먼저 쓴다.
select *
from emp
where sal between 3000 and 5000;

select *
from emp
where sal between 5000 and 3000;

select *
from emp
where sal not between 5000 and 3000;

select *
from emp
where deptno=10 or deptno=20;

select *
from emp
where deptno IN(10,20);

select *
from emp
where deptno NOT IN(10,20);

--10번이면서 DALLAS 이거나 30번이면서 CHICAGO를 찾는다.
select *
from dept
where (deptno,loc) IN ((10,'DALLAS'),(30,'CHICAGO'));

--like 연산자
select *
from emp
where ename like '%S%';

--M과T사이에 한글자가 있다.
select *
from emp
where ename like '%M_T%';

--81년도에 입사한 사원 목록
select *
from emp
where hiredate like '81%';

select *
from emp
where ename like 'A%' or ename like 'B%' or ename like 'C%' or ename like'D%';
--A~D가 들어간 놈들다 출력
select *
from emp
where regexp_like(ename,'A|B|C|D');
--A~D가 들어간 놈들다 출력
select *
from emp
where regexp_like(ename,'[A-D]');

--^ A~D로 시작 하는것
select *
from emp
where regexp_like(ename,'^[A-D]');
--$ A~D로 끝나는 것
select *
from emp
where regexp_like(ename,'[A-D]$');

--null 비교는 is
select *
from emp
where comm is null;

select *
from emp
where comm is not null;

--row 제한 where 절 사용 별칭 사용 안됨
select ename,sal,comm,sal+nvl(comm,0) as total
from emp
where sal+nvl(comm,0)>3000;

select ename,sal,comm,sal+nvl(comm,0) as total
from emp
where deptno=20;

--정렬 orderby 기본적으로 오름차순
select ename,sal,comm,sal+nvl(comm,0) as total,deptno
from emp
order by total;

select ename,sal,comm,sal+nvl(comm,0) as total,deptno
from emp
order by 2;

select ename,sal,comm,sal+nvl(comm,0) as total,deptno
from emp
order by deptno desc,total;


select *
from emp
where deptno = 30
order by sal;

select *
from emp
where deptno in(20,30)
order by sal;

select *
from emp
where deptno =any(20,30)
order by sal;

select *
from emp
where deptno != all(20,30)
order by sal;

select *
from emp
where deptno <> all(20,30)
order by sal;

--내장함수 p204 single row function

select * from dept;
select dname,loc from dept;
select dname,lower(dname),loc,lower(loc) from dept;

select round(45.5678), trunc(45.5678) from dual;
select round(45.5678,2), trunc(45.5678,2) from dual;

select sysdate,sysdate+30 from dual;

select ename, hiredate from emp;
select ename, hiredate, substr(hiredate,1,2)입사년도 from emp;

select sysdate ,to_char(sysdate,'YYYY') from dual;
select sysdate ,to_char(sysdate,'YY') from dual;
select sysdate ,to_char(sysdate,'day') from dual;

--emp 테이블에서 사원들의 입사월
select ename,hiredate, to_char(hiredate,'mm')as 입사월 from emp;

select sysdate ,to_date('2019/08/14') from dual

select sysdate ,to_date('08/14/19') from dual
select sysdate ,to_date('08/04/19','mm/dd/yy') from dual;

--nvl(a,b) 함수
select ename , mgr, nvl(to_char(comm),'_') from emp;
select ename , mgr, nvl(comm,0) from emp;

--nvl2(a,b,c) a가 null이 아니면 b null이면 c
select ename , mgr, nvl2(comm,comm,0) from emp;
select ename , nvl2(to_char(mgr),'o','x'), nvl2(comm,comm,0) from emp;
select ename , nvl2(mgr,'o','x'), nvl2(comm,comm,0) from emp;

--decode 함수
select ename,sal , deptno,decode(deptno,10,sal*1, 
										20,sal*2,
										30,sal*3,
										sal) as 계산 from emp; 
						












