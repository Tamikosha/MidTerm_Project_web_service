package com.griddynamics.library.controllers;

import com.griddynamics.library.models.Author;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AuthorController {



    // Получить всех авторов
    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return null;
    }

    // Получить автора по идентификатору
    @GetMapping("/authors/{authorId}")
    public Author getAuthorById(@PathVariable String authorId) {
        return null;
    }

    // Создайте новую заметку автора
    @PostMapping("/authors")
    public Author createAuthorNote(){
        return null;
    }

    // Удалить все книги по идентификатору автора
    @DeleteMapping("/authors/{authorId}")
    public void deleteAuthor(){
        return;
    }
}
