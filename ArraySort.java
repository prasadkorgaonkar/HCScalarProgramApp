package Assignments1;

public class ArraySort 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,70,2,80,9,67,15};
		int n= arr.length;
		int temp=0;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]>arr[j])
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<n; i++)
		System.out.println(arr[i]);
	}
}
