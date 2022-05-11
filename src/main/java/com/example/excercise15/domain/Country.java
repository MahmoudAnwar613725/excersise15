package com.example.excercise15.domain;

import lombok.Data;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sakila.country")
@Data
public class Country {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country")
    private String name;

    @Column(name = "last_update")
    private LocalDate lastModified;
}
