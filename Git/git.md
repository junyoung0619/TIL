# Git 
* 분산 버전 관리 시스템
* 코드의 '변경 이력'을 기록하고 '협업'을 원활하게 하는 도구
### 버전 관리: 변화를 기록하고 추적하는 것
* 구글 docs에도 버전 관리 기능이 있음
* 각 버전은 이전 버전으로부터의 변경사항을 기록하고 있음

### 중앙 집중식
* 버전은 중앙 서버에 저장되고 중앙 서버에서 파일을 가져와 다시 중앙에 업로드 - 중앙 컴퓨터 터지면 다 날아감

### 분산식
* 버전을 여러 개의 복제된 저장소에 저장 및 관리- 동기화만 주기적으로 잘 해주면 1개의 컴퓨터가 터져도 괜찮다.

## 분산 구조에서의 장점
* 중앙 서버에 의존하지 않고도 동시에 다양한 작업 수행 가능
    * 개발자들 간의 직업 충돌을 줄여주고 개발 생산성을 향상
* 중앙 서버의 장애나 손실에 대비하여 백업과 복구가 용이
* 인터넷에 연결되지 않은 환경에서도 작업을 계속할 수 있음
    * 변경 이력과 코드를 로컬 저장소에 기록하고, 나중에 중앙 서버와 동기화

## Git의 역할
* 코드의 버전(히스토리)를 관리
    * 개발되어 온 과정 파악
* 이전 버전과의 변경 사항 비교 

## Git의 영역
* Working Directory, Staging Area, Repository로 구분됨
### Working Directory
* 실제 작업(수정, 생성, 삭제) 중인 파일들이 위치하는 영역
* `git status` 붉은 색으로 파일 명 표시
* 해당 영역에 있는 파일은 commit에 기록되지 않음 (Staging Area로 이동시켜야 가능)
### Staging Area
* Working Directory에서 변경된 파일 중, 다음 버전에 포함시킬 파일들을 선택적으로 추가하거나 제외할 수 있는 중간 준비 영역
* 실질적으로 버전관리 파일을 선별하는 공간
* `git status`로 확인을 종종할 필요가 있다.
### Repository
* 버전 이력과 파일들이 영구적으로 저장되는 영역
* 모든 버전과 변경 이력이 기록됨.
### Commit
* 버전
* 변경된 파일들을 저장하는 행위이며, 마치 사진을 찍듯이 기록한다 하여 'snapshot'이라고도 함
* `git log`로 commit 이력 확인 가능
## Git의 동작
### git status
* 현재 git의 상태를 보여줌
* 빨간 파일들은 Working Directory 영역에 있는 것 
    * Untracked: 관리x -> 버전이력이 없음 (새로 생성된 파일)
    * Modified: 이미 관리되고 있는 파일 (수정된 파일을 의미)
    * Deleted: 삭제된 파일을 의미
* 초록 파일들은 Staging area 영역에 있는 것
    * New file: 생성된 파일
    * Modified: 수정된 파일
### git log
* commit의 history를 보는 코드
### git init
* (master)가 없는 것에만 git init을 하자
* Project단위로 주로 설정(너무 크면 기능 단위로 설정), 온라인 실습실 문제는 문제단위로 git이 설정되어 있음
* 로컬 저장소 설정(초기화)
    * 해당 폴더를 git으로 관리를 할 준비 (하위 폴더 포함)
    * git의 버전 관리를 시작할 디렉토리에서 진행
* 실행시 해당 폴더에 .git이라는 폴더가 생기고 terminal에 master라는 표시가 생김 
### git add
* git add 파일명
* 변경 사항이 있는 파일을 staging area에 추가 ( Working Directory => Staging area)
    * staging area - 버전을 관리할 파일만 남길 수 있도록 하는 분류소
* git add . : 현재 Working Directory에 있는 모든 파일을 staging area에 추가됨
    * 주의: 버전 관리가 필요없는 파일이나 폴더가 같이 올라갈 가능성이 있어 반드시 Staging area를 확인해야 함
### git commit
* commit 이력을 남기는 명령어
* commit을 할 때 자신이 누구인지를 밝혀야 함
    * 이메일: github에서 쓰는 이메일
