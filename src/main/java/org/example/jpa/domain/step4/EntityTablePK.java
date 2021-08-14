package org.example.jpa.domain.step4;

import javax.persistence.*;

@Entity
@TableGenerator(name = "SEQ_TABLE", table = "SEQ")
public class EntityTablePK {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_TABLE")
    private Long id;
    private String name;

    protected EntityTablePK() {
    }

    public EntityTablePK(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
