package Assignments1;

public class MyLinkedList {
	class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	int size;
	Node head;
	Node tail;

	MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public void insertAtHead(int data) {
		if (this.head == null) {
			Node newNode = new Node(data);
			this.head = newNode;
		} else {
			Node newNode = new Node(data);
			newNode.next = this.head;
			this.head = newNode;
		}
	}

	public void insertAtTail(int data) {
		if (this.tail == null) {
			Node newNode = new Node(data);
			this.tail = newNode;
		} else {
			Node newNode = new Node(data);
			newNode.next = this.tail;
			this.tail = newNode;
		}
	}

	public void delete() {
		Node temp;
		temp = head;
		head = head.next;

		if (head == null) {
			return;
		} else
			size--;
	}

}
