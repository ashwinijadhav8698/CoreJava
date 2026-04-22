/* Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
*/
import java.util.*;
public class Array33
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
        int primeCount = 0;
        for (int i = 0; i < a.length; i++) 
		{
            int num = a[i];
            boolean isPrime = true;
            if (num <= 1)
			{				
				isPrime = false;
			}
            else 
			{
                for (int j = 2; j < num; j++) 
				{
                    if (num % j == 0) 
					{
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
			{
				primeCount++;
			}
        }

        System.out.println("Count of prime numbers = " + primeCount);
    }
}
