package com.f.generics2;

import java.lang.reflect.Array;

public class Stack<T> {
	private T arr[];

	private int SIZE;
	private int top;

	public Stack(Class<T> clazz) {
		SIZE = 5;
		arr = (T[]) Array.newInstance(clazz, SIZE);
		top = -1;
	}

	public void push(T data) {
		if (top == SIZE - 1)
			System.out.println("cant insert");
		else
			arr[++top] = data;
	}

	public T pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			throw new StackEmptyException();
		}
		return arr[top--];
	}
}
