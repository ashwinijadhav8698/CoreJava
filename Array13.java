/*Write a java program to display only non-zero values from an array.
Input : Array ={1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/
import java.util.*;
public class Array13
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.print("Non-zero elements: ");
        for (int i = 0; i < size; i++) 
		{
            if (a[i] != 0) 
			{
                System.out.print(a[i] + " ");
            }
        }
    }
}
