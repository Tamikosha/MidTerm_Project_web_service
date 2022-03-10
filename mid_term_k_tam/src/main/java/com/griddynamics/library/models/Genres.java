package com.griddynamics.library.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Genres {
    long genreId;
    String genreName;
    List<Book> books;
}
