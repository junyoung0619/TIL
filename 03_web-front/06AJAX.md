# JavaScript, AJAX
- JSON
- AJAX
- Appendix - this

## JSON
### JSON - JavaScript Object Notation
- JSON
    - {key : value} 형태로 이루어진 자료 표기법
    - JavaScript의 Object와 유사한 형태를 가지고 있지만
        - Object는 타입 (Type)
        - JSON은 형식이 있는 문자열 (String)
    - JSON을 Object로 사용하기 위해서는 변환 작업이 필요
- 변환
    - ` const myObject = { name:"haley", food: "pizza",age:20 }` 일 때
    - Object ->JSON 

    ``` js
        const objToJson = JSON.stringify(myObject)

                                // 어떤 값들이 출력될지 맞춰보세요.
        console.log(objToJson)        // {"name": "haley", "food": "pizza", "age":20}
        console.log(typeof objToJson) // {string}
        console.log(objToJson.age)    // undefined
        console.log(objToJson[0])     //
    ```

    - JSON -> Object

    ``` js
    const jsonToObj = JSON.parse(objToJson)
                                  // 어떤 값들이 출력될지 맞춰보세요.
    console.log(jsonToObj)            // {name: "haley", food: "pizza", age:20} // <- JSON -> Object 변환했을 때
    console.log(typeof jsonToObj)     // Object
    console.log(typeof jsonToObj.age) // number
    console.log(jsonToObj["age"])     //
    ```

## AJAX
### AJAX
- AJAX (Asynchronous JavaScript and XML)
    - 서버와 통신을 하기 위해서 `XMLHttpRequest` 객체를 활용
    - JSON, XML, HTML 그리고 일반 텍스트 형식 등을 포함한 다양한 포맷을 주고 받을 수 있음
    - 페이지 전체를 새로고침 하지 않고서도 수행되는 비동기성 (일부분만 업데이트 가능)
- 동작방식
    - 동기(synchronous)
        - 서버에 요청한 데이터가 도착할 때까지 클라이언트는 대기
    - 비동기 (asynchronus)
        - 서버에 요청한 데이터가 도착할 동안 클라이언트는 멈추지 않고 동작

- 순차적인 비동기 처리하기
    - Web API로 들어오는 순서는 중요하지 않고, 어떤 이벤트가 먼저 처리되느냐가 중요 (실행 순서 불명확)
    1. Async Callbacks
        - 백그라운드에서 실행을 시작할 함수를 호출할 때 인자로 지정
        - ex) addEventListener()의 두 번째 인자

    2. Promise-Style
        - Modern Web APIs에서의 새로운 코드 스타일
        - XMLHTTPRequest 객체를 사용하는 구조보다 조금 더 현대적인 버전         
        - ES6에 도입된 비동기 작업  
            - resolve - 성공
            - reject - 실패
- Async Callbacks vs Promise

|특징|Async Callbacks|Promise|
|---|---|---|
|코드 구조|함수 중첩이 많아 콜백 헬 발생 가능|.then() 체인으로 가독성 향상|
|에러 처리|중첩된 콜백마다 에러 처리가 필요|.catch()로 일괄 에러 처리 가능|
|가독성|중첩 시 가독성 저하|더 나은 가독성 제공|
|사용 편의성|간단하지만 코드가 복잡해질 수 있음|더 직관적이고 체계적인 비동기 코드 작성 가능|

## XMLHttpRequest
### AJAX
- XMLHttpRequest 객체
    - AJAX 요청을 생성하는 JavaScript API
    - 서버와 상호작용하기 위해 사용
    - 전체 페이지의 새로고침 없이도 URL로부터 데이터를 받아 올 수 있음
    - 사용자의 작업을 방해하지 않고 페이지의 일부를 업데이트 할 수 있음
    - AJAX 프로그래밍에 주로 사용
    - XML이라는 이름과는 다르게 모든 종류의 데이터를 받아 오는데 사용 가능
    - http 이외의 프로토콜도 지원 (file, ftp 포함)
    - 대부분의 브라우저에서 지원
