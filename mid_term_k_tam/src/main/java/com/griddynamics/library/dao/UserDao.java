package com.griddynamics.library.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserDao {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    long userId;

    @Column(name = "user_name")
    String userName;

    String country;

    @OneToMany(mappedBy = "userDao")
    List<OrderDao> orders;
}
