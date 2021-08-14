package org.example.jpa.domain.step4;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.*;

@Entity
public class ColumnMapping {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_name", length = 30)
    private String name;
    @Column(precision = 15)
    private BigDecimal size1;
    @Column(scale = 3)
    private BigInteger size2;
    @Column(precision = 13, scale = 4)
    private BigDecimal size3;
    @Column(columnDefinition = "varchar(30) not null default 'hi'")
    private String columnDefinition;
    @Column(insertable = false, length = 15)
    private String insertable;
    @Column(updatable = false, length = 10)
    private String updatable;
    @Column(unique = true, length = 50)
    private String unique1;

    protected ColumnMapping() {
    }

    public ColumnMapping(String name, BigDecimal size1, BigInteger size2, BigDecimal size3, String columnDefinition, String insertable, String updatable, String unique) {
        this.name = name;
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.columnDefinition = columnDefinition;
        this.insertable = insertable;
        this.updatable = updatable;
        this.unique1 = unique;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSize1() {
        return size1;
    }

    public BigInteger getSize2() {
        return size2;
    }

    public void setUpdatable(String update) {
        this.updatable = update;
    }

    public void setName(String name) {
        this.name = name;
    }
}

