<!-- ![transparent](https://capsule-render.vercel.app/api?fontColor=703ee5&text=Ba:bble&height=150&fontSize=60&desc=당신을%20위한%20공간&descAlignY=75&descAlign=60) -->
![header](https://capsule-render.vercel.app/api?type=waving&color=auto&height=250&section=header&text=Ba:bble&fontSize=70&animation=fadeIn&fontAlignY=38&desc=당신을%20위한%20공간&descAlignY=51&descAlign=62)

# Ba:bble

<center>
  <a href="https://frequent-podium-9d7.notion.site/Convention-9a5f50109e204c85abdf5e1053dd471b" target="_blank">
    <img src = "https://i.imgur.com/H2BnAoP.png" width = "70" height = "70">
  </a>
  <a href="https://youtu.be/7Mbr7E0z4Lc" target="_blank">
    <img src = "https://i.imgur.com/TGNn7SL.png" width = "70" height = "70">
  </a>
</center>

## 목차

- [프로젝트 소개](#-프로젝트-소개)     
- [프로젝트 명세](#-팀원-소개)
  - [개발 환경](#개발-환경)
  - [프로젝트 설계](#-프로젝트-설계)
  - [주요 기능](#-주요-기능)
  <br>

## 🙋 프로젝트 소개
> 관심사에 대해 쉽게, 편하게, 다같이! 떠드는 익명의 플랫폼

### [🔎 시나리오 보기](/exec/senario.md)

<br>

## 🤹 팀원 소개

| 김주현                                                       | 김주연                                                  | 이지민                                                  | 조은지                                                  | 황성현                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| <img src="https://i.imgur.com/AEfc9pW.png" width="200px"> | <img src="https://i.imgur.com/jVT4kPO.png" width="200px">  | <img src="https://i.imgur.com/MYKFtWY.png" width="200px">  | <img src="https://i.imgur.com/wgVVRkq.png" width="200px">  | <img src="https://i.imgur.com/WNLNU3U.png" width="200px"> |
| 팀장 / backend / WebSocket 채팅                                        | back / REST API / 회원 관리 / 소셜 로그인 / 배포                           | front / 마이페이지 / WebSocket 이모티콘                                                 | front / 카테고리 페이지 / WebSocket 채팅 / WebRTC 화상 송출                                                 | full-stack / WebRTC 화상 송출 / 배포                   |
| [j828h@naver.com](j828h@naver.com)                           | [wndusx1@gmail.com](wndusx1@gmail.com)                  | [jm9521@hanmail.net](jm9521@hanmail.net)                | [bagjo28841@gmail.com](bagjo28841@gmail.com)            | [ppko1233@gmail.com](ppko1233@gmail.com)                |

## ✏️ 프로젝트 명세
<!-- ### 배포 환경 
- __URL__ : https://i5a308.p.ssafy.io
- __배포 여부__ : O
- __접속 가능__ : 접속 가능
- __HTTPS 적용__ : O 
- __PORT__ :  
  - Mysql : 3306
  - Openvidu : 8443
<br>
 -->
### 개발 환경
#### Front-end
- __Framework__ : [Vue.js](https://v3.vuejs.org/guide/introduction.html)
- __지원 환경__ : Web
- __담당자__ : 이지민, 조은지

#### Back-end
- __Framework__ : [Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- __Database__ : [MySQL](https://dev.mysql.com/doc/)
- __담당자__ : 김주현, 김주연, 황성현

#### Design 
- __Framework 사용__ : O 
  - [Element Plus](https://element-plus.org/)
- __Design Tool 사용__ : [Figma](https://www.figma.com/)
- __담당자__ : 이지민, 조은지

### 핵심 라이브러리 
- Front : Vuex, Vue Router, Element Plus, CSS media queries, Axios
- Back : JPA, Hiberate, QueryDSL, Lombok


## 🏠 프로젝트 설계

### ProtoType
- [Figma](https://www.figma.com/file/STAQLXm4jjJnYXJD3aUkRr/Babble?node-id=0%3A1)

### Architecture
<img src="https://i.imgur.com/mN62h4J.png" width="80%">

### ERD

<img src="https://i.imgur.com/qCIQgZy.png" width="80%">

## 🖥️ 포팅 매뉴얼
- [Getting Started & Running the tests](./exec/README.md)
- [Test Senario](./exec/senario.md)


## ❗ 주요 기능

1. **[회원 가입 / 로그인]** E-mail / SNS로 쉽게 가입하세요.

   - 비회원도 방 시청 등 서비스 이용이 가능합니다.


2. **[이야기방 생성]** 원하는 주제의 이야기 방을 생성하세요.

   - 로그인한 사용자는 원하는 이야기 방을 생성할 수 있습니다.  
     방 제목, 설명을 기입하고 썸네일로 지정할 사진을 업로드 후 분류 카테고리를 지정합니다.


   - 원하는 해시테그 키워드를 5개까지 설정할 수 있습니다.  
     해당 키워드 구독을 원하는 사용자에게 이야기 방 알림 메일이 전송됩니다!


   - 호스트가 방을 나가면 방은 사라집니다.


3. **[이야기방 참여]** 생성된 이야기 방에 참여하세요.


   - 모든 유저는 익명의 닉네임을 부여받아 이야기 방에 참여합니다.

   - 로그인한 사용자는 대기실에서 방송 입장 전 카메라 / 음성 송출 여부를 지정.후 방에 입장합니다.  
     방 입장 후에도 송출 여부를 변경할 수 있습니다.

   - 방 입장 후 이모티콘과 채팅을 통해 리액션을 보여주세요.

     - 로그인 하지 않은 사용자는 방송 청취와 이모티콘 리액션, 채팅 보기만가능합니다.


4. **[마이페이지]** 마이 페이지에서 회원 정보를 수정하세요

   - 최대 5개까지 알림 설정을 원하는 해시테그 키워드를 설정할 수 있습니다. 알람 설정이 on이라면 해당 키워드의 이야기 방이 개설되면 이메일 알람을 보내드립니다.


   - 이야기 방 시청 이력과 방 생성 이력을 확인할 수 있습니다.

---
## Ba:bble

<img src = "https://i.imgur.com/nJB5uzw.png" width="500px">


