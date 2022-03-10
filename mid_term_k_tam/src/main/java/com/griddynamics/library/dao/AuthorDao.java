package com.griddynamics.library.dao;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter

@Entity
@Table(name = "authors")
public class AuthorDao {

    @Id
    @GeneratedValue
    @Column(name = "author_id")
    long authorId;

    @Column(name = "author_name")
    String authorName;

    @OneToMany(mappedBy = "authorDao")
    List<BookDao> books;
}
