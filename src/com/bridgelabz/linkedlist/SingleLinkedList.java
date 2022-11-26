package com.bridgelabz.linkedlist;

public class SingleLinkedList {

	public static void addDataAtStart() {
		LinkedList list = new LinkedList();

		list.push(70);
		list.insertAtStart(30);
		list.insertAtStart(56);

		list.print();
	}
}
