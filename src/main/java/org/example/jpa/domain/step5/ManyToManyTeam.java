package org.example.jpa.domain.step5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyTeam {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "teams")
    private List<ManyToManyMember> members = new ArrayList<>();

    protected ManyToManyTeam() {
    }

    public ManyToManyTeam(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ManyToManyMember> getMembers() {
        return members;
    }
}
