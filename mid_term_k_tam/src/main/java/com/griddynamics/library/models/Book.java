package com.griddynamics.library.models;

import lombok.Data;

import java.sql.Date;
import java.util.List;


@Data
public class Book {
    private long bookId;
   // private Author authorDao;
    private String authorName;
    private String title;
    private Date publicationDate;
    private int pages;
    private List<String> genres;
}
