/*Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5
Explanation:
Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.
Therefore, the first repeating element is 5.
*/
import java.util.*;
public class Array30
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        int temp = -1;
        for (int i = 0; i < a.length; i++) 
		{
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[i] == a[j]) 
				{
                    temp = a[i];
                    break;
                }
            }
            if (temp != -1) break;
        }
        if (temp != -1) 
		{
            System.out.println("First repeating element is " + temp);
        } 
		else 
		{
            System.out.println("No repeating element found");
        }
    }
}