* 반드시 commit 메세지를 남겨야 함
* git commit -m '메시지 내용': commit을 찍을 때 메시지를 남긴다. - S.A에 있는 파일들이 Repo로 모두 이동함 - commit 내용과 연관된 메시지로 작성 (한글도 괜찮, -m 여러개 써서 여러 줄 쓰기도 가능)
* git commit만 누르면 vim editor가 나온다
> (참고) vim 에디터 간단 사용법
> vim은 두 가지 모드가 있음
> 1. Command 모듸 저장, 나가기
> 2. Editor 모드 : 텍스트 수정
> * Editor 모드로 전환하는 방법은 키보드 i를 누르면 됨
> * Command 모드로 전환하는 방법은 esc 키
> * 저장하고 나가기: `:wq`
> * 저장하지 않고 강제로 나가기: `:q!`
* git은 commit을 찍을 때 이력 내용(title)을 남겨야 함
* staging area에 있는 파일들을 저장소(Repository)에 기록
    * 해당 시점의 버전을 생성하고 변경 이력을 남기는 것
---
### Commit 수정
* 협업에 있어서 반드시 회의를 거쳐 모든 사람들의 commit 기록을 맞추고 commit을 해야함( 주의 필요)
* 바로 직전 생성한 commit 수정하기
    1. commit 메시지 수정
    2. commit 전체 수정
#### 1. 메시지 수정: git commit --amend (history 꼬일 수도) 하고 난 후 vim에서 수정 가능
#### 2. 전체 수정(놓친 파일을 마지막 commit 파일에 추가로 올릴 때): 추가할 것 S.A에 올리고 git commit --amend한 후 수정하면 같이 Repo로 올라감
### LF와 CRLF
* LF:lineFeed
* CRLF: carriage return LF  두 개 모두 줄바꿈 문자이다. 이를 뭘로 할 것인지에 대한 warning이 나올 수 있으나 무시해도 됨 
### ★git은 로컬 저장소 내 모든 파일의 '변경사항'을 감시하고 있다.

### 로컬
* 현재 사용자가 직접 접속하고 있는 기기 또는 시스템

 ### git log --oneline 
 * commit들이 한 줄씩만 차지함 (내가 원하는 commit을 찾기에 용이함)
 ### git config --global -l (-list도 동일)
 * git global 설정 정보 보기    


