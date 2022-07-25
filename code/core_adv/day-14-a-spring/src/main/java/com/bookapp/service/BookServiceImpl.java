package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImplAL;
import com.bookapp.dao.BookDaoImplJdbc;

//Amit
public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	
//	public  BookServiceImpl(BookDao bookDao) {
//		System.out.println("ctr of BookServiceImpl");
//		this.bookDao = bookDao;
//	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<String> getAllJavaBook() {
		return bookDao.getAll().stream()
				.filter(b->b.contains("java")).collect(Collectors.toList());
	}

}
