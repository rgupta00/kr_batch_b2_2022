package com.b.anno_ref;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

//only one object per ex: 
class MySingleton implements Serializable, Cloneable{
	private static MySingleton mySingleton=new MySingleton();//Eager vs Lazy
	
	private MySingleton() {
		if(mySingleton!=null) {
			throw new IllegalStateException();
		}
	}
	
	public static MySingleton getMySingleton() {
		return mySingleton;
	}
	
	private Object readResolve() {
		return mySingleton;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return mySingleton;
	}
	
	
}

public class F_Exp_With_Sigleton_Pattern {
	public static void main(String[] args) throws ClassNotFoundException, 
		InstantiationException, IllegalAccessException, IllegalArgumentException, 
		InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		//ser
		MySingleton mySingleton=MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());
		
		//clonning
		
		MySingleton mySingleton2=(MySingleton) mySingleton.clone();
		
		System.out.println(mySingleton2.hashCode());
//		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
//		oos.writeObject(mySingleton);
//	
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.ser")));
//		
//		MySingleton mySingleton2=(MySingleton) ois.readObject();
//		
//
//		System.out.println(mySingleton2.hashCode());
		
		
		
		
//		//break it java ref
//		Class<?> clazz= Class.forName("com.b.anno_ref.MySingleton");
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		constructors[0].setAccessible(true);// even if ctr is private dont care about it ...it can break oops encapusation concepts
//		
//		MySingleton mySingleton2=(MySingleton) constructors[0].newInstance();
//		System.out.println(mySingleton2.hashCode());
//	
		
		// clone can break it
		
		// multiple class loader can break it 
		
		
//		MySingleton mySingleton2=MySingleton.getMySingleton();
//		System.out.println(mySingleton2.hashCode());
		
		
	}
}
