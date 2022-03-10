package com.griddynamics.library.repository;

import com.griddynamics.library.dao.AuthorDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorDao, Long> {

}
