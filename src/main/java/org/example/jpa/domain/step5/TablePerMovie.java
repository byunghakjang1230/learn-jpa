package org.example.jpa.domain.step5;

import javax.persistence.Entity;

@Entity
public class TablePerMovie extends TablePerItem {
    private String author;
    private String isbn;
}
