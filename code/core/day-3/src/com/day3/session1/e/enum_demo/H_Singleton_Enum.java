package com.day3.session1.e.enum_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

enum MySingleton{
	INSTANCE;
}

public class H_Singleton_Enum {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MySingleton mySingleton1=MySingleton.INSTANCE;
		
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
		oos.writeObject(oos);
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
		
		MySingleton mySingleton2=(MySingleton) ois.readObject();
		

		
		System.out.println(mySingleton2.hashCode());
		
	}
}
