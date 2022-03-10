package com.griddynamics.library.repository;

import com.griddynamics.library.dao.GenresDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<GenresDao, Long> {
}
