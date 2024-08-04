# Java
## Variable
- 변수 선언
    - 자료형 변수명; (선언)
    - 변수명 = 값; (할당)
    - 자료형 변수명 = 값; (초기화)
- 변수 작명 규칙
    1. 알파벳 문자와 숫자, '$','_'로 이루어진다. (한글도 가능)
    2. 중간에 공백 x
    3. 첫번째 문자는 반드시 알파벳, '$', '_'로 시작
    4. 대/소문자 구별
    5. 자바 언어 키워드 사용 x
- Data Type

| Type | keyword | Range |
| --- | --- | --- |
| 논리형 | boolean | true, false |
| 문자형 | char | 16비트 유니코드, 수치로는 0~65535 |
| 정수형 | byte | 8비트, -128~127 |
||short|16비트, -32768~32767|
||int|32비트 -2147483648~2147483647|
||long|64비트 -2^32~2^32-1|
| 실수형 | float|32비트, IEEE 754-1985표준|
||double|64비트, IEEE 754-1985표준|

- Automatic promotions (implicit Type Casting)
    - 작은 크기의 타입은 큰 크기의 타입으로 자동으로 형 변환 된다.
    - 정수형은 실수형으로 자동형변환 된다.

``` java
long var=100;
float fvar=var;
int ivar='A';
```

- Explicit Type Casting
    - 큰 크기의 타입을 작은 크기의 타입으로 변경할 경우
    - 실수형을 정수형의 타입으로 변경할 경우
    - identifier=(target_type) value;

``` java
float fvar=100;
long var=(long)fvar;
```

## 조건문
### if문

``` java
if( boolean_expression ) {
    Statements
    ..
}
```

``` java
if( boolean_expression ) {
    Statements
    ..
} else {
    Statements
    ..
}
```

``` java
if( boolean_expression ) {
    Statements
    ..
} else if( boolean_expression){
    Statements
    ..
} else  {
    Statements
    ..
}
```

### switch

``` java
switch (expr) {
    case 값1:
        statements;
        break;
    case 값2:              
        statements;
        break;
    case 값3:
        statements;
        break;
    default:
        statements;
}
```

- 여러가지 값 비교 시 사용
- expr은 반드시 정수형(int,byte,short,char)이어야 함
    - jdk 7이상 버전부터는 String도 비교 가능

## 반복문
### for문

``` java
for (init_expr;boolean_testexpr;alter_expr) {
    Statement or block;
    ...
}
```

``` java
for (type item:items) {
    Statement or block;
}
```

### while문
``` java
while (boolean) {
    Statement or block;
    ...
    ...
}
```

``` java
do {
    Statement or block;
    ...
    ...
} while(boolean)'
```

- label:, break label;,continue label; : `label명:`로 레이블을 설정하고 `break label명;` 로 그 레이블이 포함된 반복문을 나간다. `continue label명` 으로 레이블이 포함된 반복문 다음 반복을 시행함

# HTML & CSS
## HTML
### HTML is
    - Hyper Text Markup language
    - Markup Language, Not programming language
    - Markup Tag의 집합
    - W3C (World Wide Web Consortium)에서 표준관리
### HTML 문법
- Element(요소)  
    - content의 type을 지정
    - Element_name은 표준으로 정의
- Attribute(속성)
    - 생략가능
    - Element의 속성지정
    - Attribute_name과 value set을 표준으로 정의
- Comments(주석)
    - <!-- -->
    - 브라우저에선 표시되지 않음
    - 더 읽고 이해하기 쉬움
- Block level element
    - 새로운 행에 표시
    - 좌우 양쪽으로 최대한 늘어나 가능한 모든 너비를 차지함
    - EX) : div, p, h1, form, table, li ...
- Inline level element
    - 새로운 행에 표시 되지 않음
    - 필요한 너비만 차지함
    - ex) : span, a, img, input, label ...

### HTML Sections

- article
    - 문서의 독립적인 부분을 구성하는 섹션
    - 위젯 등 독립적인 아이템
    - 예: News, Blog Post, Article
    - article 요소를 중첩할 경우 외부 article 요소와 연관된 내용
- section
    - 일반적인 문서 또는 프로그램의 섹션
    - 제목으로 시작하는 컨텐츠의 의미적 그룹
- nav
    - 네이베이션 링크로 구성된 섹션
    - 다른 페이지 또는 동일 페이지의 다른 섹션 연결
- aside
    - 문서의 주 내용과 관련성이 낮은 내용
    - 일반적으로 사이드바 형태로 표현
    - 예: 사이트 링크, 광고, nav 요소 그룹
- footer
    - 꼬리말
    - 가장 가까운 선행하는 section의 footer
    - 작성자, 연관 링크, 저작권 등
    - address 또는 nav등의 요소를 포함

### HTML Grouping
- pre
    - Preformatted text
    - Block level element
    - 공백 문자와 줄 바꿈 문자를 보존
- ol
    - Ordered List
    - Block level element
    - Attributes

``` java
start=number
type={1|A|a|I|i}
```

- ul
    - Unordered List
    - Block level element
- li
    - List item
    - ol 또는 ul 안에서 하나의 item을 표현
    - Attributes
``` java
value=number, only within <ol>
```

- div
    - Block level element
    - Grouping block level elements
    - No visual changes

### HTML Text Level
- a
    - Anchor
    - Hyper link to another page
    - Inline level element
    - Attributes

