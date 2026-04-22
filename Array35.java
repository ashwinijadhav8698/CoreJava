/*Count the number of duck numbers in an array.
*/
import java.util.Scanner;
public class Array35
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int num : a) 
		{
            if (num == 0)
			{
				continue; 
			}
            int temp = num;
            boolean isDuck = false;
            while (temp > 0) 
			{
                if (temp % 10 == 0) 
				{
                    isDuck = true;
                    break;
                }
                temp = temp / 10;
            }
            if (isDuck) count++;
        }
        System.out.println("Count of Duck numbers = " + count);
    }
}
