# 📀 JPA 학습을 위한 프로젝트 📀

- JPA의 특징들을 하나씩 학습하기 위해서 진행하는 프로젝트.
- `김영한`님의 `자바 ORM 표준 JPA 프로그래밍 - 기본편`의 커리큘럼을 기본으로 하여 개인적인 학습 내용으로 진행.(즉, 강의 커리큘럼과 같지는 않을 예정.)
- EntityManager를 사용하여 실습을 진행하면서 기본적인 JPA의 학습에 집중한다.

### 프로젝트 개발 환경

- Project Java version : 11
- Build : maven
- Testing Framework : junit 5
- Persistent Framework : JPA(Hibernate)
- Database : H2

### 프로젝트 진행 순선
#### Step1. JPA 실습 환경 구축
- [X] 프로젝트 생성
    - [X] JPA 의존성 추가
    - [X] persistence.xml 옵션 설정
        + 옵션 설명 : [블로그 참고](https://byunghakjang1230.notion.site/01-SpringBoot-JPA-with-Gradle-66efdc7708064d9aab8ac5b40a7c3089)
- [X] H2 설정 - [블로그 참고](https://byunghakjang1230.notion.site/1-H2-for-Mac-9dfb41ad03fe475e8eea8c8cc1a1a087)
- [X] EntityManager를 관리하는 유틸 클래스 생성
- [X] DB Connect 및 JPA 실행 테스트

#### Step2. Entity 기본 생성 및 간단한 CRUD 실습
#### Step3. 영속성 관리
#### Step4. Entity 맵핑
#### Step5. 연관관계 맵핑
#### Step6. 프록시???
#### Step7. 값 매핑
#### * 추후 없데이트 예정
