package com.bridgelabz.linkedlist;

public class SingleLinkedList {

	public static void addDataAtStart() {
		LinkedList list = new LinkedList();

		list.push(70);
		list.insertAtStart(30);
		list.insertAtStart(56);
		list.print();
	}

	public static void append() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void insertInBetween() {
		LinkedList linkedList = new LinkedList();
		Node secondNode = linkedList.push(70);
		Node firstNode = linkedList.push(56);
		Node newNode = new Node(30);
		System.out.println("Before:");
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		System.out.println("after:");
		linkedList.print();

	}
}
