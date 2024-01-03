package com.playground.zillar.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "emma")
@Table(name = "POLL")
@Getter
@Setter
public class Poll {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startAt;

    @Column(name = "EXPIRE_DATE", nullable = false)
    private LocalDateTime expiresIn;

    @Column(name = "GENERATED_LINK", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private String generatedStr;

    private boolean visited;


}
