package org.example.jpa.domain.step4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntityAutoPKDefault {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    protected EntityAutoPKDefault() {
    }

    public EntityAutoPKDefault(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
