package com.eazybytes.accounts.entity;

import java.time.LocalDate;

import jakarta.persistence.MappedSuperclass;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter@Setter@ToString
public class BaseEntity {

    @Column(updatable = false)
    private.LocalDateTime createdAt;

    private String.createdBy;

    private LocalDate updatedAt;

    private String updatedBy;

}
