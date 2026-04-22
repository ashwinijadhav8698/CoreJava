/* Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.*;
public class Array11 
{
    public static void main(String x[]) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = abc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter values in Array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] > largest) 
			{
                secondLargest = largest;
                largest = a[i];
            } 
			else if (a[i] > secondLargest && a[i] != largest) 
			{
                secondLargest = a[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) 
		{
            System.out.println("No second largest element (all elements are same).");
        } 
		else 
		{
            System.out.println("Second largest = " + secondLargest);
        }
    }
}
