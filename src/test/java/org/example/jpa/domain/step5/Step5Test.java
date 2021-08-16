package org.example.jpa.domain.step5;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("연관관계 매핑 테스트")
class Step5Test extends EntityManagerTest {
    @Test
    @DisplayName("다대일 연관관계 매핑")
    void association_N1() {
        tx.begin();
        ManyToOneTeam team = new ManyToOneTeam("hi");
        em.persist(team);
        ManyToOneMember member = new ManyToOneMember("hi", team);
        team.getMembers().add(member);
        em.persist(member);
        tx.commit();
    }

    @Test
    @DisplayName("일대다 연관관계 매핑")
    void association_1N() {
        tx.begin();
        OneToManyTeam team = new OneToManyTeam("hi");
        em.persist(team);
        OneToManyMember member = new OneToManyMember("hi");
        team.getMembers().add(member);
        em.persist(member);
        tx.commit();
    }

    @Test
    @DisplayName("일대일 연관관계 매핑")
    void association_11() {
        tx.begin();
        OneToOneLocker locker = new OneToOneLocker("hi");
        em.persist(locker);
        OneToOneMember member = new OneToOneMember("hi", locker);
        locker.setMember(member);
        em.persist(member);
        tx.commit();
    }

    @Test
    @DisplayName("다대다 연관관계 매핑")
    void association_NM() {
        tx.begin();
        ManyToManyTeam team = new ManyToManyTeam("hi");
        em.persist(team);
        ManyToManyMember member = new ManyToManyMember("hi");
        member.getTeams().add(team);
        team.getMembers().add(member);
        em.persist(member);
        tx.commit();
    }
}
