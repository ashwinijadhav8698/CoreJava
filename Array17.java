/*Write a program in java to find the majority element of an array ?
	A majority element in an array of size n is an element that appears more than n/2 times (and
	hence there is at most one such element).
	Expected Output:
	The given array is: 4  8  4  6  7  4  4  8
	There are no Majority Elements in the given array*/
import java.util.*;
public class Array17
{
	public static void main(String x[])
	{	Scanner abc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the values in Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		int maxCount=0;
		int majorElement=1;
		for(int i=0;i<a.length;i++)
		{		
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}	
			}
			if(count > maxCount)
			{
				maxCount=count;
				majorElement=a[i];
			}	
		}
		if(maxCount > a.length/2)
		{
			System.out.println("Majority Element:"+majorElement);
		}
		else
		{
			System.out.println("Majority Element Not Found in the Array");
		}
	}
}