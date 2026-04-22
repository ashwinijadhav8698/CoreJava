/* Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.
*/
import java.util.*;
public  class Array2
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter the Elements in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.printf("Sum of array elements:%d\t",sum);
	}
}