package com.f.generics2;

import java.io.Serializable;
import java.lang.reflect.Array;

public class Stack{
	private int arr[];
	
	private int SIZE;
	private int top;
	

	public Stack() {
		SIZE=5;
		arr=new int[SIZE];
		top=-1;
	}
	
	public void push(int data) {
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			throw new StackEmptyException();
		}
		return arr[top--];
	}
}
