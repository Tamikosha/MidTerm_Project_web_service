package com.griddynamics.library.service;


import com.griddynamics.library.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBookNotes();

    Book getBookById(long bookId);

    void deleteBookById(long bookId);
}
