package Assignments1;

import java.util.Scanner;

import Assignments1.Stack.Stackclass;

public class DataStructure {

	private static int[] a;

	public static void main(String[] args) {

		Stackclass s = new Stackclass();
		Queue<Integer> q = new Queue<>();
		Array arr = new Array();

		int choice;
		boolean mainMenu = true;

		String select = " ";

		while (mainMenu) {
			Scanner sc = new Scanner(System.in);

			System.out.println("  ## Data Structure ##  ");

			System.out.println("1) Stack");
			System.out.println("2) Queue");
			System.out.println("3) Array");
			System.out.println("4) LinkedList");
			System.out.println("Enter your choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				boolean subMenu = true;
				while (subMenu) {
					System.out.println("Stack");
					System.out.println("1) Push");
					System.out.println("2) Pop");
					System.out.println("3) Peek");
					System.out.println("4) show ");
					System.out.println("Press 5 for Main menu");
					System.out.println("Enter your choice");

					switch (sc.nextInt()) {
					case 1: {
						System.out.println("Enter element to add");
						s.push(sc.nextInt());
						break;
					}
					case 2: {
						s.pop();
						System.out.println(s.pop());
						break;
					}

					case 3: {
						s.peek();
						System.out.println(s.peek());
						break;
					}
					case 4: {
						s.show();
						break;
					}
					case 5: {
						System.out.println("Return to main menu");
						subMenu = false;
						break;
					}
					}
				}
				break;
			}
			case 2: {
				boolean subMenu = true;
				while (subMenu) {
					System.out.println("Queue");
					System.out.println("1) enQueue");
					System.out.println("2) dequeue");
					System.out.println("3) Size");
					System.out.println("4) displayQueue");
					System.out.println("Press 5 for Main menu");
					System.out.println("Enter your choice");

					switch (sc.nextInt()) {
					case 1: {
						System.out.println("Add element");
						q.enQueue(sc.nextInt());
						break;
					}
					case 2: {
						q.deQueue();
						System.out.println(q.deQueue());
						break;
					}

					case 3: {
						q.size();
						System.out.println("Size of the Queue: " + q.size());
						break;
					}
					case 4: {
						q.displayQueue();
						break;
					}
					case 5: {
						System.out.println("Return to main menu");
						subMenu = false;
						break;
					}
					}
				}
				break;
			}
			case 3: {

			}
				boolean subMenu = true;
				while (subMenu) {
					System.out.println("Array");
					System.out.println("1) insertAtStart");
					System.out.println("2) insertAtIndex");
					System.out.println("3) Size");
					System.out.println("4) display");
					System.out.println("Press 5 for Main menu");
					System.out.println("Enter your choice");

					switch (sc.nextInt()) {

					case 1: {
						System.out.println("Add element");
						arr.insertAtStart(a, choice);
						break;
					}
					case 2: {
						System.out.println("Add element");
						arr.insertAtIndex(a, choice, choice);
						break;
					}

					case 3: {
						arr.getSize(a);
						System.out.println(arr.getSize(a));
						break;
					}
					case 4: {
						arr.display(a);
						break;
					}
					case 5: {
						System.out.println("Return to main menu");
						subMenu = false;
						break;
					}
					}
				}
				break;
			}
		}
	}
}
