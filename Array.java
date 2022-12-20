package Assignments1;

public class Array {
	int size;
	int a[] = new int[size];
	int data;
	int count = a.length;
	int index;

	public Array() {

//		this.a = a;
		this.data = data;
		this.index = index;
	}

	public void insert(int[] a, int data) {

		a[count++] = data;
	}

//	private boolean isFull() {
//		return false;
//	}

	public void insertAtStart(int[] a, int data) {
		for (int i = count - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = data;
	}

	public void insertAtIndex(int[] a, int index, int data) {
		for (int i = count - 1; i > index; i--) {
			a[i] = a[i - 1];
		}
		a[index] = data;
	}

//	public void deletevalue(int a[], int data) {
//		for (int i = 0; i < a.length; i++) {
//			a[i] = data;
//			{
//				break;
//			}
//		}

//	}

	public void deleteAtIndex(int a[], int index) {
		if (index > count || index < 0) {
			System.out.println("Invalid Index");
			return;
		}
		for (int i = index; i < a.length - 1; i++) {
			a[i] = a[i + 1];

		}
		count--;

	}

	public int getSize(int[] a) {
		System.out.println("Size of Array: " + count);
		return count;
	}

	public void display(int[] a) {
		for (int i = 0; i < count; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
