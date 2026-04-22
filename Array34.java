/*Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element,
 find sum of divisors and compare with the number, then count.
*/
import java.util.*;
public class Array34
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
        int perfectCount = 0;
        for (int i = 0; i < a.length; i++) 
		{
            int num = a[i];
            int sum = 0;
            for (int j = 1; j <= num / 2; j++) 
			{
                if (num % j == 0) 
				{
                    sum += j;
                }
            }
            if (sum == num) 
			{
                perfectCount++;
            }
        }
        System.out.println("Count of Perfect numbers = " + perfectCount);
    }
}
