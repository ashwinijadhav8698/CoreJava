/* Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value : 200
	Expected Output : The new list is : 1 2 200 3 4 5
*/
/* Simple Java program to insert an element at desired position */
import java.util.*;
public class Array12
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int a[] = new int[size + 1]; 
		
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.print("Enter position to insert (1-based): ");
        int pos = sc.nextInt();

        System.out.print("Enter value: ");
        int value = sc.nextInt();
		
        for (int i = size; i >= pos; i--) 
		{
            a[i] = a[i - 1];
        }
        a[pos - 1] = value; 

        System.out.print("The new list is: ");
        for (int i = 0; i <= size; i++) 
		{
            System.out.print(a[i] + " ");
        }
    }
}
