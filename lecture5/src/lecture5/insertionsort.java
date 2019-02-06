package lecture5;

import java.util.Scanner;

public class insertionsort {
	
	public static void insertionSort(int input[])
	{
		int size = input.length;
		for(int i=1 ; i<size  ; i++)
		{
			int x = i;
			for(int j= i-1 ; j>=0 ; j--)
			{
				if(input[x]<input[j])
				{
					int a = input[j] ;
					input[j] = input[x] ;
					input[x] = a ;
					x = j;
				}
			}
		}
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
		int array[]= arrinput();
		insertionSort(array);
		print(array);
		
	}

}
