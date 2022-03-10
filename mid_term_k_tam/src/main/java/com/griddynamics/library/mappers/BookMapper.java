package com.griddynamics.library.mappers;

import com.griddynamics.library.dao.BookDao;
import com.griddynamics.library.dao.GenresDao;
import com.griddynamics.library.models.Book;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static Book mapBookGenreAndAuthor(BookDao dao) {
        ModelMapper modelMapper = new ModelMapper();
        Book booksWithGenres = modelMapper.map(dao, Book.class);
        List<String> genres = dao.getGenres().stream().map(GenresDao::getGenreName).collect(Collectors.toList());
        booksWithGenres.setGenres(genres);
        booksWithGenres.setAuthorName(dao.getAuthorDao().getAuthorName());
        return booksWithGenres;
    }

}



