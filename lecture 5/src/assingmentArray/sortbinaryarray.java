package assingmentArray;

import java.util.Scanner;

public class sortbinaryarray {
	
	public static void sortBinaryArray(int[] arr)
	{
		
	      int j = 0 ;
	      int a = 0 ;
	      for(int i=0 ; i< arr.length ; i++)
	      {
	        if(arr[i]==0)
	        {
	          a = arr[j] ;
	          arr[j]= arr[i] ;
	          arr[i] = a ;
	          j++ ;
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

		int array[] = arrinput();
		sortBinaryArray(array);
		print(array);
		
	}

}
