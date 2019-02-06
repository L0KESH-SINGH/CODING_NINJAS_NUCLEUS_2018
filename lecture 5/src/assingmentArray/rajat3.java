package assingmentArray;

import java.util.Scanner;

public class rajat3 {
	
	public static void putzeroatend(int[] arr)
	{
		int x = 0 ;
		int counter = 1 ;
		while(x<counter)
		{ 
			counter = 1 ;
		  for(int i=0 ; i<arr.length -1 ; i++)
		  {
			if(arr[i]==0)
			{
				counter++ ;
				int a =arr[i] ;
				arr[i] = arr[i+1] ;
				arr[i+1] = a ;
			}
		  }
		x++ ;
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
		
		int array[] = arrinput();
		putzeroatend(array);
		print(array);

	}

}
