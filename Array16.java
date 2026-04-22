/*Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/
import java.util.*;
public class Array16
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the values in Array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{		
			int count=1;
	
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}	
			}
			if(a[i] != -1)
			{
				System.out.println(a[i]+ " : " +count+ " times ");
					
			}
		
		}
	}
}