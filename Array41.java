/*Write a java program to find the unique value from array.
	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	All unique elements in the array are: 3, 20, 12, 10 
*/
import java.util.*;
public class Array41 
{
    public static void main(String x[]) 
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
		for(int i=0;i<a.length;i++)
		{	int count=0;
			
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		if(count==1)
		{
			System.out.print(a[i]+ " ");
		}
		}
		
	}
}