- XMLHttpRequest 객체의 메서드 (method)
    - `open("HTTP method", "URL", sync/async)` (시작)
        - 요청의 초기화 작업
        - GET / POST 지정 (PUT/PATCH/DELETE)
        - 서버 URL 지정
        - 동기 / 비동기 설정
    - `send(content)` (끝)
        - GET 방식은 URL에 필요 정보를 추가 하기 때문에 null 적용
        - POST 방식에서 파라미터 설정 처리 
- XMLHttpRequest 프로퍼티 (property)
    - `onreadystatechange`
        - 서버에서 응답이 도착했을 때 호출될 콜백함수 지정
        - 콜백함수는 상태(readyState)가 변경될 때 마다 호출
    - `readyState`

    |0|UNSENT|객체 생성 후 open 메서드 호출 전|
    |---|---|---|
    |1|OPENED|open메서드가 호출되고 send 호출 전|
    |2|HEADERS_RECEIVED|send 메서드가 호출되었지만 서버 응답 전, 헤더와 상태 확인 가능|
    |3|LOADING|다운로드 중, 데이터의 일부가 전송된 상태|
    |4|DONE|모든 데이터 전송 완료|

    - status
        - 서버 처리 결과 상태 코드

    |200|OK|요청 성공|
    |---|---|
    |404|Not Found|페이지를 못 찾을 경우|
    |500|Server Error|서버에서 결과 생성 시 오류 발생|

    - `responseText`
        - 서버의 응답결과를 문자열로 받기
    - `responseXML`
        - 서버의 응답결과를 XML Document로 받기
- AJAX 프로그래밍 순서
    1. 클라이언트 이벤트 발생
    2. XMLHttpRequest 객체 생성
    3. XMLHttpRequest 객체 콜백함수 설정 (.onreadystatechange, .open)
    4. XMLHttpRequest 객체를 통한 비동기화 요청
    5. 서버 응답결과를 생성하여 클라이언트로 전송 (.send())
    6. XMLHttpRequest 객체는 서버 결과를 처리할 콜백함수 호출
        - readystate의 값에 따라 달리함
    7. 결과를 클라이언트 화면에 반영

### AJAX 로직
1. 클라이언트 이벤트 발생
    - 이벤트 발생 -> 사용자가 버튼을 클릭 시 js 함수 -resuestMsg를 호출
        - html
            - 표준 방식 `<input id="myBtn" type="button value="서버에 자료 요청">`
            - 고전 방식 `<type="button value="서버에 자료 요청" onclick="requestMsg()">`
        - script

            ``` js
            const myBtn = document.getElementById("myBtn")
            myBtn.addEventListener("click",requesMsg)

            function requestMsg(){
                ...//구현부
            }
            ```
2. XMLHttpRequest 객체 생성
- requestMsg 함수 구현부에 작성

```js
var xhr = new XMLHttpRequest()
console.log(xhr)
console.log("UNSENT",xhr.readyState) // redyState: 0 
```

3. XMLHttpRequest 콜백함수 설정
    - onreadystatechange 에 콜백함수의 이름 지정 

```js
xhr.onreadystatechange = responseMsg
console.log(xhr)
console.log(xhr.onreadystatechange)
```

4. XMLHttpRequest 객체를 통한 비동기화 요청
    - open 메서드에 요청방식, 호출페이지 등록

    ```js
    xhr.open("GET","rpofile.json",true);
    consoled.log("OPENED", xhr.readyState)
    ```

    - send 메서드로 전송

     ```js
    xhr.send(null);
    consoled.log("*STILL OPENED", xhr.readyState)
    ```


5. 6. 7. 서버 응답 결과를 처리할 콜백함수호출
    - readystate가 4이면 모든 데이터 전송 완료
    - status가 200이면 서버 데이터 요청 결과 성공

```js
if(xhr.readyState == 4) {
    if(xhr.status==200) {
        var msg = document.getElementById("msg")
        msg.innerHTML += xhr.responseText
    }
}
``` 