package org.example.jpa.domain.step5;

import javax.persistence.Entity;

@Entity
public class JoinMovie extends JoinItem {
    private String author;
    private String isbn;
}
