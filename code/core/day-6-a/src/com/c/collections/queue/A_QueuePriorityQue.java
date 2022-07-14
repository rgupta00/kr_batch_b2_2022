package com.c.collections.queue;
import java.util.*;

public class A_QueuePriorityQue {
	
	public static void main(String[] args) {
		//BlockingQueue: PC problem*
		
		//how to use it ?
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		priorityQueue.offer(44);
		priorityQueue.offer(4);
		priorityQueue.offer(94);
		priorityQueue.offer(404);
		priorityQueue.offer(111);
		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
		
		
		//how to print it
//		Iterator<Integer>it=priorityQueue.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		
	}

}
