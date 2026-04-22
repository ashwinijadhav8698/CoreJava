/*Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        
	sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
import java.util.*;
public class Array22
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter values in Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		System.out.println("Enter the sum:");
		int sum=abc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.print("("+a[i]+ "," +a[j]+ ")");
					count++;
				}
			}
		}
		System.out.println("Total Pairs:"+count);
	}
}