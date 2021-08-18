package org.example.jpa.domain.step5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "team_name")
    private String teamName;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    protected Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Member> getMembers() {
        return members;
    }
}
