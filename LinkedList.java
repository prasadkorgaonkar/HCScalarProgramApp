package Assignments1;

public class LinkedList {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insertAtHead(25);
		list.insertAtHead(40);
		list.insertAtTail(50);
//		list.delete();
		list.insertAtHead(30);
//		list.insertAtTail(100);
//		list.delete();
//		list.insert(40);

		list.display();

	}
}
