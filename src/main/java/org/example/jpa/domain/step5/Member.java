package org.example.jpa.domain.step5;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String memberName;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    protected Member() {
    }

    public Member(String memberName, Team team) {
        this.memberName = memberName;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public Team getTeam() {
        return team;
    }
}
