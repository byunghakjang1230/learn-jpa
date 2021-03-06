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
- [X] `CRUD` 테스트
    + [X] `persis` 메소드를 사용하여 객체를 `DB`에 저장.
    + [X] `find` 메소드를 사용하여 객체를 `DB`에서 조회.
    + [X] `find`로 조회한 객체를 수정하여 `DB` 값 수정.(???) - 다음 스텝에서 설명.
    + [X] `find`로 조회한 객체를 `remove`를 사용하여 `DB`에서 삭제.

#### Step3. 영속성 관리
- 영속성 컨텍스트란? : [블로그 학습 내용 참고](https://byunghakjang1230.notion.site/defed859a10e49d588630b7370b54e4a)
- 영속성 테스트 코드 작성
  + [X] 영속상태 만들기
  + [X] 지연쓰기 동작
  + [X] 변경 감지 동작
  + [X] flush 동작
  + [X] 준영속 상태 만들기
  + [X] 삭제 상태 만들기
  + [X] 기타 테스트 코드 작성

#### Step4. Entity 매핑
- [X] 기본 객체 매핑 : [블로그 학습 내용 참고](https://byunghakjang1230.notion.site/Entity-b0e18c82933246ee87148a3841a7749c)
  + [X] `@Entity` 어노테이션
    * [X] 테이블명 수정
  + [X] `@Id` 어노테이션 PK 지정
  + [X] `@Column` 어노테이션
    * [X] 각종 속성 수정
  + 기타 타입 컬럼 맵핑
    * [X] `@Temporal`, `@Enumerated`, `@Lob`, `@Transient` 어노테이션 사용
  + [X] `@GeneratedValue` 어노테이션
    * [X] 기본키 자동 생성 전략 테스트
      - [X] IDENTITY
      - [X] SEQUENCE
      - [X] TABLE
      - [X] AUTO

#### Step5. 연관관계 매핑
- 연관관계 매핑 : [블로그 학습 내용 참고](https://byunghakjang1230.notion.site/1e12374cea1446a7b92c5d83b3f41e0b)
- 다양한 연관관계 매핑과 방향
  + 연관관계 매핑 종류
    * [X] 다대일
    * [X] 일대다
    * [X] 일대일
    * [X] 다대다
- 기타 고급 매핑
  + [X] 상속관계 매핑
  + [X] `@MappedSuperclass`

#### Step6. 프록시???
#### Step7. 값 매핑
#### * 추후 없데이트 예정
