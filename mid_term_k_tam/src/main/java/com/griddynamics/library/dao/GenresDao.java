package com.griddynamics.library.dao;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "genres")
public class GenresDao {

    @Id
    @GeneratedValue
    @Column(name = "genre_id")
    long genreId;

    String genreName;

    @ManyToMany
    List<BookDao> books;
}
