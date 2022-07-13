package com.b.innerclasses;

class LinkList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head, tail = null;

	public void addNode(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail = temp;
		}
	}

	public void display() {
		Node currNode = head;
		if (currNode == null) {
			System.out.println("nothing ...");
		} else {
			while (currNode != null) {
				System.out.println(currNode.data + " -> ");
				currNode = currNode.next;
			}
		}
	}
}

public class B_LL {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.addNode(44);
		linkList.addNode(4);
		linkList.addNode(404);
		linkList.addNode(9994);
		
		linkList.display();
	}

}
