package com.griddynamics.library.controllers;

import com.griddynamics.library.models.Book;
import com.griddynamics.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;


@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String homeMapping() {
        return "Hello, this is book library!";
    }

    // Получить все книги
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllNotes() {
        return new ResponseEntity<List<Book>>(bookService.getAllBookNotes(), HttpStatus.OK);
    }

    // Получить название книги по идентификатору книги
    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable long bookId, HttpServletResponse response) {
        try {
            return new ResponseEntity<Book>(bookService.getBookById(bookId), OK);
        } catch (Exception exc) {
            throw new ResponseStatusException(
                    NOT_FOUND, "Book with this Id not found.", exc);
        }
    }

    // Получить книги по автору
    @GetMapping("/books/author")
    public List<Book> getBooksByAuthor() {

        return null;
    }

    // Получите название самой популярной книги
    @GetMapping("/books/popular/")
    public Book getPopularBook() {

        return null;
    }


    // Получить список книг по жанрам
    @GetMapping("/books/genre")
    public List<Book> getBooksByGenre() {
        return null;
    }


    // Создайте новую заметку в книге
    @PostMapping("/books")
    public Book createNote() {
        return null;
    }

    // Обновить заметку в книге
    @PutMapping("/books/")
    public Book updateBook() {
        return null;
    }


    // Обновление прочитанных страниц книги
    @PutMapping("/books/pages")
    public Book updateReadBookPages() {
        return null;
    }

    // Подарите книгу другому пользователю
    @PutMapping("/books/gift")
    public Book makeGift(@PathVariable String bookId) {
        return null;
    }


    // Удалить книгу по идентификатору
    @DeleteMapping("/books/{bookId}")
    public void deleteBookById(@PathVariable long bookId) {
        bookService.deleteBookById(bookId);
    }


}
