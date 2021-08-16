package org.example.jpa.domain.step5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class OneToManyTeam {
    @Id
    @GeneratedValue
    private Long id;
    private String teamName;

    @OneToMany
    @JoinColumn(name = "team_id")
    private List<OneToManyMember> members = new ArrayList<>();

    protected OneToManyTeam() {
    }

    public OneToManyTeam(String teamName) {
        this.teamName = teamName;
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<OneToManyMember> getMembers() {
        return members;
    }
}
