package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository(value = "bookDao1")
public class BookDaoImplJdbc implements BookDao{
	@Override
	public List<String> getAll() {
		System.out.println("implemented using jdbc");
		return Arrays.asList("core java","adv java","monk who sold the farrari");
	}
}
