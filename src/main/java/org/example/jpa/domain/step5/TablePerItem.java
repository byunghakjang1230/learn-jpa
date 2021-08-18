package org.example.jpa.domain.step5;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TablePerItem {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;

    public TablePerItem() {
    }

    public TablePerItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
