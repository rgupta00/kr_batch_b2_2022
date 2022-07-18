package com.day1.session2.ex3;

//OCP
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class AppleApp {
	//beherival parameterization dp: aka stretegy design pattern
	public static  List<Apple> getApplesOnPredicate(List<Apple>apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}
	
//	public static  List<Apple> getApplesOnPredicate(List<Apple>apples, Predicate<Apple> predicate){
//		List<Apple> list=new ArrayList<Apple>();
//		for(Apple temp: apples) {
//			if(predicate.test(temp)) {
//				list.add(temp);
//			}
//		}
//		return list;
//	}
	
//	public static  List<Apple> getHeavyApples(List<Apple>apples){
//		List<Apple> list=new ArrayList<Apple>();
//		for(Apple temp: apples) {
//			if(temp.getWeight()>=300) {
//				list.add(temp);
//			}
//		}
//		return list;
//	}
//	
//	public static  List<Apple> getGreenApples(List<Apple>apples){
//		List<Apple> list=new ArrayList<Apple>();
//		for(Apple temp: apples) {
//			if(temp.getColor().equals("green")) {
//				list.add(temp);
//			}
//		}
//		return list;
//	}
	
}
