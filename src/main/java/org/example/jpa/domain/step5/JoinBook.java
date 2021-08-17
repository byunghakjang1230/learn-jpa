package org.example.jpa.domain.step5;

import javax.persistence.Entity;

@Entity
public class JoinBook extends JoinItem {
    private String director;
    private String actor;
}
