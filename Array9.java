/*Write a java program to copy one array to another array.
Input:
Array1 = {5, 10, 15, 20}
Output:
Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/
import java.util.*;
public class Array9 
{
    public static void main(String[] args) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = abc.nextInt();

        int a[] = new int[size];
        int b[] = new int[size];  

        System.out.println("Enter the values in Array1:");
		
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
        for (int i = 0; i < a.length; i++) 
		{
            b[i] = a[i];
        }

        System.out.println("Array2 after copying:");
		
        for (int i = 0; i < b.length; i++) 
		{
            System.out.print(b[i] + " ");
        }
    }
}
