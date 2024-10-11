USE `ssafy_corporation`;

# Q1. 사번이 7788인 사원의 부서 이름을 조회
SELECT dname
FROM dept
WHERE deptno = 20;

SELECT dname
FROM dept
WHERE deptno = 20;

SELECT dname
FROM dept
WHERE deptno = (SELECT dname
				FROM dept
				WHERE deptno = 20
);

# Q2. 매니저의 이름이 KING인 사원의 사번, 이름, 부서번호, 업무 
SELECT empno, ename, deptno, job
FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING');

# Q3. 7566번 사원보다 급여를 많이 받는 사원의 이름, 급여를 조회
SELECT ename, SAL
FROM emp
WHERE SAL > (SELECT SAL FROM emp WHERE empno = 7566);
# Q4. 20번 부서의 평균 급여보다 급여가 많은 사원의 사번, 이름, 업무, 급여조회
SELECT empno, ename, job, SAL
FROM emp
WHERE SAL > (SELECT AVG(SAL) FROM emp WHERE deptno = 20);

# Q5. 업무가 TURNER와 같고, 사번 7934인 직원보다 급여/가 많은 사원의 사번, 이름, 업무를 조회
SELECT empno, ename, job
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename='TURNER') AND SAL > (SELECT SAL FROM emp WHERE empno = 7934);

# Q6. 업무가 SALESMAN 인 직원들 중 최소 한명 이상보다 많은 급여를 받는 사원의 이름, 급여, 업무를 조회하시오.
SELECT ename, sal, job
FROM emp
WHERE sal > ANY ( SELECT sal FROM emp WHERE job = 'SALESMAN') AND job !='SALESMAN';

# Q7. 업무가 'SALESMAN'인 모든 직원보다 급여(커미션포함)를 많이 받는 사원의 이름, 급여, 업무, 입사일, 부서번호를 조회하시오.
SELECT ename, sal+ifnull(comm,0), job, hiredate, deptno
FROM emp
WHERE sal+ifnull(comm,0) > ALL (SELECT sal+ifnull(comm,0) FROM emp WHERE job = 'SALESMAN');

# Q8. 직원이 최소 한명이라도 근무하는 부서의 부서번호, 부서이름, 위치
SELECT deptno, dname, loc
FROM dept
WHERE deptno in (SELECT DISTINCT deptno FROM emp);

# Q9. 이름이 FORD인 사원과 매니저 및 부서가 같은 사원의 이름, 매니저번호, 부서번호를 조회 
SELECT ename, mgr, deptno
FROM emp
WHERE (mgr, deptno) = (SELECT mgr, deptno FROM emp WHERE ename = 'FORD') AND ename <> 'FORD';

# Q10. 각 부서별 입사일이 가장 빠른 사원의 사번, 이름, 부서번호, 입사일을 조회
SELECT empno, ename, deptno, hiredate
FROM emp
WHERE (deptno, hiredate) IN (SELECT deptno, MIN(hiredate) FROM emp GROUP BY deptno);

# Q11. 소속 부서의 평균 급여보다 많은 급여를 받는 사원의 이름, 급여, 부서번호, 입사일, 업무를 조회
SELECT ename, sal, deptno, hiredate, job
FROM emp e
WHERE sal > (SELECT AVG(sal) FROM emp WHERE deptno = e.deptno);
# Q12. 모든 사원의 평균급여보다 적게 받는 사원들과 같은 부서에서 근무하는 사원의 사번, 이름, 급여, 부서번호를 조회
SELECT e.empno, e.ename, e.sal, e.deptno
FROM emp e, (SELECT DISTINCT deptno FROM emp WHERE sal < (SELECT AVG(sal) FROM emp)) d WHERE e.deptno = d.deptno;
# Q13. 모든 사원에 대하여 사원의 이름, 부서번호, 급여, 사원이 소속된 부서의 평균 급여를 조회 (단, 이름 오름차순)
SELECT e.ename, e.deptno, e.sal, d.avgsal
FROM emp e, (SELECT deptno
# Q14. 사원의 이름, 부서번호, 급여, 소속부서의 평균 급여를 조회

# Q15. 부서번호가 10인 부서의 총 급여, 20인 부서의 평균 급여, 30인 부서의 최고, 최저 급여

# Q16. 모든사원의 번호, 이름, 부서번호, 입사일을 조회 (단, 부서이름기준으로 내림차순)

# Q17. 테이블을 카피 
