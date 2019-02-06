package arrays;

import java.util.Scanner;

public class largestofInputArray {
	
	public static int largestelelentOFarray( int arr[])
	{
		int max = Integer.MIN_VALUE ;
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max ;
	}
	
	public static int[] arrinput()
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		
		for(int i= 0 ; i<size ; i ++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void print (int arr[])
	{
		int size = arr.length;
		
		for(int i = 0 ; i<size ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int array [] = arrinput();
		print(array);
		int largest = largestelelentOFarray(array);
		System.out.println(largest);
	}

}
