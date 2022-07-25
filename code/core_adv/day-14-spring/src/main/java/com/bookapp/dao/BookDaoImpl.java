package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao{

	@Override
	public List<String> getAll() {
		myLogging();
		return null;
	}

	public void myLogging() {
		System.out.println("------i want to log it-----------");
	}

}
