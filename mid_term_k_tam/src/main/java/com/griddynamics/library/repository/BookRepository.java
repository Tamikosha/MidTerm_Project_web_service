package com.griddynamics.library.repository;

import com.griddynamics.library.dao.BookDao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<BookDao, Long> {

}

//@Repository: Annotation used to Indicate the DAO
// (Data Access Object) component in the persistence layer.

//imported the JpaRepository package to use that repository in the BookRepository interface
// by connecting most recently coded BookDao model to do CRUD operations.