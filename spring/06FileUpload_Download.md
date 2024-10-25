# File Upload & Download
- File Upload
- File Download
- 생각해보기

## File Upload
### File Upload
- 파일 업로드
    - 클라이언트가 서버로 파일을 전송하는 과정을 말함
    - 여러 개의 파일을 업로드 할 수 있음
- 기존 방식의 Form
    - 기존에 사용하던 <form> 은 문자 위주의 데이터를 사용함
    - enctype="application/x-www-form-urlencoded" 기본 값 (생략가능)
    - HTTP Body에 문자로 key=value 형태로 전송하고, 여러 개의 데이터라면 &기호를 통해 구분 하였음
- 파일 업로드 방식의 Form
    - 파일은 문자가 아닌 바이너리 데이터를 전송
    - 파일만 전송하는 것이 아니라 다른 데이터를 같이 전송하기도 함.
    - `enctype="multipart/form-data".method ="POST"` 필수
    - 여러 개의 파일을 업로드 하고 싶다면 multiple="multiple" 속성 추가 필요

- MultipartFile
    - Spring Framework 에서 파일 업로드를 처리하기 위한 인터페이스 
    - 파일의 내용은 메모리에 저장되거나, 디스크에 임시로 저장
    - 사용자가 원하는 대로 세션수준 또는 영구 저장소에 파일의 내용을 복사할 책임이 있음
    - 임시 저장소는 요청이 끝나면 삭재
    - getOriginFilenmame() : 업로드 파일 명
    - transferTo() : 파일저장

## File Download
### File Download
- 파일 다운로드
    - 서버에 있는 파일을 클라이언트에게 전송하는 과정
- 파일 다운로드 view 생성하기
    - AbstractView를 상속하여 FileDownLodaView 작성하기
        - `extends AbstractView`
    - `renderMergedOutputModel` 메서드 재정의하기

## 생각해보기 
- 여러 개의 파일을 업로드   
    - 배열로 관리, 입력받을 때 multiple = "multiple" 추가
- 파일관리는 어떻게 할까?
    - 실습에서는 경로 상으로 이미지를 저장 
        - 감추고 싶다면? 
    - 게시판을 생성해서 A가 happy.jpg, B는 마루.jpg, C는 Bori.jpg를 올렸는데, C가 happy.jpg를 올린다면?
        - 한 경로에 저장하면 덮어써진다.
        - 사람별로 저장 (한 사람이 같은 이름을 올리게 될 수 있다.)
            - 따라서 고유한 ID를 저장 (저장시간, ID,...정보 추가)
            - UUID를 통해 이름을 교체해버림 
            - 다운받을 때 이상한 문자열 다운받으시겠습니까?가 뜨면 이상...
            - DB에는 진짜 이름과 UUID 이름을 저장하게 된다. (사용자에게는 진짜 이름을 노출시키고 요청은 UUID를 통해 날아간다.)
    