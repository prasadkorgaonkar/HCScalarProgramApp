package Assignments1;

public class Queue<T>
{
	public Node<T>front;
	public Node<T>rear;
	int length;
	
		static class Node<T>
		{
			T data;
			Node<T> next;
			public Node(T data) {
				super();
				this.data = data;
				this.next= null;
			}
		}
		public void enQueue(T data)
		{
			if(front == null)
			{
				rear = new Node<T>(data);
				front = rear;
			}
			else
			{
				rear.next= new Node<T>(data);
				rear = rear.next;
			}
				length++;
		}
		
		public T deQueue()
		{
			if(front != null)
			{
				T result= front.data;
				front = front.next;
				length--;
				return result;
			}
			return null;
		}
		
		public int size()
		{
			return length;
		}
		
		public void displayQueue()
		{
			Node<T> currentNode = front;
			while(currentNode != null)
			{
				System.out.print(currentNode.data+" ");
				currentNode = currentNode.next;
			}
		}
}

