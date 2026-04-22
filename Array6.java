/*Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output:
 Element 30 found at index 2
Explanation:
 We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/
import java.util.*;
public class Array6 
{
    public static void main(String x[]) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size = abc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the values in array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
		
		System.out.println("Enter the Search Key:");
		int sKey=abc.nextInt();
			 int element=0;
			 int index=0;
			 boolean flag=false;
        for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==sKey)
			{
				   element=a[i];
				   index=i;
				   flag=true;
				   break;
			}
        }
		if(flag)
			{
				System.out.println("Found");
				System.out.println(element);
				System.out.printf("Index is:%d",index);
				
			}
			else
			{
				System.out.println("Not Found");
			}
		
    }
}
