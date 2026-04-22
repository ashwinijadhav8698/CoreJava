/*Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.*;
public class Array14
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.print("Unique elements: ");
        for (int i = 0; i < size; i++) 
		{
            boolean duplicate = false;
			
            for (int j = 0; j < i; j++) 
			{
                if (a[i] == a[j]) 
				{
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) 
			{
                System.out.print(a[i] + " ");
            }
        }
    }
}
