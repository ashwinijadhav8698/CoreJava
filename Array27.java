/*Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]
Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/
import java.util.*;
public class Array27
{
    public static void main(String[] args) 
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
        a[0] = 0;
        a[a.length - 1] = 0;
        System.out.print("Updated array: [");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i]);
            if (i < a.length - 1)
			{
				System.out.print(", ");
			}
        }
        System.out.println("]");
    }
}
