package com.day1.session1.ex2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;
public class DemoLambdaExpession2 {

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 1300));
		//i want the books name that have cost more then 250  sorted as per rev prices
		
//		Predicate<Book> p1=b-> b.getPrice()>=250;
		Predicate<Book> p1=Book::pricyBook;
		
		
		List<String> names=
				books.stream()
				.filter(Book::pricyBook)
				.sorted(Comparator.comparing(Book::getPrice).reversed())
				.map(Book::getTitle)
				.collect(toList());
		names.forEach(name-> System.out.println(name));
		
		//lambada expreession vs methdod ref
		
		
		//hell
//		List<Book>books2=new ArrayList<Book>();
//		for(Book book: books) {
//			if(book.getPrice()>=250) {
//				books2.add(book);
//			}
//		}
//		Collections.sort(books2, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
//		
//		List<String> names=new ArrayList<String>();
//		for(Book temp: books2) {
//			names.add(temp.getTitle());
//		}
		
		
	}
}
