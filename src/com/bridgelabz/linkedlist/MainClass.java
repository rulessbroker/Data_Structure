package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("options:\n1. Add the data.\n2. Append the data\n3. Insert in between"
				+ "\n4. Delete the data at first position" + "\n5. Delete the data at last position");
		System.out.println("\nEnter your option : ");
		switch (sc.nextInt()) {

		case 1:
			SingleLinkedList.addDataAtStart();
			break;
		case 2:
			SingleLinkedList.append();
			break;
		case 3:
			SingleLinkedList.insertInBetween();
			break;
		case 4:
			SingleLinkedList.pop();
			break;
		case 5:
			SingleLinkedList.popLast();
			break;
		}

	}
}
