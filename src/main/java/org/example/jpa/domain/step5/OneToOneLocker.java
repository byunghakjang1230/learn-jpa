package org.example.jpa.domain.step5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OneToOneLocker {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(mappedBy = "locker")
    private OneToOneMember member;

    protected OneToOneLocker() {
    }

    public OneToOneLocker(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setMember(OneToOneMember member) {
        this.member = member;
    }
}
