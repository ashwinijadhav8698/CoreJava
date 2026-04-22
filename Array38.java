/* Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
*/
import java.util.*;
public class Array38 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.println();
        int b[] = new int[size];
        int index = 0;
        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] != 0) 
			{
                b[index++] = a[i];
            }
        }
        System.out.println("The new array is:");
        for (int i = 0; i < b.length; i++) 
		{
            System.out.print(b[i] + " ");
        }
    }
}
