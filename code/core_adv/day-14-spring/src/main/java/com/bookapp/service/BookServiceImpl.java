package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

//Amit
public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public  BookServiceImpl() {
		this.bookDao = new BookDaoImpl();
	}

	@Override
	public List<String> getAllJavaBook() {
		return bookDao.getAll().stream().filter(b->b.contains("java")).collect(Collectors.toList());
	}

}
