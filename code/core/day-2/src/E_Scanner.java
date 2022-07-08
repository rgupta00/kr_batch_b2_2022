import java.util.Scanner;
import java.util.*;
public class E_Scanner {

	public static void main(String[] args) {

	  int i=5;
	  
	
		//how to take input from the user
		//decorator: 

		Scanner scanner=new Scanner(System.in);
		//System.out.println("pe u name");
		
//		String name=scanner.nextLine();
//		System.out.println(name);
		
		int age= scanner.nextInt();
		System.out.println(age);
		
		
		scanner.close();
		
	}

}
