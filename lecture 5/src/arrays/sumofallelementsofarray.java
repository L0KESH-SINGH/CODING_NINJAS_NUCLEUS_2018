package arrays;

import java.util.Scanner;

public class sumofallelementsofarray {
	
	public static void sumofelements ( int arr[])
	{
		int length = arr.length ;
		int sum = 0;
		for(int i = 0 ; i<length ; i++)
		{
			sum = sum + arr[i] ;
		}
		System.out.println(sum);
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
		
		sumofelements(array);
		
	}

}
