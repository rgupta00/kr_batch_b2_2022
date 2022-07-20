package com.bookapp.service;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;

@ExtendWith(MockitoExtension.class)
class BookServiceImplTestMockito {
	
	@InjectMocks
	private BookServiceImpl bookService;

	@Mock
	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
//		bookService = new BookServiceImpl();
//		bookDao=new BookDaoImpl();
//		bookService.setBookDao(bookDao);
		List<String>books=Arrays.asList("java","java adv","rich dad poor book");
		
		when(bookDao.getAll()).thenReturn(books);
		
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