# 원격 저장소 (Remote Reposiory)
* 내 컴퓨터 저장소는 Local Repository (위치는 .git 폴더 기준으로 생각)
* 코드와 버전 관리 이력을 온라인 상의 특정 위치에 저장하여 여러 개발자가 협업하고 코드를 공유할 수 있는 저장 공간 
* commit이 올라가는 곳
## `git remote add origin(별명) remote_repo_url(원격 저장소 주소)`
* 로컬 저장소에 원격 저장소 추가 (여러 개 가능, 구별을 위해 각각의 원격 저장소에 별명을 붙이는 것) (복사 붙여넣기 할때 shift insert 누를것)
## `git push -u origin master`
* origin과 master를 기본으로 설정
* 이후에 git push, git pull만 써도 작동함
## Local에서 remote로 보낼 때
### `git push origin(별명) master(브랜치명)`
* local에서 remote로 올리는 것
* push 전에 웬만하면 pull을 받도록 습관을 들이자. 그렇지 않으면 history 꼬일 수도 있다.
* git pull => git add => git commit => git push 순이 일반적임 (중간 중간 git status로 수시로 확인)
## Remote에서 Local로 받을 때
### `git pull origin(별명) master(브랜치명)`
* remote와 싱크를 맞춘다. 
### `git clone remote_repo_url(리모트 주소)`
* 로컬에 레포가 없을때 최초 1회 사용함 (버전 정보가 없을 때)
* .git이 같이 복제되기 때문에 git init을 할 필요가 없다.
## gitignore
* .gitignore 확장자 없이 생성
* 블랙 리스트
* Git에서 특정 파일이나 디렉토리를 추적하지 않도록 설정하는 데 사용되는 텍스트 파일
* 프로젝트에 따라 공유하지 않아야 하는 것들도 존재하기 때문
* init을 하고 난 직후 생성되는 것을 추천 ( 한 번 commit 하면 이후에 gitignore에 추가된다 하더라도 추적이 유지됨)
* [gitignore 수정](https://www.toptal.com/developers/gitignore/) 이 사이트에서 gitignore에 기본적으로 넣어야 하는 것들을 알 수 있음

## Github 활용
* TIL(Today I Learned)을 통해 내가 학습하는 것을 기록
    * 내가 배운 것을 마크다운으로 정리해서 문서화하는 것
        * 단순히 배운 거만을 필기하는 것이 아닌 스스로 더 나아가 어떤 학습을 했는지 기록하는 것
* 개인, 팀 프로젝트 코드를 공유
* 오픈소스

> # Readme.md 파일이란
> * 프로젝트에 대한 설명, 사용 방법, 문서화된 정보 등을 포함하는 역할
> * Markdown 형식으로 작성되며, 프로젝트의 사용자, 개발자, 혹은 기여자들에게 프로젝트에 대한 전반적인 이해와 활용 방법을 알려줌
> * 주로 프로젝트의 소개, 설치 및 설정 방법, 사용 예시, 라이선스 정보 등 포함
> * 반드시 저장소 최상단에 위치해야 원격 저장소에서 올바르게 출력됨( .git파일과 같은 위치)

## git 기타 명령어
### git remove -v
* 현재 로컬 저장소에 등록된 원격 저장소 목록 보기
### git remote rm 원격_저장소_이름
* 현재 로컬 저장소에 등록된 원격 저장소 삭제

# Git revert
* `git revert <commit id>` (commit id는 해시코드)
* 특정 commit을 없었던 일로 만드는 작업
* commit 기록에서 commit을 삭제하거나 분리하는 대신, 지정된 변경 사항을 반전시키는 새 commit을 생성
* git에서 기록이 손실되는 것을 방지하며 기록의 무결성과 협업의 신뢰성을 높임
* 공백을 사용해 여러 commit을 한꺼번에 실행 취소 가능 ex) `git revert 7f6c 006d 3551`
* `..`을 사용해 범위를 지정하여 여러 commit을 한꺼번에 실행 취소 가능 ex) `git revert v1..v4 (v1,v4은 해시코드)`
* commit 메시지 작성을 위한 편집기를 열지 않음 (자동으로 commit 진행) `git revert --no-edit 해시코드 `
* 자동으로 commit 하지 않고, Staging Area에만 올림 (이후에 직접 commit해야함)
* 이 옵션은 여러 commit을 revert 할 때 하나의 commit으로 묶는 것이 가능 `git revert --no-commit 해시코드`
# Git reset
* 특정 commit으로 되돌아가는 작업
* `git reset [옵션] <commit id>`
* 특정 commit으로 되돌아 갔을 때, 되돌아간 commit 이후의 commit은 모두 삭제 
## reset의 3가지 옵션  
* --soft
    * 삭제된 commit의 기록을 staging area에 남김
* --mixed
    * 삭제된 commit의 기록을 working directory에 남김 (기본 옵션 값)
* --hard
    * 삭제된 commit의 기록을 남기지 않음.
 ## 이미 삭제한 commit으로 돌아가고 싶다면
 ### git reflog
 * HEAD가 이전에 가리켰던 모든 commit을 보여줌
 * 이 후 `git reset --hard 해시주소` 하면 복구 완료  
## 강제 push
* remote에서는 first-second-third를 가지고 있어 local에서 reset으로 first만 가진다면 이를 push 하기 위해 git push -f를 사용해야 함

## git undoing
* 파일 내용을 수정 전으로 되돌리기
* Staging area에 올라간 파일을 unstage하기
## 파일 내용을 수정 전으로 되돌리기
### git restore 
* 추적하고 있는 파일 대상(기존 작업-한번이라도 commit 등록)
* Modified 상태의 파일 되돌리기
    * Working Directory에서 
### git stash
* 다른 곳에 내용을 저장하고 현재 상태를 되돌리는 것
* 그 후 git stash apply 하면 git stash전으로 돌아옴
## Staging area에 올라간 파일을 unstage하기
* git rm --cached
* 추적 대상에서 제외 혹은 삭제
* Staging area에서 Working Directory로 되돌리기
    * git 저장소에 commit이 없는 경우

* `git restore --staged`
    * Staging Area에서 Working Directory로 되돌리기
        * git 저장소에 commit이 없는 경우