# Spring DI
- Spring Framework
- 의존관계 역전
- 의존성 주입
- Spring Container Build
- Spring DI
    1. XML
    2. Annotation
    3. Java Config

## Spring Framework
### Spring Framework
- Framework? (공부한다는 것은? = 사용하는 방법을 익히는 것!)
    - 사전적 의미 : (건물 등의) 뼈대, (판단/결정 등을 위한) 틀
    - SW에서의 의미 : SW 특정 문제를 해결하기 위해서 상호 협력하는 클래스와 인터페이스의 집합
- Framework 왜 사용하는가?
    - 웹 어플리케이션을 개발하기 위해서는 많은 기본 기능을 설계, 작성해야 한다. (요청처리, 세션관리, 리소스 관리, 멀티 쓰레드 등)
    - 공통으로 사용되는 기본기능들을 일관되게 사용할 수 있으며 개발자는 웹 어플리케이션 기능 자체 개발에만 신경을 쓰면 되기 때문에 생산성이 높아진다.
    - 개발자 입장에서는 완성된 구조에 맡은 기능을 개발하여 넣어주면 되기 때문에 개발 시간을 단축할 수 있다.
    - 라이브러리와의 차이 : 제어의 역전이 일어나는지 아닌지의 차이
        - 라이브러리는 메서드를 호출하는 시점을 개발자가 결정
        - 프레임워크는 메서드를 호출하는 시점이 프레임워크에 의해 결정됨
- Spring Framework의 등장
    - 자바에서는 EJB(Enterprise JavaBeans)를 이용하여 엔터프라이즈 급 어플리케이션 제작
        - 경량 컨테이너 사용
        - 의존성 주입
        - AOP
        - POJO
        - 등의 개념 등장
        - (참고) Spring은 설정이 반이다. -> SpingBoot 등장 
- Spring Framework의 특징
    - POJO(Plain Old Java Object) 방식의 프레임워크
        - POJO는 객체다라고 생각해보 무방
    - 의존성 주입(Dependency Injecttion)을 통한 객체관계 구성
    - 관점지향 프로그래밍(AOP, Aspect Iriented Programming)
    - 제어 역전(IoC, Inverision of Control) - 프레임워크가 알아서 제어를 해준다.
    - 높은 확장성과 다양한 라이브러리
    - ...
- 왜 Spring Framework를 사용해야 하는가
    - Spring is everywhere
        - 전세계 많은 개발자들이 스프링을 사용하고 있다. (Alibaba, Amazon, Google, Microsoft)등
    - Spring is flexilble
        - 유연하고 포괄적인 외부 라이브러리 확장을 통해 다양한 형태의 애플리케이션 개발가능
    - Spring is Fast
        - 기본적으로 빠른 시작 / 종료 / 최적화된 실행을 확인할 수 있다.
    - Spring is productive
        - Spring boot는 프로그래밍 접근 방식을 변환하여 작업량을 줄여준다. 또한 애플리케이션 컨텍스트 및 웹서버 등을 결합하여 간단한 프로그래밍을 쉽게 해준다.
    - Spring is secure
        - 업계 표준 보안 체게와 쉽게 통합할 수 있고, 기본적으로 신뢰할 수 있는 솔루션을 제공한다.
    - Spring is supportive
        - 커뮤니티가 잘 발달해 있으며, 빠른 시작, 가이드, 자습서 등의 리소스를 지원하고 있다.

## 의존관계역전
### 의존관계역전
- 프로그래머와 컴퓨터
    - Class A 객체가 어떤 일을 처리하기 위해서 Class B의 객체의 도움을 받아야만 일을 처리할 수 있다면 'Class A는 Class B에 의존한다'라고 표현
- Programmer가 Desktop 클래스에 의존성을 가지고 있다면 수정하여 객체생성 의존성 제거
    - 객체의 의존은 구현체가 아닌 추상체가 해야함
    - 컴퓨터가 desktop과 laptop사이를 왔다갔다해도 프로그래머의 코드에 수정이 일어나지 않음
- 느슨한 결합 : 역할과 구현을 분리 (한 객체가 바껴도 나머지 객체가 바뀌지 않음)
    - 외부에서 Desktop or Laptop를 생성

## 의존성 주입
### 의존성 주입
- 프로그래머 의존성 주입 (생성자 이용)
    - 매개변수로 넣기
- 프로그래머 의존성 주입 (설정자 이용)
    - setter
- 프로그래머 의존성 주입 (메서드 이용)
    - 여러 개 주입
- 프로그래머 의존성 주입 (Factory 이용)

