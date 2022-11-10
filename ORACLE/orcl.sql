SELECT    *
FROM    emp;
COMMENT ON COLUMN scott.emp.empno IS
    '사원번호';
COMMENT ON COLUMN scott.emp.ename IS
    '사원이름';
COMMENT ON COLUMN scott.emp.job IS
    '사원직책';
COMMENT ON COLUMN scott.emp.mgr IS
    '직속 상관의 사원번호';
COMMENT ON COLUMN scott.emp.hiredate IS
    '입사일';
COMMENT ON COLUMN scott.emp.sal IS
    '급여';
COMMENT ON COLUMN scott.emp.comm IS
    '급여 외 추가수당';
COMMENT ON COLUMN scott.emp.deptno IS
    '사원의 부서번호';

SELECT    *
FROM    bonus;
COMMENT ON COLUMN scott.bonus.ename IS
    '사원이름';
COMMENT ON COLUMN scott.bonus.job IS
    '사원직책';
COMMENT ON COLUMN scott.bonus.sal IS
    '급여';
COMMENT ON COLUMN scott.bonus.comm IS
    '급여 외 추가수당';

SELECT    *
FROM    dept;
COMMENT ON COLUMN scott.dept.deptno IS
    '부서명';
COMMENT ON COLUMN scott.dept.dname IS
    '부서이름';
COMMENT ON COLUMN scott.dept.loc IS
    '지역';

SELECT    *
FROM    salgrade;
COMMENT ON COLUMN scott.salgrade.grade IS
    '등급';
COMMENT ON COLUMN scott.salgrade.losal IS
    '최저급여';
COMMENT ON COLUMN scott.salgrade.hisal IS
    '최고급여';
COMMIT;

SELECT    empno,    ename
FROM    emp;

SELECT    job
FROM    emp;

SELECT DISTINCT    job
FROM    emp;

SELECT    job,    deptno
FROM    emp;

SELECT DISTINCT    job,    deptno
FROM    emp;

SELECT    COUNT(DISTINCT job)
FROM    emp;

SELECT    COUNT(*)
FROM    emp;

SELECT    COUNT(DISTINCT job) AS jobcount1
FROM    emp;

SELECT    COUNT(DISTINCT job) jobcount2
FROM    emp;

SELECT    *
FROM    emp
WHERE   deptno = 30;

SELECT    *
FROM    emp
WHERE    job = 'SALESMAN';

/* 
OPERATOR
= > < >= <=  != <> 같지않다
BETWEEN 범위지정  LIKE 패턴 검색  IN 포함여부
AND  OR  NOT
*/

SELECT    *
FROM    emp
WHERE    deptno <> 30;

SELECT    *
FROM    emp
WHERE
    job = 'CLERK'
    AND deptno = 20;

SELECT    *
FROM    emp
WHERE
    job = 'CLERK'
    OR deptno = 20;

SELECT    *
FROM    emp
WHERE
    NOT job = 'CLERK';

SELECT    *
FROM    emp
WHERE
    job = 'SALESMAN'
    AND NOT deptno = 20;

/*
    + - * /
*/

SELECT    *
FROM    emp
WHERE
    sal >= 100 * 10 - 100;

SELECT    *
FROM    emp
WHERE
    sal >= 100 * 10 - 100
ORDER BY
    sal ASC;

SELECT    *
FROM    emp
WHERE
    sal >= 100 * 10 - 100
ORDER BY 
    sal DESC;

SELECT    *
FROM    emp
ORDER BY
    deptno DESC,
    hiredate ASC;

SELECT    MAX(sal),    MIN(sal)
FROM    emp;

SELECT    AVG(sal)
FROM    emp
WHERE
    job = 'SALESMAN';

SELECT    SUM(sal)
FROM    emp
WHERE
    job = 'SALESMAN';

SELECT    COUNT(*),    SUM(sal),    AVG(sal)
FROM    emp
WHERE
    job = 'SALESMAN';

SELECT    *
FROM    emp
WHERE
    deptno NOT IN ( 10, 5, 4, 20, 100 );

SELECT    *
FROM    emp
WHERE
    sal BETWEEN 1000 AND 2000;

SELECT    *
FROM    emp
WHERE
    sal NOT BETWEEN 1000 AND 2000
    AND deptno NOT IN ( 10, 20 );

SELECT    *
FROM    emp
WHERE
    ename BETWEEN 'A' AND 'K';

