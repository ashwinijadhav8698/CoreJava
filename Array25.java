/* Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/
import java.util.*;

public class Array25
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
            if (a[i] < 0) 
			{
                a[i] = 0;
            }
        }
        System.out.println("Updated array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		} 
    }
}
