package org.example.jpa.domain.step4;

import static javax.persistence.EnumType.STRING;

import java.util.Date;

import javax.persistence.*;

@Entity
public class ExtraColumnMapping {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 14)
    private String name;
    @Enumerated(STRING)
    private ColumnEnum columnEnum;
    @Lob
    private String na;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Transient
    private boolean userYn;

    protected ExtraColumnMapping() {
    }

    public ExtraColumnMapping(String name, ColumnEnum columnEnum, String na, Date createTime, boolean userYn) {
        this.name = name;
        this.columnEnum = columnEnum;
        this.na = na;
        this.createTime = createTime;
        this.userYn = userYn;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ColumnEnum getColumnEnum() {
        return columnEnum;
    }

    public String getNa() {
        return na;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public boolean isUserYn() {
        return userYn;
    }
}
