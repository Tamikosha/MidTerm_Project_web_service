package com.griddynamics.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceVirtualLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceVirtualLibraryApplication.class, args);
	}

}


//Создать веб-службу для приложения виртуальной библиотеки.
//В библиотеке есть набор цифровых книг. У каждой книги есть название, имя автора, дата публикации и список жанров.
//Может быть зарегистрировано несколько пользователей.
//Пользователь может иметь собственный доступ к нескольким книгам. Для каждого заказа сохраняется дата, а также процент прочитанной пользователем книги
// (это значение может быть обновлено, когда пользователь прочитает больше страниц).
//Должна быть возможность "подарить" вашу книгу другому пользователю. Книга будет удалена из вашей библиотеки
// и добавлен в библиотеку других пользователей.
//Для каждого пользователя вы должны иметь возможность получить список жанров, которые он читает чаще всего.