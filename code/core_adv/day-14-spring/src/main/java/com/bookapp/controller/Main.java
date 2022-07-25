package com.bookapp.controller;

import java.util.List;

import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		 
		BookService bookService=new BookServiceImpl();
		List<String> allJavaBook = bookService.getAllJavaBook();
	}
}
