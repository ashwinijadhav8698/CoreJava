/*Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element
 with this value.
*/
import java.util.*;
public class Array32 
{
    public static void main(String[] args) 
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
        for (int i = 0; i < a.length; i++) 
		{
            int fact = 1;
            for (int j = 1; j <= a[i]; j++) 
			{
                fact *= j;
            }
            a[i] = fact;
        }
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
