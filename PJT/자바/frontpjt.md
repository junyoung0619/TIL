# Front-end pjt
- Bootstrap
    - Components
    - Utilities
    - Layout
- Git
    - branch, merge, conflict
- Github Pull Request
- Front-end PJT 소개

## Bootstrap
### Bootstrap
- CDN : Content delivery(Distribution) network
    - 인터넷 콘텐츠를 고속 전송하는 지리적으로 분산된 서버 집단
    - HTML / CSS / JS / 이미지 등 인터넷 콘텐츠를 로드 하는데 필요한 자산을 신속하게 전송할 수 있다.

## BootStrap(Components)
### BootStrap(Components)
- Alerts
    - 유연한 경고 메시지를 이용하여 사용자 작업에 대한 상황 별 피드백을 제공
- Badges
    - 배지를 이용하여 작은 정보 구성
    - 배지는 em을 이용하여 직계 상위 요소의 크기에 맞게 조절됨
- Buttons
    - 부트스트랩에서는 버튼의 다양한 크기와 상태 등을 지원
    - 여러 옵션으로 색깔 조절 가능 
- Card
    - 다양한 변형 및 옵션을 포함하고 확장 가능한 카드 컨테이너를 제공
- Carousel
    - 회전 목마와 같이 이미지 또는 텍스트가 순환하는 슬라이드 쇼 구성
- Dropdowns
    - 드랍다운 메뉴를 사용할 수 있다.
- Modal 
    - 팝업이 아니라 사용자 화면을 하나 띄워 사용할 수 있음
- Navs & tabs &Navbar
    - Navigation을 위해 목록을 사용할 수 있다.
- Pagination
    - 여러 페이지의 존재를 알리기 위해 페이지를 표시할 수 있다.

## BootStrap(Utilities)
### BootStrap(Utilities)
- Background & Colors
    - 배경색, 텍스트 컬러 등을 지정할 수 있다. (.bg, .txt)
- Borders
    - 테두리에 대한 설정을 손쉽게 할 수 있다.
- Flex
    - flexbox를 손 쉽게 사용할 수 있다.
- Sizing
    - 반응형 크기를 쉽게 조절 가능
- Spacing
    - 왼쪽에서 오른쪽 LTR (), 반대는 RTL

## BootStrap(Lauout)
### BootStrap(Layout)
- Grid
    - 12개의 열과 6가지의 반응형 계층으로 조절

## Git 상태 관리
### Git 상태 관리
- Git 상태 관리
    - git (로컬)
        - working directory: .git에 있는 파일들 git add .으로 staging area로 보냄
        - staging area: commit할 준비가 완료된 것들 git commit -m '메시지'로 commit 가능
        - git log --one line으로 commit 상태 확인가능
        - git push로 github에 보냄
    - github (원격저장소, 클라우드)
        - repository
## Git Branch
### Git Branch
- Git Branch
    - 나뭇가지
    - 여러 갈래로 작업 공간을 나누어 독립적으로 작업할 수 있도록 도와주는 Git의 도구
- main(아니면 master)은 완벽해야 하며 이를 하기 위해 다른 브랜치를 만들어 중간 과정들을 저장해줌 main-develop-feature 이런식으로 많이 사용
- Git Branch의 필요성
    - 각 Branch는 독립 공간을 형성하기 때문에 원본 master|| main에 대해서 안전하게 보호
    - 하나의 작업은 하나의 Branch로 나누어 진행되어 체계적인 개발이 가능
        - 협업에 
- 명령어
    - 브랜치 목록 확인
        - `git branch` : 로컬 저장소
        - `git branch -r` : 원격 저장소
    - 새로운 브랜치 생성
        - `git branch <브랜치 이름>` 꺽새는 안써도 됨
    - 특정 커밋 기준으로 브랜치 생성
        - `git branch <브랜치 이름> <커밋 ID>` : 커밋 ID는 git log --oneline후 앞자리 7자리로 사용하면 됨
    - 브랜치 삭제 확인
        - `git branch -d <브랜치 이름>` : 병합된 브랜치만 삭제
        - `git branch -D <브랜치 이름>` : (주의) 강제 삭제  
    - 브랜치 이동
        - `git switch <브랜치 이름>`
        - `git checkout <브랜치 이름>`
    - 새로 생성과 동시에 이동
        - `git switch -c <브랜치 이름>`
    - 특정 커밋 기준으로 브랜치 생성과 동시에 이동
        - `git switch -c <브랜치 이름> <커밋 ID>`
- 주의사항
    - `git branch` 하기 전에 1회 이상의 커밋이 반드시 존재해야 함
        - 버전을 기준으로 branch를 만들기 때문에 commit이 있어야 함
    - 브랜치를 이동하기전에는 반드시 커밋을 하고 이동
        - ex
            1. `master`, `develop` 브랜치 이동
            2. `develop` 브랜치에서 test2.txt를 만들고 커밋하지 않은 상태로 `master` 브랜치로 이동하게 되면 test2.txt이 `master` 브랜치에 남아있음
            3. 브랜치를 이동하기 전에, 꼭 커밋 후 이동

## Git Merge
### Git Merge
- Git Merge
    - 나눠진 브랜치를 하나로 합치는 명령어
- Git 명령어
    - `git merge <합칠 브랜치 이름>`

- Conflict
    - 로컬에서 해결 - VSCode
    - GitHub에서 해결

## Github Pull Request
- Git hub Pull Request
    - A 브랜치에서 변경된 사항을 B브랜치로 Pull 받아주세요
