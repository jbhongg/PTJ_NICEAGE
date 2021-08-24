# :house: 내 나이가 어때서(Nice Age)
<div>
<p align="center">
  <img width="200px;" src="https://user-images.githubusercontent.com/43925006/130594380-3eeef5fc-09c9-4eef-9ebc-73d50461b4a9.png" />
  <br/><b>코로나 19 시대의 어르신들을 위한 화상 미팅 서비스</b>
  <p align="center">
 <img src="https://img.shields.io/badge/JavaScript-ES6+-green?logo=javascript">
 <img src="https://img.shields.io/badge/Vue.js-v3.0.0-green?logo=vue.js">
 <img src="https://img.shields.io/badge/Vuetify-v3-green?logo=Vuetify">
 <img src="https://img.shields.io/badge/Java-v1.8-blue?logo=java">
 <img src="https://img.shields.io/badge/spring boot-v2.5.3-blue?logo=spring">
 <img src="https://img.shields.io/badge/spring data jpa -v2.5-blue?logo=spring">
 <img src="https://img.shields.io/badge/Hibernate----59666C?logo=Hibernate">
 <img src="https://img.shields.io/badge/Gradle-v7.0-02303A?logo=Gradle">
 <img src="https://img.shields.io/badge/AWS%20RDS----blue?logo=amazonaws">
 <img src="https://img.shields.io/badge/MySQL-v8.0-blue?logo=mysql">
 <img src="https://img.shields.io/badge/NGINX----009639?logo=NGINX">
 <img src="https://img.shields.io/badge/Docker----2496ED?logo=Docker">
  </p>
<br/>  
<br/> 
</p>    
</div>


> 서비스명: 내 나이가 어때서(Nice Age) 
>
> 팀명: 개발하기 딱 좋은 나이
>
> 개발 기간: 2021.07.12 ~ 2021.08.20 



## :clapper: 프로젝트 UCC 영상

https://www.youtube.com/watch?v=vORdGisfR64



## :link: 배포 URL

https://i5b202.p.ssafy.io



## :page_with_curl: 산출물

