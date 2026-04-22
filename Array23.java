/*Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]
Explanation:Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.*/
import java.util.Scanner;
public class Array23
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int a[] = new int[sc.nextInt()];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int b[] = new int[sc.nextInt()];
		
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < b.length; i++) 
        {
            b[i] = sc.nextInt();
        }

        System.out.print("Union of array is = ");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++) 
            {
                if (a[i] == b[j]) 
                {
                    System.out.print(a[i] + " ");
                    break; 
                }
            }
        }
        System.out.println(" ");
	}
}