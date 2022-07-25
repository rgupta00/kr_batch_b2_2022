package com.bookapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.config.AppConfig;
import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("------------");
		
		BookService bookService=applicationContext.getBean("bookService", BookService.class);

		List<String> allJavaBook = bookService.getAllJavaBook();
		allJavaBook.forEach(b-> System.out.println(b));
		
	}
}

