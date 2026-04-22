/* Write a program in java to delete an element at desired position from an array.
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to delete : 3
	Expected Output : The new list is : 1 2 3 5
*/
import java.util.*;
public class Array10
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.println("Input 5 elements in the array in ascending order :");
		for(int i=0; i< a.length; i++)
		{
			a[i]=abc.nextInt();
		}
		System.out.println("Input the position where to delete :");
		int index=abc.nextInt();
		
		for(int i=index -1 ; i< a.length - 1; i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("The new list is:");
		for(int i=0 ; i< a.length - 1; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
}