package com.taverok.rcmder.domain.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Builder
@Entity
public class Book {
    @Id
    @Column(nullable = false)
    private String id;

    @Column
    private String ISBN;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToMany(targetEntity = User.class)
    private List<User> users;
}
