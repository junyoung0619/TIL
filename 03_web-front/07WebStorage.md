# Web Storage & Promise
- Web Storage
- ES6 문법
- Promise
- Fetch
- Appendix - async & await

## Web Storage
### Web Storage
- Web Storage API

    - `key:value` 키 : 값 쌍으로 값을 저장

    - `sessionStorage` 는 각각의 출처에 대해 독립적인 저장 공간을 페이지 세션이 유지되는 동안
        - 브라우저가 열려 있는 동안 제공
        - 세션에 한정해, 즉 브라우저 또는 탭이 닫힐 때 까지만 데이터를 저장
        - 데이터를 절대 서버로 전송하지 않음
        - 저장 공간이 cookie보다 큼 (최대 5MB) (cookie는 4KB)
    
    - `localStorage` 도 위와 같지만, 브라우저를 닫았다 열어도 데이터가 남아있음
        - 유효기간 없이 데이터를 저장하고, JavaScript를 사용하거나 브라우저 캐시 또는 로컬 저장 데이터를 지워야만 사라짐
        - 저장 공간이 cookie, session과 비교했을 때 가장 큼

- Storage
    - 속성(property)
        - `length` : 객체에 저장된 데이터 항목의 수를 반환
    - 메서드 (method)
        - `key(index)` : index번째의 키를 반환
        - `getItem(key)` : key에 해당하는 값 반환
        - `setItem(key, value)` : key가 존재하는 경우 재설정, 존재하지 않는 경우 value 추가
        - `removeItem(key)` : key를 저장소에서 제거
        - `clear()` : 모든 키를 저장소에서 제거

## ES6 문법
### ES6 문법
- ES6 (ECMAScript 6)
    - EMAMScript는 ECMA-262 기술 규격에 정의된 표준화된 스크립트 프로그래밍 언어
    - JavaScript 언어 등을 표준화 하기 위해 만들어짐
    - ES5(2009) -> EX6(2015): 추가적인 문법 요소들 등장
- 화살표 함수 (Arrow Function)
    - 함수를 심플하게 정의할 수 있도록 해줌
    - 형태
        - `(매개변수) => {명령어}`
- `let arrow = function(name) {return 'hello ${name}'}`
- 작성 순서
    1. `function` 키워드 생략 가능
        - `let arrow = (name) => {return 'hello ${name}'}`
    2. 함수의 매개변수가 오직 한 개라면 ()도 생략 가능
        - `let arrow = name => {return 'hello ${name}'}`
    3. 함수의 내용이 한 줄이라면 {}와 return 도 생략 가능
        - `let arrow = name => 'hello ${name}'`
    4. 인자가 없다면 () 나 _ 으로 표시 가능
        - `let arrow = () => { return 'No Arguments'}`
        - `let arrow = _ => { return 'No Arguments'}`

- 기본 파라미터 (Default Parameter)
    - 함수 파라미터의 기본값을 지정할 수 있음
    - 변수와 함수 모두 다 가능
    - 함수(매개변수명=값) 이런 형식으로 함 (파이썬의 기본인자와 동일)

- 나머지 파라미터 (Rest Parameter)
    - 여러 개의 파라미터 값들을 배열로 전달 받을 수 있ㅇㅁ
    - 매개변수 앞에 세개의 점 ... 을 붙여서 사용 가능 / 마지막에 ,붙이면 SyntaxError 발생
    - 파이썬의 argument list와 동일
    - 기본 파라미터와 함께 사용할 수 없음
    - 가변 파라미터는 항상 가장 마지막에 작성해야 함

- 구조분해 할당 (Destructuring Assignment)
    - 배열, 객체의 값들을 추출하여 한번에 여러 변수에 할당할 수 있음
    - 나머지, 배열, 객체 모두 할당 가능
    - 파이썬의 튜플 기능과 유사

- 객체 속성 표기법 개선
    - shorthand properties
    - concise method
    - 다음과 같이 지정되어 있다면

    ``` js
    const id = "ssafy"
    const name = "싸피"
    const age = 3 
    ``` 

    - ES6에서는 다음과 같이 쓸 수 있다.

    ``` js
    const member2 = {
        id,
        name,
        age,
        info() {
            console.log("info2")
        }
    }
    ```

- 모듈 (Module)
    - 독립성을 가진 재사용 가능한 코드 블록
    - 여러 개의 코드 블록을 각각의 파일로 분리한 후 필요한 모듈을 조합하여 사용 가능
    - import / export 구문을 이용하여 가져오거나 내보낼 수 있음

