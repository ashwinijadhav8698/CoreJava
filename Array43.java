/*Write a java program to display top three value from array.
	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86
*/
import java.util.*;
public class Array43
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] > first)
                first = a[i];
        }
        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] > second && a[i] < first)
                second = a[i];
        }
        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] > third && a[i] < second)
                third = a[i];
        }

        System.out.println("Top three values are: " + first + ", " + second + ", " + third);
    }
}
