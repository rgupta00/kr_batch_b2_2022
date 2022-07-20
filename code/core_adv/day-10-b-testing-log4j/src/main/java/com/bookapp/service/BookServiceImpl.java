package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bookapp.dao.BookDao;

public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<String> getAllJavaBooks() {
		long start = System.nanoTime();

		List<String> books = bookDao.getAll().stream()
				.filter(b -> b.contains("java"))
				.collect(Collectors.toList());

		long end = System.nanoTime();
		logger.info("method take :" + (end - start) + " ns to execute");
		return books;
	}

}
