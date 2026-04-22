/* Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
Case 1 :  Sort Number In Ascending Order.
           Output :- 2357  5689  2345  2569  3457  1235 

Case 2 : Sort Number In Descending Order.
           Output :- 7532  9865  5432  9652  7543  5321

Case 3 : Store sum of digits at same index.
           Output :-  17  28  14  22  19  11

Case 4 : Store the even number at the first and odd number at the last of digit at same index.
           Output :-  2573  6859  4253  2695  4735  2135

Case 5 : Store only prime number at the same index of digit.
           Output :- 2573  5  253  25  357  235
*/

import java.util.*;
public class Array40 
{
    public static void main(String x[]) 
	{
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = abc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the values in array:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = abc.nextInt();
        }
        System.out.println("Enter the Choice:");
        int ch = abc.nextInt();

        switch (ch) 
		{
            case 1:
                System.out.println("Ascending Order: ");
                for (int i = 0; i < a.length; i++) 
				{
                    int temp = a[i];
                    int b[] = new int[4];
                    int index = 0;
                    while (temp > 0) 
					{
                        int rem = temp % 10;
                        b[index++] = rem;
                        temp /= 10;
                    }
                    for (int j = 0; j < b.length; j++) 
					{
                        for (int k = j + 1; k < b.length; k++) 
						{
                            if (b[j] > b[k]) 
							{
                                int temp1 = b[j];
                                b[j] = b[k];
                                b[k] = temp1;
                            }
                        }
                    }
                    int result = 0;
                    for (int l = 0; l < b.length; l++) 
					{
                        result = result * 10 + b[l];
                    }
                    a[i] = result;
                }
                for (int i = 0; i < a.length; i++) 
				{
                    System.out.println(a[i]);
                }
                break;
            case 2:
                System.out.println("Descending Order: ");
                for (int i = 0; i < a.length; i++) 
				{
                    int temp = a[i];
                    int b[] = new int[4];
                    int index = 0;
                    while (temp > 0) 
					{
                        int rem = temp % 10;
                        b[index++] = rem;
                        temp /= 10;
                    }
                    for (int j = 0; j < b.length; j++) 
					{
                        for (int k = j + 1; k < b.length; k++) 
						{
                            if (b[j] < b[k]) 
							{
                                int temp1 = b[j];
                                b[j] = b[k];
                                b[k] = temp1;
                            }
                        }
                    }
                    int result = 0;
                    for (int l = 0; l < b.length; l++) 
					{
                        result = result * 10 + b[l];
                    }
                    a[i] = result;
                }
                for (int i = 0; i < a.length; i++) 
				{
                    System.out.println(a[i]);
                }
                break;
            case 3:
                System.out.println("Sum of Array: ");
                for (int i = 0; i < a.length; i++) 
				{
                    int temp = a[i];
                    int sum = 0;

                    while (temp > 0) 
					{
                        sum += temp % 10;
                        temp /= 10;
                    }
                    System.out.println(sum);
                }
                break;
            case 4:
                System.out.println("Even digits first, Odd digits last:");
                for (int i = 0; i < a.length; i++) 
				{
                    int temp = a[i];
                    int even = 0, odd = 0;
                    int evenMul = 1, oddMul = 1;
                    while (temp > 0) 
					{
                        int digit = temp % 10;
                        if (digit % 2 == 0) 
						{
                            even = even + digit * evenMul;
                            evenMul *= 10;
                        } 
						else 
						{
                            odd = odd + digit * oddMul;
                            oddMul *= 10;
                        }
                        temp /= 10;
                    }
                    int result = even * oddMul + odd;
                    System.out.println(result);
                }
                break;
            case 5:
                System.out.println("Store only prime digits of each number:");
                for (int i = 0; i < a.length; i++) 
				{
                    int temp = a[i];
                    int[] b = new int[4];
                    int index = 0;
                    while (temp > 0) 
					{
                        b[index++] = temp % 10;
                        temp /= 10;
                    }
                    for (int j = 0, k = index - 1; j < k; j++, k--) 
					{
                        int t = b[j];
                        b[j] = b[k];
                        b[k] = t;
                    }
                    int result = 0;
                    for (int j = 0; j < index; j++) 
					{
                        int d = b[j];
                        if (d == 2 || d == 3 || d == 5 || d == 7) 
						{
                            result = result * 10 + d;
                        }
                    }
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
