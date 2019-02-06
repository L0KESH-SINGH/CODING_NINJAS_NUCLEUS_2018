package arrays;

import java.util.Scanner;

public class swapAlternate {
	
	public static void swapAlternate(int[] input)
	{
		int size = input.length;
		int a ;
		int b= 1 ;
		for( a=0 ; a< size-1 ; a+=2)
		{
			int l = input[a];
			input[a]=input[b];
			input[b]=l;
			//a=a+2;
          if(b<size -1)
          {
            b=b+2;
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
		
		int array[] = arrinput();
		swapAlternate(array);
		print(array);

	}

}
