/*Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.*/
import java.util.*;
public class Array15 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int size = sc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];

        System.out.println("Enter elements of Array1:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of Array2:");
        for (int i = 0; i < b.length; i++) 
		{
            b[i] = sc.nextInt();
        }

        System.out.print("Common elements: ");
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
    }
}
