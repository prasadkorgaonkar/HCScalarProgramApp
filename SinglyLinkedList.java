package Assignments1;

public class SinglyLinkedList {

	static class Node<T> {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = next;
		}
	}

	int size;
	Node head;

	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(int data) {
		Node N = new Node(data);
		if (isEmpty()) {
			head = new Node(data);
			head = N;
			System.out.print(data + " ");
		} else
			size++;
	}

	public void delete(int data) {
		Node temp;
		temp = head;
		head = head.next;

		if (head == null) {
			return;
		} else
			size--;
	}
}