- 전개 연산자 (Spread Operaor)
    - 나머지 파라미터와 동일한 기호 `...` 사용
    - 배열이나 객체를 연산자와 함께 객체/배열 리터럴에서 사용하면 객체/배열 내의 값을 분해된 형태로 전달
    - 깊은 복사 수행 시 자주 사요

## Promise
### Promise
- 순차적인 비동기 처리하기 
    - Web API로 들어오는 순서는 중요하지 않고, 어떤 이벤트가 먼저 처리되느냐가 중요 (실행 순서 불명확)

    1. Async Callbacks
        - 백그라운드에서 실행을 시작할 함수를 호출할 때 인자로 지정
        - ex) addEventListener()의 두 번째 인자
    2. Promise-Style
        - Modern Web APIs에서의 새로운 코드 스타일
        - XMLHTPRequest 객체를 사용하는 구조보다 조금 더 현대적인 버전

- 콜백이란?
    - 함수를 매개변수로 전달하여, 나중에 실행하도록 하는 것
    - 콜백이 중첩되면, 콜백 헬이 되어 해석하고 유지보수하기 힘든 코드가 될 우려 (스파게티 코드)
    - 다음과 같은 느낌이다.

    ``` js
    function fun(successCallback, failureCallback){
        if(작업 성공시) {
            successCallback();
        } else {
            failureCallback();
        }
    }
    ```

- Promise Object
    - 비동기 작업을 마치 동기 작업처럼 값을 반환해서 사용 형태
    - 미래의 완료 또는 실패와 그 결과 값을 나타냄.
    - 미래의 어떤 상황에 대한 약속
    - `new Promise (function(resolve,reject))`

    - `resolve` - 성공 시 사용
    - `reject` - 실패 시 사용

``` js
const promise = new Promise((resolve, reject)=>{
    resolve('resolve'); // -> then 부분을 실행
    // reject('reject') // -> catch 부분을 실행
}) 

promise
    .then((data) => {
        console.log(data);
    })
    .catch((data)=> {
        console.log(data);
    })

```

- Promise Methods
    - `.then(callback)`
        - Promise 객체를 리턴하고 두 개의 콜백 함수를 인수로 받는다 (이행 했을 때, 거부 했을 때)
        - 콜백 함수를 이전 작업의 성공 결과를 인자로 전달 받음.

    - `.catch(callback)`
        - .then이 하나라도 실패하면(거부되면) 동작 (예외 처리 구문 유사)
        - 이전 작업의 실패로 인해 생성된 error 객체는 catch 블록 안에서 사용 가능
    - `.finally(callback)`
        - Promise 객체 반환
        - 결과 상관없이 무조건 실행
    - 체이닝 가능

## Fetch
### Fetch
- fetch API
    - XMLHttPRequest보다 강력하고 유연한 조작이 가능
    - Promise를 지원하므로 콜백 패턴에서 자유로움
    - ES6문법이 아닌 BOM(Browser Object Model) 객체 중 하나 
    - `fetch()` 메서드 사용
    - `fetch()` HTTP 응답을 나타내는 Response 객체를 래핑한 Promise 객체를 반환
- `fetch(resource,options)` 메서드
    - resource: 리소스가 위치한 URL 지정
    - options : 옵션을 지정
        - method : HTTP method
        - headers : 요청 헤더 지정
        - body : 요청 본문 지정
    - fetch 메서드는 Promise 객체를 반환
- `fetch()` 가 반환하는 Promise 객체
    - 성공시 `.then()` 을 이용해 처리
    - 실패시 `.catch()` 을 이용해 처리

- fetch 사용 예
    - fetch 메서드는 HTTP 응답을 나타내는 Response 객체를 래핑한 Promise 객체를 반환
    - `response.text()` : Response의 Body를 텍스트의 형태로 반환
    - `response.json()` : Response의 Body를 JSON 파싱하여 반환

``` js
fetch(URL)
    .then((response)=>response.text())
    .then((text)=>JSON.parse(text))
    ...
```

## async & await
- async & await
    - Promise 더욱 편하게 사용할 수 있는 문법
    - then 체이닝을 제거하고 비동기 코드를 동기 코드처럼 표현하는 방법

- async
    - function 앞에 위치
    - 항상 Promise 반환

- await 
    - await 키워드를 만나면 Promise가 처리될 때까지 기다린다.