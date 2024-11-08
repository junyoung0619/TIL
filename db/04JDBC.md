# JDBC
- JDBC
- Board 실습 (Java)

## JDBC
### JDBC (Java DataBase Connectivity)
- JDBC
    - Java에서 가져오고 , 통로구축해서 SQL <-> data
    - JDBC = jar + MVN
- JDBC란?
    - Java 프로그램에서 DB에 일관된 방식으로 접근할 수 있도록 API를 제공하는 클래스의 집합
    - 데이터베이스에서 자료를 쿼리하거나 업데이트하는 방법을 제공
    - Java에서는 JDBC를 이용하여 SQL을 DBMS와 주고받음
    - DBMS의 종류에 관계없이 사용가능 (약간의 설정만 조금 수정하면 가능)
- JDBC 이용하여 DB 연결하는 방법 4단계
    - JDBC 드라이버 로드
        - 클래스로더를 통해 JVM 클래스 영역에 MySQL Driver을 올려 놓겠다.
    - 데이터베이스 연결 
        - URL, ID / PW
    - SQL문 실행
    - 데이터베이스 연결 끊음 close()
- JDBC 드라이버 로드
    - DB와 연결하기 위해서는 사용할 JDBC 드라이버를 프로그램 시작할 때 로딩
    - 필요한 DBMS의 jar 파일을 프로젝트에 추가한다.
    - java.lang.Class 클래스의 정적 메소드 forName()을 이용하여 JVM 안으로 클래스를 메모리에 적재
    - DriverManager를 통해 접근 가능
- DB별 Driver Clasee
    - MySQL : com.mysql.cj.jcbc.Driver
    - Oracle : orace.jdbc.driver.OracledDriver
    - SQL Server :com.Microsoft.sqlserver.jsdbc.SQLServerDriver
    - ...
- 데이터 베이스 연결
    - DriverManager 클래스의 static 메소드인 getConnection(URL, UserId, UserPassword)를 통해 연결 요청
    - `Connection conn = DriverManager.getConnection("URL","ssafy","ssafy");`
    - Connection은 인터페이스이므로 new 연산자를 통해 인스턴스를 생성하지 않고 만들어진 인스턴스를 얻어와 저장한다. (default는 Auto Commit)

- DB별 URL 
    - MySQL
    - Oracle
    - SQL server 
    - ... (검색을 하면 나온다.)

- SQL 시행 (Statement)
    - SQL문을 수행하기 위해서는 Statement 객체가 필요하다.
    - Connection 객체를 이용하여 createStatement() 메소드를 통해 생성한다.
    - executeQuery(String sql) : SELECT 문과 같이 결과값이 여러 개의 레코드로 구해지는 경우 사용
    - executeUpdate(String sql) : INSSERT, UPDATE, DELETE 문과 같이 테이블이 변경만 되고 결과가 없는 경우 사용 반환 값은 int형
- SQL 실행 (ResultSet)
    - Query에 대한 결과 값 처리
    - 반환 값이 여러 개인 경우에 이를 받아서 쉽게 처리할 수 있게 설계됨.
    - next()를 통해 현재 행에서 다음행으로 커서 이동
        - BOF(Begin Of File) / 데이터행들 / EOF(End Of File)로 되어 있는데 BOF에서 시작
    - getXXX (Column Name / index)를 통해 값을 가져올 수 있음
- SQL 실행 (PreparedStatement)
    - Statement의 단점을 극복한 인터페이스
    - 간단하게 쿼리문을 작성할 수 있도록 도움을 줌
    - Connection 인터페이스의 prepareStatement(String sql) 메서드를 통해 가져옴
    - executeQuery() / executeUpdate() 사용
    - SQL 문은 ? 기호를 사용해서 표현가능 ["INSERT INTO member VALUES(?,?,?,?)";]
    - ? 기호에 값을 setXXX(int 순서 / 실제 데이터나 변수)를 통해 할당해야 함.