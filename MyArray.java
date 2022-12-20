package Assignments1;

public class MyArray {
	public static void main(String[] args) {
		Array arr = new Array();
		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

//		arr.insert(a, 50);
		arr.insertAtStart(a, 100);
//		arr.insertAtIndex(a, 3, 50);
//		arr.deleteAtIndex(a, 2);
//		arr.deletevalue(a, 20);
//		arr.insertAtIndex(a, 0, 50);
//		for (int j = 0; j < a.length; j++) {
//			arr.insertAtIndex(2, 100);
//		}
		arr.getSize(a);
		arr.display(a);
	}
}
