
# LinkUP - 구인구직 중개 플랫폼
기존 레포지토리 : https://github.com/hayeonkimmie/linkUP
## 📌 프로젝트 소개

> 구직자와 구인자 간 매칭을 돕는 **구인·구직 플랫폼**입니다.  
> 사용자는 구직 정보 탐색 및 지원이 가능하고,  
> 클라이언트는 프로젝트 등록 및 프리랜서 관리, 정산을 수행할 수 있습니다.  
> **JSP/Servlet + MyBatis** 기반으로 MVC 패턴 및 DAO/Service 계층 구조를 적용하였으며,  
> Git 커밋 컨벤션 도입과 싱글톤 DB 연결 최적화, 비동기 처리 등 실무 수준의 아키텍처를 도입했습니다.

## 📅 개발 기간 및 인원

- 2025.04 ~ 2025.05 (약 5주)
- 총 4명 (백엔드 2, 프론트 2)

## 🧱 기술 스택

- **Backend**: Java 17, Servlet 4.0, JSP, MyBatis, Gradle
- **Frontend**: HTML, CSS, JavaScript, jQuery, AJAX
- **Database**: MySQL
- **Server**: Apache Tomcat 9
- **IDE**: IntelliJ
- **ETC**: Git, Github

---

## 🧰 ERD 구조

[👉 ERD Cloud에서 보기](https://www.erdcloud.com/d/5fFXeFAAnuEpSwjQd)
![Image](https://github.com/user-attachments/assets/80e93ead-34c5-4d34-8c7c-829c044a45b6)
---

## ⚙️ 시스템 아키텍처 및 구조

- **MVC 패턴 기반의 구조 설계**
- **Service / DAO 계층 분리 적용 (OCP, SRP 원칙 준수)**
- **MyBatis + 싱글톤 SqlSessionFactory로 트랜잭션 안정성 강화**
- **AJAX 기반의 비동기 데이터 처리 도입**

---

## ✅ 주요 기능

### [공통]
- 회원가입 및 로그인 (유형별 분기 처리, 카카오 로그인)
- 메인 페이지에서 프로젝트 및 구인자 목록 조회
- 사이트 이용에 관한 문의 등록

### [구직자]
- 프로젝트 목록 및 상세 조회
- 포지션 선택 후 지원
- 개인 정보 및 마이프로필, 포트폴리오 등록 및 수정
- 지원 내역 조회 및 상태 확인
- 참여한 프로젝트의 정산 조회

### [구인자]
- 프로젝트 등록/수정/삭제
- 프로젝트별 지원자 목록 및 상태 관리
- 프로젝트 별 지원자 선정 및 계약 체결
- 프로젝트 정산 요청 및 회차별 정산 내역 확인

### [관리자]
- 사용자 계정 및 프로젝트 모니터링
- 구인자가 요청한 프로젝트 정산
- 구인자 또는 구직자의 문의 답변

---

## 🧩 Git 커밋 컨벤션 및 협업
- 예시:
  - `feat: 관리자 프로젝트 정산 내역 기능 구현`
  - `fix: 프로젝트 상세 조회 오류 수정`
  - `refactor: Service 계층 코드 리팩토링`
- 커밋 유형과 목적이 명확히 구분되어 히스토리 파악이 쉬웠고, 협업 효율이 향상됨

---
