package org.example.jpa.domain.step5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ManyToOneTeam {
    @Id
    @GeneratedValue
    private Long id;
    private String teamName;

    @OneToMany(mappedBy = "team")
    private List<ManyToOneMember> members = new ArrayList<>();

    protected ManyToOneTeam() {
    }

    public ManyToOneTeam(String teamName) {
        this.teamName = teamName;
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<ManyToOneMember> getMembers() {
        return members;
    }
}
