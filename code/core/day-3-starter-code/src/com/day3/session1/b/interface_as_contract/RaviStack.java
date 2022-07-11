package com.day3.session1.b.interface_as_contract;

public class RaviStack{
	private int arr[];
	private int SIZE;
	private int top;
	public RaviStack() {
		SIZE=5;
		arr=new int[5];
		top=-1;
	}
	
	public void raviPush(int data) {
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int raviPop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		return arr[top--];
	}
}