1. [요구사항 정의서](https://www.notion.so/709655c8876742329bfdd19bb724e9b6)

2. [와이어 프레임](https://www.notion.so/f2f3aa1d838947e5979d33896d3d49d1)

3. [간트 차트](https://www.notion.so/62f35785f995485c9929c14136ed6b9e)

4. [데이터베이스 설계](https://www.notion.so/69caad849caf4e188ef6b33113bf324f)

5. [시퀀스 다이어그램](https://www.notion.so/e92db7b62feb4999b3010a665c920521)

6. [규칙](https://www.notion.so/355d923b3e75448fb74026e0d2152142)



## 👨 팀원역할

| 이름   | 역할 | 내용                                           |
| ------ | ---- | ---------------------------------------------- |
| 송한샘 | 팀장 | 백엔드개발, QA, 디버깅, 기획                   |
| 박미현 | 팀원 | 프론트엔드개발, UI/UX 디자인, UCC 제작 및 편집 |
| 양현승 | 팀원 | 프론트엔드개발, UI/UX 디자인, WebRTC           |
| 홍진빈 | 팀원 | 프론트, 백엔드개발, QA, 배포, 기획             |



## :gift: 서비스 개요

- Covid-19 현상으로 인해 경로당들이 문을 닫아 노인분들이 외로움을 해소할 공간이 사라졌다.
- 병상에서 벗어날 수 없는 환우들의 우울함을 극복하기 위해 기획 된 프로젝트 '세상 밖으로-웃어서 좋다' 와 같이 홀로 계신 노인들이나 외로움을 겪는 노인들을 위한 사회 관계를 형성 시키는데 도움을 줄 수 있는 화상 플랫폼 서비스를 제공한다.
- 코로나 19로 인해 경로당, 복지관 등 노인들이 소통할 수 있는 창구가 막혀서 이로 인한 고립감과  우울증에 시달리는 노인들이 증가하였다. 제주연구원 고령사회연구센터와 서울대학교 사회발전연구소가 고령자 1천 명 및 예비 고령자 300명을 대상으로 주최한 연구 결과에 따르면 코로나로 인한 불편함 1순위로 가족이나 친구 등 아는 사람들의 왕래 감소(70.5%)를 꼽았다.
- 거동불편으로 인한 노인들도 쉽게 이용할 수 있는 플랫폼 서비스를 제공한다.



## 📰관련기사

- https://www.siminilbo.co.kr/news/newsview.php?ncode=1065594404007370
- https://biz.chosun.com/site/data/html_dir/2021/04/23/2021042300971.html
- http://www.kdpress.co.kr/news/articleView.html?idxno=104713
- https://www.nocutnews.co.kr/news/5468637



## 🎁주요 기능

### :house: 가상 경로당 서비스

- 위치 정보기반으로 주변 지역 경로당으로 추천한다. → 회원가입 시 입력한 주소 정보 / GPS 기반
- 경로당 / 마을 회관 공공 데이터 API를 활용하여 실제 위치 기반으로 표시
- Kakao Map API를 활용하여 지도위에 마커로 표시
- 해당 지역내의 경로당을 마커로 표시하는 것 뿐만 아니라 리스트화 시켜 보여준다.
- 리스트에 필터 기능을 통해 참여 인원이 많은 순, 가까운 순, 자주가는 순으로 필터링하여 사용자가 원하는 경로당을 볼 수 있도록 해준다.
- 노인분들이 직접 방 생성에 어려움이 있을 것으로 판단하여 자동으로 방 생성
- 한 방에 많은 인원이 접속 시 대화를 나누는데 복잡함이 있을 것으로 판단하여 한 경로당에 최대 5개의 방을 만들어 한 방에 최대 10명의 인원이 들어갈 수 있도록 조정
- 메모리와 원할한 서버 환경을 위해 미리 방을 만들어 놓는 것이 아닌 최초 인원이 접속 시 방 생성. 그 후 5, 15, 25, 35명을 기준으로 총 참여 인원을 기준으로 추가 방 생성
- 다른 방에 참여 인원을 확인 할 수 있도록 하고 다른 방으로의 이동이 쉽도록 개발
- 같은 방 참여자들끼리 화상 통화와 채팅 서비스를 이용할 수 있다.
- 공지 기능을 활용하여 해당 방 뿐만 아니라 해당 경로당에 존재하는 모든 방에 메세지를 보낼 수 있다.
- 도움이 필요한 경우 도움 요청 기능을 통해 관리자를 호출 할 수 있다.(위급 사항)

### :handshake: 친구 매칭 서비스

- 성별, 관심 분야  등 분류를 통한 1:1 매칭 서비스
- 주변 지역 / 전체 지역으로 범위를 나누어 매칭 진행
- 신고 기능을 통해 부적절한 회원을 관리자에게 신고할 수 있다.

### :man_health_worker: 건강 관리 서비스

- 스트레칭 도우미 → 다양한 스트레칭을 직접 따라해볼 수 있는 링크로 연결된다.
- 치매 진단 → 간단한 치매 진단 설문을 통해 현재 상태를 진단해주고 결과를 알려준다. 이 후 치매에 좋은 운동이나 음식 등 예방과 관련한 내용들을 알려준다.

### :memo: 커뮤니티

- 경로당 간의 단합 대회나 소통을 위한 게시판 기능을 제공한다.

### :game_die: 게임

- 노인분들이 기존에 경로당에 즐겨 하시던 바둑이나 화투 등과 같은 게임을 할 수 있는 온라인 사이트로의 연결을 도와준다.

### :sos: 도움말

- 버튼이나 기능 사용에 어려움이 있는 노인분들이 있을 것으로 예상하여 모든 기능 또는 버튼에 보기 쉬운 도움말 버튼을 만들어 클릭 시 해당 기능/버튼의 설명과 이를 TTS를 활용하여 음성으로 알려주는 기능을 제공한다.

### :wrench: 관리자

- 커뮤니티 관리 및 회원 관리 기능을 할 수 있다.

### :older_woman: 노인 친화적 플랫폼

- 노인분들의 시력을 고려하여 웹 사이트의 모든 색상은 명도 대비를 4.5:1 이상으로 하고 폰트 사이즈는 16pt 이상으로 한다.
- 기능이나 버튼들의 문구를 단어 형식이 아닌 문장형식으로 제공하여 이해하기 쉽도록 한다.
- 이벤트 발생 시 확실한 피드백을 제공하여 어떤 이벤트가 발생했는지 확실하게 인식할 수 있도록 한다.



## 🎁서비스 가치

- 코로나 시대에 경로당에 직접 가지 못하는 노인분들이 본 서비스에서 제공하는 가상 경로당 서비스를 통해 고립감과 우울증을 해소할 수 있다.
- 거동이 불편한 노인분들도 집에서 편하게 서비스를 이용할 수 있다.
- 노인분들께 새로운 친구들을 쉽게 만나 볼 수 있는 환경을 제공해주고 외로움을 해소할 수 있도록 도와준다.
- 많은 노인분들이 편하고 쉽게 소통할 수 있는 플랫폼을 제공해준다.
- 스트레칭과 치매 진단과 같은 건강 관련 서비스를 제공함으로써 노인분들의 건강 관리에 도움을 준다.



## 🎁기술 스택

🎈Language

- HTML, CSS
- JavaScript
- Java

🎈Frame Work & API & Library

- Spring Boot
- JPA, Lombok
- Vue.js
- WebRTC - OpenVidu
- Web Socket
- STT
- Teachable Machine / posenet / openpose
- MySQL
- Kakao Map API

🎈IDE

- VS code
- Eclipse

🎈Management

- JIRA
- GIT, GIT Lab
- Notion
- Figma
- Swagger
- Sourcetree
