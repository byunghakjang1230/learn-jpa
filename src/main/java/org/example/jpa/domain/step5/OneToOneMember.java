package org.example.jpa.domain.step5;

import javax.persistence.*;

@Entity
public class OneToOneMember {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private OneToOneLocker locker;

    public OneToOneMember() {
    }

    public OneToOneMember(String name, OneToOneLocker locker) {
        this.name = name;
        this.locker = locker;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OneToOneLocker getLocker() {
        return locker;
    }
}
