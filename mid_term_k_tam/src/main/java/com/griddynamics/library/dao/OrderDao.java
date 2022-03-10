package com.griddynamics.library.dao;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "orders")

public class OrderDao {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    long orderId;

    @ManyToOne
    @JoinColumn(name = "userId")
    UserDao userDao;

    @ManyToOne
    @JoinColumn(name = "bookId")
    BookDao bookDao;

    @Column(name = "order_date")
    Date orderDate;

    @Column(name = "read_on_page")
    int readOnPage;
}
