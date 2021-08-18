package org.example.jpa.domain.step5;

import javax.persistence.*;

@Entity
public class ManyToOneMember {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private ManyToOneTeam team;

    protected ManyToOneMember() {
    }

    public ManyToOneMember(String name, ManyToOneTeam team) {
        this.name = name;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ManyToOneTeam getTeam() {
        return team;
    }
}
