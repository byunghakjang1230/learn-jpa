package org.example.jpa.domain.step5;

import javax.persistence.Entity;

@Entity
public class TablePerBook extends TablePerItem {
    private String director;
    private String actor;

    protected TablePerBook() {
    }

    public TablePerBook(String name, int price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }
}
