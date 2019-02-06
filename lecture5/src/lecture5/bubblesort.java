package lecture5;

import java.util.Scanner;

public class bubblesort {
	
	public static void bubblesorting(int input[])
	{
		int size = input.length ;
		for(int i=0 ; i< input.length  ; i++)
		{
			int j= 1 ;
			for(int x=0 ; x < size-1  ; x++)
			{
				if(input[x]>input[j])
				{
					int a = input[j];
					input[j] = input[x];
					input[x] = a ;
				}
				j++ ;
			}
			size-- ;
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
		int array[] = arrinput();
		bubblesorting(array);
		print(array);
		
	}

}
