package com.griddynamics.library.repository;

import com.griddynamics.library.dao.OrderDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDao, Long> {
}
