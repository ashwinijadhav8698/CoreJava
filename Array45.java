/*Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
Example 2: 
Input: nums = [3,2,4], target = 6   
Output: [1,2]
*/
/* Simple Java program to find two indices whose values sum up to target */
import java.util.*;
public class Array45 
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
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        for (int i = 0; i < a.length; i++) 
		{
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[i] + a[j] == target) 
				{
                    System.out.println("Indices of numbers: [" + i + ", " + j + "]");
                    return; 
                }
            }
        }
    }
}
