package com.solid.c.lsp;
//LSP
import java.util.ArrayList;
import java.util.LinkedList;
//FIFO
public class Queue{
	private  LinkedList<String> list;
	
	public Queue() {
		list=new LinkedList();
	}
	public void add(String data) {
		list.addLast(data);
	}
	
	public void remove(String data) {
		//list
	}
	
	//use LinkedList to create the behaviour for Queue
}
