package com.griddynamics.library.repository;

import com.griddynamics.library.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDao, Long> {

}
