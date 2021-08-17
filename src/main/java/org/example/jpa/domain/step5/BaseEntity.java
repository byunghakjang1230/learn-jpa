package org.example.jpa.domain.step5;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    private LocalDateTime createTime;
    private LocalDateTime lastUpdateTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }
}
