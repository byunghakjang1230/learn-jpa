package org.example.jpa.domain.step4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityMappingManual {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    protected EntityMappingManual() {
    }

    public EntityMappingManual(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
