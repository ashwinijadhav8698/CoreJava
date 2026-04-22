/*Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/
import java.util.*;

public class Array4 
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

        System.out.print("Values at Even Index = ");
        for (int i = 0; i < a.length; i++) 
		{
			if(i % 2==0)
			{
                System.out.print(a[i] + " ");
			}	
        }
        System.out.println(); 

        System.out.print("Values at Odd Index = ");
        for (int i = 0; i < a.length; i++) 
		{
			if(i % 2 != 0)
			{
                System.out.print(a[i] + " ");
			}
           
        }
    }
}
