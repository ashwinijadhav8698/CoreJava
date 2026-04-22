/*Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
import java.util.*;
public class Array29 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        int start = 0;
        int end = a.length - 1;
        boolean flag = true;
        while (start < end) 
		{
            if (a[start] != a[end]) 
			{
                flag = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is palindrome " + flag);
    }
}
