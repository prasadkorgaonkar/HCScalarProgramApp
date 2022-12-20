package Assignments1;

import java.util.ArrayList;

public class Stack {
	static class Stackclass {

		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0;
		}

		public static void push(int data) {
			list.add(data);
		}

		public Object pop() {
			if (isEmpty()) {
				return null;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

		public int peek() {
			if (isEmpty()) {
				return 0;
			}
			return list.get(list.size() - 1);
		}

		public static void show() {

			for (int data : list) {
				System.out.println(data);
			}
		}
	}
}
