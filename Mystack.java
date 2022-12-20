package Assignments1;

import Assignments1.Stack.Stackclass;

public class Mystack {
	public static void main(String[] args) throws Exception {
		Stackclass s = new Stackclass();

		s.push(10);
//		s.pop();
		s.push(20);
//		s.pop();
		s.push(30);
		s.pop();

		while (!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();

		}
//		System.out.println("Peek element is: " + s.peek());
		s.show();
	}
}

//		int count = 0;
//		boolean action = true;
//		
//		while(action)

//			count++;
//			System.out.println(count);

//			if(count== 20) {
//				System.out.println("Action is stoped");
//				action = false;
//			}
//		}
//		
//	}
