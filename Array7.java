/*Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/
import java.util.*;
public class Array7 
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
            a[i]=abc.nextInt();
        }
        System.out.println();
        int start = 0;                
        int end = a.length - 1;     

        while (start < end) 
		{   
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        System.out.print("Reverse array = ");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i] + " ");
		}
	}
}