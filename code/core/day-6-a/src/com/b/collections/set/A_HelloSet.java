package com.b.collections.set;
import java.util.*;
class LengthSorter implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
}
public class A_HelloSet {

	public static void main(String[] args) {
		//read a file and print all "unique" words from that file
		
		//HashSet: neighter sorted and ordered 
		//LinkedHashSet: not sorted but ordered
		//TreeSet: is sorted
		//[ b, aa, aaa, aaaa]

		Set<String> set=new TreeSet<String>(new LengthSorter());
	
		set.add("aa");
		set.add("b");
		set.add("aaa");
		set.add("aaaa");
		
		System.out.println(set);
		
	}
}
