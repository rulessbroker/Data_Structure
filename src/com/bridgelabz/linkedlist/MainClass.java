package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("options:\n1. Add the data.\n2. Append the data");
		System.out.println("\nEnter your option : ");
		switch (sc.nextInt()) {

		case 1:
			SingleLinkedList.addDataAtStart();
			break;
		case 2:
			SingleLinkedList.append();
			break;
		}

	}
}