## Spring Container Build
### Spring Container Build
- Spring IoC Container
    - Container?
        - 스프링에서 핵심적인 역할을 하는 객체를 Bean이라고 하며,
        - Container는 Bean의 인스턴스화 조립, 관리의 역할, 사용 소멸에 대한 처리를 담당한다.
            - BeanFactory
                - 프레임워크 설정과 기본기능을 게종하는 컨테이너
                - 모든 유형의 객체를 관리할 수 있는 메커니즘 제공
            - ApplicationContext
                - BeanFacotry 하위 인터페이스
                - 이벤트 처리, 국제화용 메시지 처리 등 다양한 기능 제공
            - WebApplicationContext
                - 웹 환경에서 Spring을 사용하기 위한 기능이 추가됨
                - 대표적인 구현 클래스로 XmlWebApplicationContext가 있음
- 스프링 설정 정보 (Spring configuration metadata)
    - 애플리케이션 작성을 위해 생성할 Bean과 설정 정보, 의존성 등의 방법을 나타내는 정보
    - 설정정보를 작성하는 방법은 XML 방식, Annotation 방식, Java config 방식이 있다.
- Spring Container 빌드
    - Project 생성 후 Maven Project로 변경 (처음부터 Maven Project쓰면 이것저것 써야 해서 바꾸는게 좋음)
    - pom.xml -> Spring Context 의존성 추가 
    - Source Folder 생성 (resources) (동일 경로이나 분리된 것처럼 보임)

    - 스프링 설정파일 생성 (XML 파일 ->applicationContext.xml)
    - 설정 공식 홈페이지에서 복사 가져오기

    - 빈(Bean) 등록 (풀패키지명 작성)

    - 스프링컨테이너를 이용하여 객체 가져오기
    
    - 객체를 getBean() 해서 여러 개 가져와 보자
        - 기본적으로 Object로 가져오기 때문에 형변환 함(가져올때부터 설정할 수도 있음)
            - `(Programmer)context.getBean("programmer");`
            - `context.getBena("programmer",Programmer.class);`
        - 기본적으로 bean 객체는 싱글턴으로 관리됨
- Bean Scope
    - Bean 정의를 작성하는 것은 Bean 객체를 생성하는 것과 다르다.
    - Bean 범위(Scope)를 정의해서 객체의 범위를 제어할 수 있다.
    - Scopes

|Scope|설명|
|---|---|
|singleton|기본값, Spring IoC 컨테이너에 대한 단일 객체 인스턴스 |
|prototype|빈을 요청할 때마다 새로운 인스턴스 생성|
|request|HTTP Request 주기로 bean 인스턴스 생성|
|session|HTTP Session 주기로 bean 인스턴스 생성|
## Spring DI
### Spring DI - XML
- constructor-arg, property와 같은 것은 방식을 의미하고 ref=""로 대상을 설정

- 의존성 주입 (생성자)
    - constructor-arg를 이용하여 의존성 주입
    - <ref>, <valiue>와 같이 하위 태그를 이용하여 설정 or 속성을 이용하여 설정
- 의존성 주입 (설정자)
    - setter를 이용하여 의존성 주입
    - setter함수에서 set을 뺀 나머지 이름을 소문자로 name에 설정
    - <ref>, <value>와 같이 하위 태그를 이용하여 설정 or 속성을 이용하여 설정
### Spring DI - Annotation
- 빈 (Bean) 생성 및 설정 (@Component)
    - Bean 생성 - @Component
    - 생성되는 bean의 이름은 클래스의 첫 글자를 소문자로 바꾼 것이다. 예) Desktop -> desktop
        - @Component(value= "bean-name")으로 이름 지정 가능
    - 스프링은 @Component, @Service, @Controller, @Repository 의 Stereotype Annotation을 제공
    - 각 @Repository, @Service, @Controller는 목적에 맞는 구체적인 사용을 위한 @Component의 확장, 목적에 맞게 구체화하여 사용하면 Spring에서 더 효율적으로 사용 가능
    - `<context:compoent-scan base-package = "패키지명"></context:compoent-scan>` Annotation 방식으로 Bean을 등록, 의존성 설정을 위해서 대상 패키지를 지정
- 의존성 주입 (@Autowired)
    - 의존성을 주입할 대상에 @Autowired annotation 작성
    - Spring 컨테이너 내에서 타입 매칭 시행 (컨테이너에 해당하는 타입의 bean이 있다면 매칭)
- @Autowired 사용 가능 위치
    - 생성자
        - 생성자를 하나만 정의한다면 @Autowired 생략가능 
    - Setter
    - field
        - Setter, field 모두 @Qualifier를 이용하여 같은 타입이 여러 개일 경우 bean을 지정하여 식별가능
- Java Config
    - @Configuration쓰면 설정 파일로 인식
        - @Bean으로 다 지정해도 되고
        - @ComponentScan(basePackages = {"패키지명"}) 으로 하면 annotation 방식처럼 쓸 수 있다.