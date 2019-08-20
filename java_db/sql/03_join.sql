select * from EMP;

select
from
where
order by

select ename,sal from EMP where deptno=10;

select ename,sal from EMP order by deptno;
select ename,sal,deptno from EMP order by deptno;

--join 둘이상의 테이블을 합쳐서 하나의 큰 테이블로 만드는 방법
############################################
--join
############################################

select ename,dname
from emp,dept
where emp.deptno=dept.deptno;

select ename,dname,dept.deptno
from emp,dept
where emp.deptno=dept.deptno;

select ename,d.deptno as 부서번호 ,dname,loc
from emp e,dept d
where e.deptno=d.deptno;

select *
from emp e , dept d
where e.deptno=d.deptno;

select *
from emp e , dept d
where e.deptno=d.deptno and sal>2500;

#######################################
ANCI join 표준 ,=>join where=>on
#######################################
select ename,d.deptno,dname,loc
from emp e,dept d
where e.deptno=d.deptno;

오라클 join======> ANCI join

select ename,d.deptno,dname,loc
from emp e join dept d
on e.deptno=d.deptno;

## inner join 양쪽 테이블에 모두 있는 내용 출력

select ename,d.deptno,dname,loc
from emp e inner join dept d
on e.deptno=d.deptno
where sal > 2500;

########################################
outer join null을 표시해주는 방식
########################################

select * from emp;
select * from dept;

*** + null 쪽에 마킹해
select ename,sal,dname,loc,e.deptno
from emp e,dept d
where e.deptno(+)=d.deptno;

##right 쪽이 마스터 즉 dept 테이블이 마스터 테이블이 되어 모두 출력
select ename,sal,dname,loc,e.deptno
from emp e right outer join dept d
on e.deptno=d.deptno;

##left 쪽이 마스터 즉 emp 테이블이 마스터 테이블이 되어 모두 출력
select ename,sal,dname,loc,e.deptno
from emp e left outer join dept d
on e.deptno=d.deptno;


#############################################
non=equal join
#############################################

select * from salgrade;

select ename,sal,grade
from emp e , salgrade s
where sal between losal and hisal;

select ename,sal,grade
from emp e join salgrade s
on sal between losal and hisal;

#############################################
세개의 테이블 조인
#############################################

select ename , sal, dname, loc,grade
from emp e,dept d,salgrade s
where e.deptno = d.deptno and sal between losal and hisal
order by e.deptno;

select ename , sal, dname, loc,grade
from emp e,dept d,salgrade s
where e.deptno = d.deptno and sal between losal 
		and hisal 
		and e.deptno=20
order by e.deptno;

select ename , sal, dname, loc,grade
from emp
	join dept
	on emp.deptno = dept.deptno 
	join salgrade
	on sal between losal and hisal
where emp.deptno =10
order by emp.deptno;

select e.empno, e.ename as 사원명 ,e.mgr, m.ename as 상사명
from emp e,emp m
where e.mgr = m.empno(+);

==> 안시조인으로
select e.empno, e.ename as 사원명 ,e.mgr, m.ename as 상사명
from emp e inner join emp m
on e.mgr = m.empno;

select e.empno, e.ename as 사원명 ,e.mgr, m.ename as 상사명
from emp e left outer join emp m
on e.mgr = m.empno;

select e.empno, e.ename as 사원명 ,e.mgr, nvl(m.ename,'<CEO>') as 상사명
from emp e left outer join emp m
on e.mgr = m.empno;

##상사보다 급여가 많은 사원목록

select e.empno, e.sal,e.ename as 사원명 ,e.mgr,m.sal, m.ename as 상사명
from emp e,emp m
where e.mgr = m.empno(+) and e.sal > m.sal;

select e.ename, e.sal,dname,e.mgr, m.ename as 상사명, m.sal
from emp e 
	join emp m
	on e.mgr = m.empno
	join dept
	on e.deptno = dept.deptno
where e.sal > m.sal;

################################################################
집계함수
################################################################
select ename,round(sal) from emp;
select avg(sal) from emp;

