package com.bookapp.config;

import org.checkerframework.common.reflection.qual.GetClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

/*
 * 
	
	
	

 */
@Configuration
@ComponentScan(basePackages = { "com.bookapp" })
public class AppConfig {

	@Autowired
	@Bean(name = "bookService")
	public BookService GetBookService(BookDao bookDao) {
		BookService bookService=new BookServiceImpl(bookDao);
		return bookService;
	}
	//@Primary
	@Profile(value = "test")
	@Bean(name = "bookDao12")
	public BookDao getBookDaoAL() {
		BookDao bookDao = new BookDaoImplAL();
		return bookDao;
	}

	//@Primary
	@Profile(value = "dev")
	@Bean(name = "bookDao1")
	public BookDao getBookDaoJbdc() {
		BookDao bookDao = new BookDaoImplJdbc();
		return bookDao;
	}
}
