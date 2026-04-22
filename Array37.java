/*Write a program in java to find a subarray with given sum from the given array?
		Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		Sum =  7 ;
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
*/
import java.util.*;

public class Array37 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("\nThe given array is: " + Arrays.toString(a));
        System.out.println("Sum = " + target + " ;");

    
        for (int i = 0; i < size; i++) 
		{
            int sum = 0;
            for (int j = i; j < size; j++) 
			{
                sum =sum+ a[j];
                if (sum == target) 
				{
                    System.out.print("[" + i + ".." + j + "] -- { ");
					
                    for (int k = i; k <= j; k++) 
					{
                        System.out.print(a[k] + " ");
                    }
                    System.out.println("}");
                }
            }
        }
    }
}
