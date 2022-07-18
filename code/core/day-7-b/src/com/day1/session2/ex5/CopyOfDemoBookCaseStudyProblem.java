package com.day1.session2.ex5;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

//		List<Book>allbooks=allBooks.stream().collect(Collectors.toList());
//		
//		printBooks(allbooks);

		// 1. Find books with more then 400 pages

//		List<Book> allbooksMoreThen400pages = 
//				allBooks.stream().filter(b->b.getPages()>=500).collect(Collectors.toList());
//
//		printBooks(allbooksMoreThen400pages);

		// 2. Find all books that are java books and more then 400 pages
//		
//		List<Book> allbooksMoreThen400pages = 
//				allBooks.stream().filter(b->b.getPages()>=500).collect(Collectors.toList());
//
//		printBooks(allbooksMoreThen400pages);

		// 3. We need the top three longest books

//		List<Book> top3LongestBooks = 
//				allBooks.stream()
//				.sorted(( o1,  o2)-> Integer.compare(o2.getPages(), o1.getPages()))
//				.limit(3)
//				.collect(Collectors.toList());
//
//		printBooks(top3LongestBooks);

//		List<Book> list = 
//				allBooks.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.limit(3)
//				.collect(Collectors.toList());
//
//		printBooks(list);

		// 4. We need from the fourth to the last longest books

//		List<Book> list = 
//				allBooks.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.skip(3)
////				.limit(3)
//				.collect(Collectors.toList());
//
//		printBooks(list);

		// 5. We need to get all the publishing years
//		List<Integer> listOfYears = 
//				allBooks.stream()
//				.map(Book::getYear)
//				.distinct()
//				.collect(Collectors.toList());
//
//		listOfYears.forEach(y-> System.out.println(y));
		// printBooks(list);

		// 6. We need all the authors names who have written a book

//		List<String> nameOfAuthors = 
//				allBooks.stream()
//				.flatMap(b-> b.getAuthors().stream())
//				.map(a-> a.getName())
//				.distinct()
//				.collect(Collectors.toList());
//		nameOfAuthors.forEach(an-> System.out.println(an));
				
				

		// We need all the origin countries of the authors
//
//		List<String> countriesOfAuthors = 
//				allBooks.stream()
//				.flatMap(b-> b.getAuthors().stream())
//				.map(a-> a.getCountry())
//				.distinct()
//				.collect(Collectors.toList());
//		countriesOfAuthors.forEach(an-> System.out.println(an));
		
		// We want the most recent published book.
//		Optional<Book> bookOpt = allBooks.stream()
//		.max(Comparator.comparingInt(Book::getYear));
//		
//		System.out.println(bookOpt.map(b->b.getTitle()).orElse("no such book"));
		
		// We want to know if all the books are written by more than one author
		boolean allMatch = allBooks.stream()
		.allMatch(b->b.getAuthors().size()>1);
		System.out.println(allMatch);

		// We want one of the books written by more than one author. (findAny)

		// We want the total number of pages published.

		// We want to know how many pages the longest book has.

		// We want the average number of pages of the books

		// We want all the titles of the books

		// We want the book with the higher number of authors?

		// We want a Map of book per year.

		// We want to count how many books are published per year.

	}

	private static void printBooks(List<Book> allbooks) {
		allbooks.forEach(System.out::println);
	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"), 
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("keshav", "gupta", "us"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