SELECT    *
FROM    emp
WHERE
    hiredate BETWEEN '1981-01-01' AND '1981-06-06';
    
/*
    WILDCARDS
    %   여러개 대체하는 문자
    _   한개 대체하는 문자
    []  표현할 문자의 집합
    ^   제외 
    -   범위
    LIKE
*/

SELECT    *
FROM    emp
WHERE
    ename LIKE '%M%';

SELECT    *
FROM    emp
WHERE
    ename LIKE '%N_%';

SELECT    '우리집'    || '으로'    || '가자'
FROM    dual;
SELECT
    sysdate,
    systimestamp
FROM
    dual;

SELECT
    to_char(sysdate, 'YYYYMMDD'),
    to_char(sysdate, 'YYYY-MM-DD'),
    to_char(sysdate, 'YYYY/MM/DD'),
    to_char(sysdate, 'YYYY'),
    to_char(sysdate, 'MM'),
    to_char(sysdate, 'MON'),
    to_char(sysdate, 'D'),
    to_char(sysdate, 'DD'),
    to_char(sysdate, 'DDD'),
    to_char(sysdate, 'DAY'),
    to_char(sysdate, 'HH24'),
    to_char(sysdate, 'HH:MI:SS')
FROM
    dual;

SELECT    *
FROM    emp
WHERE
    deptno <= 20
UNION
SELECT    *
FROM    emp
WHERE
    deptno >= 20;

SELECT    *
FROM    emp
WHERE
    deptno <= 20
INTERSECT
SELECT    *
FROM    emp
WHERE
    deptno >= 20;

SELECT    *
FROM    emp
WHERE
    deptno <= 20
MINUS
SELECT    *
FROM    emp
WHERE
    deptno >= 20;

SELECT    *
FROM    emp
WHERE
    comm IS NOT NULL;
    
    SELECT *
    FROM EMP
    WHERE ENAME LIKE '%S';
    
    SELECT EMPNO
        , ENAME
        , JOB
        , SAL
        , DEPTNO
    FROM EMP
    WHERE DEPTNO=30 AND JOB='SALESMAN';
    
      SELECT EMPNO
        , ENAME
        , JOB
        , SAL
        , DEPTNO
    FROM EMP
    WHERE SAL > 2000 AND NOT DEPTNO=10;
    
      SELECT EMPNO
        , ENAME
        , JOB
        , SAL
        , DEPTNO
    FROM EMP
    WHERE SAL > 2000
    MINUS
      SELECT EMPNO
        , ENAME
        , JOBV
        , SAL
        , DEPTNO
    FROM EMP
    WHERE DEPTNO = 10;
    
    SELECT *
    FROM EMP
    WHERE SAL < 2000 OR SAL > 3000;
    
    SELECT ENAME
        , EMPNO
        , SAL
        , DEPTNO
    FROM EMP
    WHERE DEPTNO = 30 AND (SAL < 1000 OR SAL > 2000);
    
    SELECT *
    FROM EMP
    WHERE COMM IS NULL
        AND MGR IS NOT NULL
        AND (JOB = 'MANAGER' OR JOB = 'CLERK')
        AND NOT ENAME LIKE '_L%';
        
    UPDATE EMP_CURSOR
    SET EMPNO = 7701
    WHERE EMPNO = (SELECT EMPNO
                    FROM EMP
                    WHERE EMPNO=7702);
    
SELECT LEVEL FROM DUAL
CONNECT BY LEVEL <= 10;

SELECT * 
FROM ( SELECT ROWNUM AS NUM  FROM EMP E, EMP A)
WHERE NUM <25;

SELECT *
FROM ( SELECT 1 AS NUM FROM DUAL UNION ALL
        SELECT 2 FROM DUAL UNION ALL
        SELECT 3 FROM DUAL UNION ALL
        SELECT 4 FROM DUAL
);
    
SELECT LEVEL, EMPNO, ENAME, MGR, JOB
FROM EMP
START WITH JOB = 'PRESIDENT'
CONNECT BY PRIOR EMPNO=MGR
ORDER BY LEVEL;
    
SELECT LEVEL, EMPNO,
    CASE WHEN JOB='PRESIDENT' THEN ENAME
        ELSE LPAD('》',3*(LEVEL-1))||ENAME
    END AS ENAME
FROM EMP
START WITH JOB = 'PRESIDENT'
CONNECT BY PRIOR EMPNO=MGR;