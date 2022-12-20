package Assignments1;

public class MyQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new Queue<>();
		
		q.enQueue(25);
		q.enQueue(30);
		q.enQueue(50);
		q.enQueue(40);
		q.displayQueue();
		
		System.out.println(" ");
		System.out.println("Size of the Queue: "+q.size());
		
		
		q.deQueue();
		
		q.displayQueue();
		

	}
}
