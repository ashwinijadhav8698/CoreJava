/*Write a program in java to find the smallest missing element from a sorted array?	
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/
import java.util.*;
public class Array19
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
		int minValue=-1;
		System.out.print("Missing elements:");
		for(int i = 0; i < a.length-1; i++)
		{
			
			for(int j =a[i]+1 ; j < a[i+1]; j++)
			{  
				System.out.print(j);
				if (minValue == -1) 
				{  
                    minValue = j;
                }
			}
		}
		if(minValue!=-1)
		{
			System.out.println("The missing smallest element is:"+minValue);
		}
		else
		{
			System.out.println("No missing smallest element Found");
		}
		
	}
}