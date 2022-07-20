package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<String> getAllJavaBooks() {
		
		return bookDao.getAll().stream()
				.filter(b-> b.contains("java")).collect(Collectors.toList());
	}

}
