package arrays;

import java.util.Scanner;

public class lenearsearch {
	
public static int linearSearch(int[] arr, int num)
	{
		int size = arr.length;
		int a = -1 ;
		for(int i = 0 ; i < size ; i++)
		{
			if ( arr[i]==num)
			{
				a = i ;
				break ;
			}
		}
		return a ;
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
		
		Scanner s = new Scanner(System.in);
		int array[] = arrinput();
		int x = s.nextInt();
		int output = linearSearch(array, x);
		System.out.println(output);
	}

}
