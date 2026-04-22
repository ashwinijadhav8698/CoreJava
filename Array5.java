/* Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:
If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.
Final counts are displayed.
*/
import java.util.*;

public class Array5 
{
    public static void main(String x[]) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size = abc.nextInt();
        int a[] = new int[size];
		int evenCount=0;
		int oddCount=0;

        System.out.println("Enter the values in array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }

        for (int i = 0; i < a.length; i++) 
		{
			if(i % 2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
        }
        
		System.out.println("Even Count are:"+evenCount);
		System.out.println("Odd Count are:"+oddCount);	
    }
}
