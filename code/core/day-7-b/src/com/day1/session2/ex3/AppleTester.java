package com.day1.session2.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.html.parser.Entity;

import com.day1.session1.ex2.Book;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples =
				Arrays.asList(
						new Apple("red", 400),
						new Apple("green", 300), 
						new Apple("green", 200),
						new Apple("red", 250));
		//heavy apples
		
//		List<Apple> applesHeavy=AppleApp.getHeavyApples(apples);
//		List<Apple> applesGreen=AppleApp.getGreenApples(apples);
		
//		Predicate<Apple> heavyPredicate= a-> a.getWeight()>=300;
		//Predicate<Apple> heavyPredicate= Apple::isHeavy;
		Predicate<Apple> heavyPredicateUsingStaticMethod= AppleHelper::isHeavy;
		
		List<Apple> applesHeavy=AppleApp.getApplesOnPredicate(apples, heavyPredicateUsingStaticMethod);
		
		Predicate<Apple> greenPredicate= a-> a.getColor().equals("green");
		List<Apple> greenHeavy=AppleApp.getApplesOnPredicate(apples, greenPredicate);
		
		Predicate<Apple> heavyAndGreeenPredicate=
				heavyPredicateUsingStaticMethod.and(greenPredicate);
		
		
		List<Apple> greenAndHeavyHeavy=
				AppleApp.getApplesOnPredicate(apples, heavyAndGreeenPredicate);
		
		
		//Most imp functional interface in java 8
		
		//Predicate	
			
		//Function
		
		//Consumer
		
		//biConsumer
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		//Supplier
	
		
		//BiFunction
	
		
		
		
	}
}

















