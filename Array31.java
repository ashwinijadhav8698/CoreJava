/*Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
import java.util.*;
public class Array31 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] c = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
		{
            c[i] = a[i] * a[i];
        }
        System.out.print("Squared array: [");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(c[i]);
            if (i < a.length - 1) 
			{
				System.out.print(", ");
			}
        }
        System.out.println(" ");
    }
}
