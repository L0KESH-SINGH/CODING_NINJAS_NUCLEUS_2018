package lecture5;

import java.util.Scanner;

public class selectionsort {
	
	public static void selectionsort(int[] input)
	{
		for(int i=0 ; i< input.length - 1 ; i++)
		{
			int minimum = i;
			for( int j=i+1 ; j<input.length ; j++ )
			{
				if(input[j]<input[i])
				{
					minimum = j ;
				}
			}
			int a= input[i];
			input[i] = input[minimum];
			input[minimum] = a ;
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
		selectionsort(array);
		print(array);
		
		
	}

}
