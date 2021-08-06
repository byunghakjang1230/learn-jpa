package org.example.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LazyUser {
    @Id
    private String id;
    private String name;
    private int age;

    protected LazyUser() {
    }

    public LazyUser(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
