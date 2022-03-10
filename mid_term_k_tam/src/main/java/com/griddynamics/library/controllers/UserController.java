package com.griddynamics.library.controllers;

import com.griddynamics.library.models.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {



    // Получить всех пользователей
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return null;
    }

    // Получить пользователя по идентификатору
    @GetMapping("/users/{userId}")
    public User getUserById() {
        return null;
    }

    // Получить пользователей из какой-либо страны
    @GetMapping("/users/country")
    public List<User> getUsersFromCountry() {
        return null;
    }

    // Получить одного самого активного пользователя
    @GetMapping("/users/active")
    public User getMostActiveUser() {
        return null;
    }

    // Получить самый популярный жанр для какого-либо пользователя
    @GetMapping("/users/genre")
    public User getPopularGenreForUser() {
        return null;
    }

    // Создайте новую заметку пользователя
    @PostMapping("/users")
    public User createUserNote(){
        return null;
    }


    // Удалить всех пользователей из Англии
    @DeleteMapping("/users/country")
    public void deleteUser(){
        return;
    }



}
