package org.example.jpa.domain.step5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OneToManyMember {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    protected OneToManyMember() {
    }

    public OneToManyMember(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
