/*Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.*;
public class Array21
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size=abc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]);
				System.out.print("\t");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print("\t0");
			}
		}
	}
}