select 
count(empno),count(co	),count(*),count(mgr),round(avg(sal)) as 평균급여 
from emp;

select count(job) from emp;
select  count(distinct job) from emp;

select sum(sal), count(*),round(avg(sal)),sum(sal)/count(*) from emp;

select round(avg(sal)) 평균급여 from emp;
select round(avg(sal)) 평균급여 from emp where deptno=10;
select round(avg(sal)) 평균급여 from emp where deptno=20;
select round(avg(sal)) 평균급여 from emp where deptno=30;
select round(avg(sal)) 평균급여 from emp where deptno=40;

select * from emp order by deptno;

select deptno , round(avg(sal)) 평균급여 
from emp
group by deptno;

select
from
where
group by
order by

##부서이름별 평균 급여 구하기
select emp.deptno, dname, round(avg(sal))
from emp,dept
where emp.deptno = dept.deptno
group by dname,emp.deptno
order by 1;

select emp.deptno, dname, round(avg(sal))
from emp 
	join dept
	on emp.deptno = dept.deptno
group by dname,emp.deptno
order by 1;

select max(sal),min(sal),count(*),avg(sal) from emp;

select deptno,max(sal),min(sal),count(*),avg(sal) 
from emp
group by deptno;

## 부서별 평균 급여가 2000이상인 부서 리스트 group을 다룬다음에 조건을 사용할때는 having절 사용
select emp.deptno, dname, round(avg(sal))
from emp 
	join dept
	on emp.deptno = dept.deptno
group by dname,emp.deptno
having avg(sal)>2000
order by 1;

#####################
# select			#
# from				#
# where				#
# group by			#
# having			#
# order by			#
#####################

select emp.deptno, dname, round(avg(sal)) as 평균급여
from emp 
	join dept
	on emp.deptno = dept.deptno
where sal > 1000
group by dname,emp.deptno
having avg(sal)>2000
order by 1;


## FORD 보다 급여를 많이 받는 사원 리스트
select sal 
from emp
where ename='FORD';

select *
from emp
where sal>3000;

select *
from emp
where sal>(select sal
		from emp
		where ename='FORD');

##평균 급여보다 적게 받는 사원 목록
select *
from emp
where sal<(select avg(sal)
			from emp);

##회사에서 가장 적은 급여를 받는사람의 리스트
select *
from emp
where sal = (select min(sal)
			from emp);
			
#####################################
스칼라 = 단일값  벡터 = 다중값
#####################################
			
##각각의 부서에서 적은 급여를 받는 사람의 리스트			
select *
from emp
where sal in (select min(sal)
			from emp
			group by emp.deptno);
			
##각각의 부서에서 많은 급여를 받는 사람의 리스트		
select *
from emp
where sal in (select max(sal)
			from emp
			group by emp.deptno);

select deptno,ename,sal
from emp
where (deptno,sal) 
in(select deptno,max(sal) from emp group by deptno);
			
##########################################
상관관계 서브쿼리 : outer 쿼리의 컬럼중 하나가 inner 쿼리문에서 사용되는 쿼리문
##########################################

## 자신이 속한 부서의 평균급여보다 적은 사원리스트

select *
from emp outer 
where sal < (select avg(sal) from emp where deptno=outer.deptno);

####################
rownum
####################

select rownum,ename,sal,hiredate
from emp;

select rownum,ename,sal,hiredate
from emp
order by sal desc;

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum < 4;

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum between 1 and 4;

##주의############################################################
select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum > 4;

select rownum,ename,sal,hiredate
from (select * from emp order by sal desc)
where rownum between 4 and 7;
--rownum이 1도 안만들어져서 4보다 큰거는 불가, 1부터 접근하는거는 가능하지만 중간부터 접근 불가
#################################################################
--page처리할떄 필요한 구문
select * from (
select rownum as row#,ename,sal,hiredate
from (select * from emp order by sal desc)
)
where row# between 11 and 15;
#################################################################


				start	end 
1page 1~5		5*0+1	+5
2page 6~10		5*1+1	+5
3page 11~15		5*2+1	+5
















