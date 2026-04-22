/*Write a program in java to rotate an array by N positions ?
	Expected Output:
	The given array is: 0  3  6  9  12  14  18  20  22  25  27
	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:
	12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.*;
public class Array18
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in Array:");
		for(int i=0 ; i < a.length ; i++)
		{
			a[i]=abc.nextInt();
		}
		System.out.println("Enter the Position");
		int n=abc.nextInt();

        System.out.println("From " + n + "th position the values of the array are: ");
        for (int i = n; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
		
        System.out.print("\nBefore " + n + "th position the values of the array are: ");
        for (int i = 0; i < n; i++)
		{	
			System.out.print(a[i] + " ");
		}

        System.out.println("\nAfter rotating from " + n + "th position the array is: ");
        for (int i = n; i < a.length; i++)
		{	
			System.out.print(a[i] + " ");
		}
		
        for (int i = 0; i < n; i++) 
		{
			System.out.print(a[i] + " ");
		}
		
		
	}
}