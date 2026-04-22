/*Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.*;
public class Array24 
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
        for (int i = 0; i < a.length; i += 2) 
		{
            if (a[i] % 2 != 0) 
			{
                for (int j = i + 1; j < a.length; j++) 
				{
                    if (a[j] % 2 == 0) 
					{
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
            }
		}
        System.out.println("Rearranged array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}
