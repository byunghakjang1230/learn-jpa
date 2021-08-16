package org.example.jpa.domain.step5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ManyToManyMember {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "member_team_many")
    private List<ManyToManyTeam> teams = new ArrayList<>();

    protected ManyToManyMember() {
    }

    public ManyToManyMember(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ManyToManyTeam> getTeams() {
        return teams;
    }
}
