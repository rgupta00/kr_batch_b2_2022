package com.cal.backup;

import java.util.Arrays;
import java.util.List;

import com.bookapp.dao.BookDao;

public class BookDaoImpl implements BookDao{
	@Override
	public List<String> getAll() {
		return Arrays.asList("java","java adv","rich dad poor book");
	}

}
