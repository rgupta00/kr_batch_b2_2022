package com.bookapp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;
import com.cal.backup.BookDaoImpl;

class BookServiceImplTest {

	private BookServiceImpl bookService;

	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
		bookService = new BookServiceImpl();
		bookDao=new BookDaoImpl();
		bookService.setBookDao(bookDao);
		
	}

	@Test
	void getAllJavaBooksTest() {
		Assertions.assertEquals(2, bookService.getAllJavaBooks().size());
	}

	@AfterEach
	void tearDown() throws Exception {
		bookService = null;
	}

}
