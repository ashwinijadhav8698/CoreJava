/* Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/
import java.util.*;
public class Array8
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the values in array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
		System.out.print("Missing elements:");
		for(int i = 0; i < a.length-1; i++)
		{
			for(int j =a[i]+1 ; j < a[i+1] ; j++)
			{  
				System.out.print(j);
				System.out.print(" ");
			}
			
		}
		
	}
}