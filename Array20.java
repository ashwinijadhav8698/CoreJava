/*Write a Java program to sort a given array in ascending & descending order.
Input : 	Array = [12, 5, 9, 34, 1]
Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]
Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.
*/
import java.util.*;
public class Array20 
{
    public static void main(String x[]) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = abc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter values in Array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
		{
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[i] > a[j]) 
				{
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Descending Order: ");
        for (int i = a.length - 1; i >= 0; i--) 
		{
            System.out.print(a[i] + " ");
        }
    }
}
