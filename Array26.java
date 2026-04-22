/* Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
import java.util.*;

public class Array26
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
		{
            if (a[i] % 3 == 0) 
			{
                a[i] = -1;
            }
		}
        System.out.println("Updated array:");
        for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		} 
    }
}