``` java
href=URL
target={_blank | _parent | _self | _top|framename}
hreflang=language_code
```

- span
    - Inline level element
    - Grouping inline level elements
    - No visual changes

### HTML Embedded
- img
    - Defines an image
    - Inline level element
    - Attributes

``` java
src=URL
alt=text, 대체 text
height= pixels or %
width=pixels or %
usemap=#map_name
ismap=ismap
```

- audio
    - Audio 콘텐츠 재생
    - Attributes

``` java
src=URL
autoplay=autoplay, 자동 재생 여부
loop=loop, 반복 재생 여부
controls = controls, control 표시 여부
preload = {auto |metadata|none}
```

- video
    - Video 콘텐츠 재생
    - Attributes

``` java
src=URL
autoplay=autoplay, 자동 재생 여부
loop=loop, 반복 재생 여부
controls = controls, control 표시 여부
preload=preload
poster=URL, 재생 이전에 표시될 이미지
audio=muted
width=pixels
height=pixels
```

- source
    - Media 요소의 대체 미디어 자원 지정
    - 다양한 format을 지정하여 fallback 지원
    - Attributes

``` java
src=URL
media=media query
type=MIME_TYPE
```

### HTML Forms
- form
    - Block level element
    - 사용자 입력 Data를 Server로 전송
    - input 요소를 포함
    - Attributes

``` java
action=URL, HTTP Request URL
method={get|post}, HTTP Request Method
target={_blank | -self | _parent| _top | frame_name}, Result target
accept=MIME_TYPE
accept_charset=charset
enctype={ text/plain | multipart/form-data|application/x-www-form-urlencoded}
name=form_name
```

- input
    - User input
    - Inline level element
    - Elements for user input fields
    - Depending on the type attribute
    - Attributes

``` java
type={text:button|checkbox|radio|password|file|image|submit|reset|hidden}
name=name, HTTP Request parameter name
value=value, HTTP Request parameter value
disabled=disabled
alt=text,alternate text
```

- New Input Type


| 유형 | 설명 | 코드 |
| --- | --- | --- |
| 이메일 주소 | 이메일 주소 입력 | input type="email" |
| 웹 주소 | 웹페이지 주소 입력 | input type="url" |
|숫자(스핀박스)|숫자를 ^ v를 눌러 선택|input type="number"|
|숫자(슬라이드막대)|슬라이드 막대로 선택|input type="range"|
|날짜/시간|시간이나 날짜를 선택|input type="date"<br>input type="month"<br>input type="week"<br>input type="time"<br>input type="datetime"<br>input type="datetime-local"|
|검색상자|입력한 값을 전송|input type="search"|
|색상선택|색상을 선택|input type="color"|

## CSS
- Cascading Style Sheets
- HTML Element(Markup)의 시각적 표현(Appearancce) 정의
- CSS Levels
    - CSS, Earliest Draft in May, 1995
    - CSS Level1, W3C Official Recommendation in Dec, 1996
    - CSS Level2, W3C Official Recommendation in May, 1998
    - CSS Level3, WWorking Draft(Not yet Recommendation)
- 장점
    - 구조와 표현의 분리, Sementic Markup
    - File Size 감소
    - 효율적이고 정교한 디자인 제어
    - Browser 호환성에 대처 용이

### CSS 사용법
1. External Style Sheet, link

``` java
<head>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
```

2. Internal Style Sheet, style

``` java
<head>
    <style type="text/css">
        body {margin: 0;padding:0; }
        p {color:red;}
    </style>
</head> 
```

3. Inline Style

``` java
<p style="color:red; boder: 1px solid #000; "> This is a parapraph. </p>
```

### CSS 문법
![image](./css%20syntax.PNG)

### CSS Selector
- Selector (선택자)
    - 스타일을 지정할 대상 요소를 선택하는 데 사용하는 패턴 표기법
- Universal Selector

| Selector | Example | Description |
| --- | --- | --- |
| * | * | 모든 요소 선택 |

- Type Selector

| Selector | Example | Description |
| --- | --- | --- |
| element | div | 모든 div 요소 선택 |

- ID Selector

| Selector | Example | Description |
| --- | --- | --- |
| #id | #notice | id="notice"인 요소 선택 |

- Class Selector

| Selector | Example | Description |
| --- | --- | --- |
| .class | .head | class="head" 인 요소 선택|

- Attribute Selector

| Selector | Example | Description |
| --- | --- | --- |
| [attribute] | [type] | type 속성을 갖는 모든 요소 |
| [attribute=value] | [type=text] | type="text" 속성을 갖는 모든 요소 |
| [attribute~=value] | [type~=text] | type 속성의 값이 "text" 단어를 포함하는 모든 요소 |
| [attribute:=value] | [type:=text] | type 속성의 값이 "text" 단어로 시작하는 모든 요소 |

- Descendant Selector

| Selector | Example | Description |
| --- | --- | --- |
| element element | ul span | ul안에 위치한 모든 span 요소 선택 |

- Child Selector

| Selector | Example | Description |
| --- | --- | --- |
| element>element | li>span | li를 부모로 갖는 모든 span 요소 선택 |

- Link pseudo class

| Selector | Example | Description |
| --- | --- | --- |
| :link | a:link | unvisited links |
| :visited | a:visited | visited links |
| :active | a:active | active link |
| :hover | a:hover | mouse over 상태인 a 요소 |
| :focus | a:focus | focus를 갖는 a 요소 |