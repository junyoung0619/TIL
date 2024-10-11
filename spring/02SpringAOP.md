# Spring AOP
- 관점 지향 프로그래밍
- Proxy
- Spring AOP
    1. XML
    2. Annotation


## 관점 지향 프로그래밍
### 관점 지향 프로그래밍
- AOP (Aspect Oriented Programming)
    - 어플리케이션 로직에는 핵심 기능과 부가 기능이 존재
    - 핵심 기능 : 객체가 제공하는 고유의 기능
    - 부가 기능 : 핵심 기능을 보조하기 위한 기능 (시간 측정, 로그 추적, 트랜잭션 관리 등)
    - 예를 들어 은행 프로그램에 있어 핵심 기능은 예금 인출, 예금 송금임.
        - 부가 기능으로 로그 추적, 보안 모듈 등이 있음
    - 실행전, 메인 기능, 실행 뒤(정상), 실행 뒤(비정상 작동), 진짜 끝(종료)일 때를 보통 고려함

    - OOP에서는 모듈화의 핵심 단위는 클래스인 반면, AOP에서 모듈화의 단위느 Aspect
    - Aspect는 여러 타입과 객체에 거쳐서 사용되는 기능 (Cross-Cutting, 트랜잭션 관리 등)의 모듈화
    - AOP는 OOP를 대체하는 것이 아닌 보조하는 목적
    - Core Concern (핵심 관심사항)
    - Cross-Cutting Concerns (공통 관심사항)
- AOP 용어
    - Target 
        - 핵심 기능을 담고 있는 객체 -> 부가 기능을 부여할 대상
    - Aspect 
        - 여러 클래스에 공통적으로 적용되는 공통 관심 사항 (AOP의 기본 모듈)
        - Advice + Point Cut
    - Join Point
        - Advice가 적용될 수 있는 위치 (메서드 실행, 생성자 호출 등)
        - Spring AOP에서는 메서드 실행 지점으로 제한
    - Point Cut 
        - Joint Point 중에서 Adviceㄹㄹ 적용하기 위한 조건 서술
        - Aspect 는 지정한 Point Cut에 일치하는 모든 Join Point에서 실행
    - Advice
        - 부가 기능, 특정 Join Point에서 취해지는 행동
        - Around, Before, After 등의 타입이 존재
    - Weaving 
        - Point Cut으로 결정한 Target의 Join Point에 Advice를 적용하는 것
        - 컴파일 시점, 클래스 로딩 시점, 런타임 시점에서 수행 가능하나 Spring AOP는 런타임에 수행
    - AOP Proxy
        - AOP를 구현하기 위해 AOP Framework에 의해 생성된 객체
        - Spring AOP는 JDK dynamic proxy 또는 CGLIB proxy 사용
- Point Cut 표현식
    - execution([접근제어자] 반환타입 [선언타입] 메서드 명(파라미터))
    - * 사용 가능 (모든이란 뜻)

|Point Cut|Join Point|
|---|---|
|execution(* *(..))|모든 메서드 실행 시 (모든 파라미터 포함)|
|execution(* remove(..))|remove 메서드 실행 시|
|execution(* set*(..))|메서드 명이 set으로 시작하는 모든 메서드 실행 시|
|execution(* com.ssafy.aop.*_*(..))|com.ssafy.aop패캐지의 모든 메서드 실행|
|execution(* com.ssafy.aop..*_*(..))|com.ssafy.aop패캐지 및 하위 패키지의  모든 메서드 실행|
|execution(* *(String))|파라미터가 String 인 메서드 실행 시|
|execution (* *())|파라미터가 없는 메서드 실행|
|execution (* *(*))|정확히 파라미터가 한 개인 메서드 실행 시 (모든 타입 허용)|
|execution (* *(String,..))|파라미터가 String으로 시작 하는 모든 메서드 실행 시|

## Proxy
### Proxy
- 프록시
    - 대리인
    - 프록시 서버는 클라이언트가 자신을 통해서 다른 네트워크 서비스에 간접적으로 접속할 수 있게 해주는 컴퓨터 시스템이나 응용프로그램을 가리킨다.
    - 접근 제어와 부가 기능 추가를 수행할 수 있다. 

## Spring AOP
### SPring AOP
- Advice Type
    - brfore - target 메서드 호출 이전
    - after - target 메서드 호출 이후, java exception 문장의 finally와 같이 동작
    - after returning - target 메서드 정상 동작 후
    - after throwsing - target 메서드 에러 발생 후
    - around - target 메서드의 실행 시기, 방법, 실행 여부를 결정
- Spring AOP Proxy
    - 실제 기능이 구현된 Target 객체를 호출하면, target이 호출되는 것이 아니라 advice가 적용된 Proxy 객체가 호출 됨
    - Spiring AOP 는 기본값으로 표준 JDK dynamic proxy를 사용
    - 인터페이스를 구현한 클래스가 아닌경우 CGLIN 프록시를 사용.
- Spring AOP 시작하기
    - 자바 언어에 관점 지향 프로그램을 적용할 수 있게 도와주는 표준화된 AOP Framework
    - pom.xml 에서  (Context 추가, aspectj, aspectjrt추가 하면 됨)
    - AOP namespace 추가
- Spring AOP 시작하기- xml 
    - 추가 (context schemma와 aop schemma합집합)
