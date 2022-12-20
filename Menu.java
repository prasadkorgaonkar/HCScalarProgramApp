package Assignments1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assignments1.Stack.Stackclass;

public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	Stackclass s = new Stackclass();
	Queue<Integer> q = new Queue<>();
	Array arr = new Array();
	int a[] = new int[10];
	MyLinkedList list = new MyLinkedList();
	private static boolean isLevelOne = true;

	public Menu(int order, String name) {
		super(order, name);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public Menu(String title) {
		super(0, title);
	}

	public void addMenuItem(MenuItem mi) {
		mi.setParent(this);
		items.add(mi);
	}

	public List<MenuItem> getMenuItem() {
		return items;

	}

	public void display() {
		if (isLevelOne) {
			isLevelOne = false;
			items.forEach(item -> item.display());
			isLevelOne = true;
			System.out.println("Enter your choice:");
			int choice = new Scanner(System.in).nextInt();
			if (choice == 0) {
				back();
			} else {
				MenuItem mi = getMenuItem().stream().filter(menuItem -> menuItem.getOrder() == choice).findFirst()
						.orElse(null);
				if (mi == null) {
					System.err.println("Invalid choice");
					display();
				} else if (mi instanceof Menu) {
					mi.display();
				} else {
					String operationName = mi.getName();
					String datastructureName = mi.getParent().getName();

					switch (datastructureName) {
					case "Stack": {
						callStackOperation(operationName);

					}
					case "Queue": {
						callQueueOperation(operationName);
						break;
					}
					case "Array": {
						callArrayOperation(operationName);
						break;
					}
					case "LinkedList": {
						callLinkedListOperation(operationName);
						break;
					}
					}
				}
			}
		} else {
			super.display();
		}
	}

	private void callStackOperation(String operationName) {

		switch (operationName) {
		case "Push": {
			System.out.println("Enter Element to Add");
			int data = new Scanner(System.in).nextInt();
			s.push(data);
			display();
			break;
		}
		case "Pop": {
			System.out.println("Element Poped " + s.pop());
			display();
			break;
		}
		case "Peek": {
			System.out.println("Element Peeked " + s.peek());
			s.peek();
			display();
			break;
		}
		case "Show": {
			s.show();
			display();
			break;
		}
		}
	}

	private void callQueueOperation(String operationName) {
		switch (operationName) {
		case "enQueue": {
			System.out.println("Enter Element:");
			int data = new Scanner(System.in).nextInt();
			q.enQueue(data);
			display();
			break;
		}
		case "deQueue": {
			System.out.println("Element Removed: " + q.deQueue());
			display();
			break;
		}
		case "Size of the Queue": {
			System.out.println("Size of the Queue: " + q.size());
			display();
			break;
		}
		case "Display Queue": {
			q.displayQueue();
			display();
			break;
		}
		}
	}

	private void callArrayOperation(String operationName) {

		switch (operationName) {

		case "Insert At Start": {
			System.out.println("Enter Element");
			int data = new Scanner(System.in).nextInt();
			arr.insert(a, data);
			display();
			break;
		}
		case "Delete": {
			arr.deleteAtIndex(a, 0);
			System.out.println("Deleted Element: ");
			arr.display(a);
			display();
			break;
		}
		case "Size of the Array": {
			arr.getSize(a);
			display();
			break;
		}
		case "Display Array": {
			arr.display(a);
			display();
			break;
		}
		}
	}

	private void callLinkedListOperation(String operationName) {
		switch (operationName) {
		case "Insert At Head": {
			System.out.println("Enter Element");
			int data = new Scanner(System.in).nextInt();
			list.insertAtHead(data);
			display();
			break;
		}
//		case "Insert At Tail": {
//			System.out.println("Enter Element");
//			list.insertAtTail(0);
//			display();
//			break;
//		}
		case "Delete": {
			list.delete();
			display();
			break;
		}
		case "Display LinkedList": {
//			System.out.print(list.display());
			list.display();
			display();
			break;
		}
		}
	}

	private boolean isLevelOne() {
		return false;
	}

	private void back() {
		if (getParent() != null) {
			getParent().display();
		} else {
			System.exit(0);
		}

	}
}
