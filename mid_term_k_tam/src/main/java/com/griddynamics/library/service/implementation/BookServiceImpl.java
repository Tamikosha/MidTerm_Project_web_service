package com.griddynamics.library.service.implementation;

import com.griddynamics.library.dao.BookDao;
import com.griddynamics.library.exceptions.IdNotFoundException;
import com.griddynamics.library.mappers.BookMapper;
import com.griddynamics.library.models.Book;
import com.griddynamics.library.repository.BookRepository;
import com.griddynamics.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBookNotes() {
//        List<BookDao> daos = bookRepository.findAll();
/*
        List<Book> result = new ArrayList<>();
        for (BookDao dao : daos) {
            Book map = BookMapper.mapBookGenreAndAuthor(dao);
            result.add(map);
        }
 */
        return bookRepository.findAll().stream()
                .map(BookMapper::mapBookGenreAndAuthor)
                .collect(Collectors.toList());
    }

    @Override
    public Book getBookById(long bookId) {
        Optional<BookDao> entity = bookRepository.findById(bookId);
        return entity.map(BookMapper::mapBookGenreAndAuthor).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void deleteBookById(long bookId) {
        Optional<BookDao> entity = bookRepository.findById(bookId);
        if (!entity.isPresent()) {
            throw new IdNotFoundException(bookId);
        }

        bookRepository.delete(entity.get());
    }

}

