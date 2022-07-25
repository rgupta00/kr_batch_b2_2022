package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImplAL implements BookDao{
	

	@Override
	public List<String> getAll() {
		System.out.println("implemented using arraylist");
		return Arrays.asList("core java","adv java","monk who sold the farrari");
	}
}
