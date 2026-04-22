/*Write a java program to merge two arrays.
	Input - First Array :- 1 2 3 4 5
            Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/
import java.util.*;
public class Array42
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.print("Enter size of Array1:");
		a = new int[sc.nextInt()];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = sc.nextInt();
        }
		System.out.print("Enter size of Array1:");
		int b[];
		b = new int[sc.nextInt()];
		System.out.println("Enter elements of array2:");
        for (int i = 0; i < b.length; i++) 
		{
            b[i] = sc.nextInt();
        }
		System.out.print("Merged Array:");
		int i=0, j = b.length-1;
		while(i < a.length && j >= 0)
		{
			System.out.print(a[i++] + " ");
			System.out.print(b[j--] + " ");
		}
	}
}