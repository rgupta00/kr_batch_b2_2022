package com.day3.session1.b.interface_as_contract;

public class RaviStack implements Stack{
	private int arr[];
	private int SIZE;
	private int top;
	public RaviStack() {
		SIZE=5;
		arr=new int[5];
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
			return -999;
		}
		return arr[top--];
	}
}
