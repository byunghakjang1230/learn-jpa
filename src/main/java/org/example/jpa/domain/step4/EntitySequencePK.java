package org.example.jpa.domain.step4;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "ENTITY_SEQ_GENERATOR", sequenceName = "ENTITY_SEQ")
public class EntitySequencePK {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "ENTITY_SEQ_GENERATOR"
    )
    private Long id;
    private String name;

    protected EntitySequencePK() {
    }

    public EntitySequencePK(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
