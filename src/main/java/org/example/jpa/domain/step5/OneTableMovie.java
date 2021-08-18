package org.example.jpa.domain.step5;

import javax.persistence.Entity;

@Entity
public class OneTableMovie extends OneTableItem {
    private String author;
    private String isbn;
}
