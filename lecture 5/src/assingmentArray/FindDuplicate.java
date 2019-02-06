package assingmentArray;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int findDuplicate(int[] arr)
	{
		int x = 0 ;
		
		for(int i=0 ; i< arr.length  ; i++)
		{
			for(int j= 0 ;j < arr.length ; j++)
			{
					if(arr[i]==arr[j] && i!=j)
					{
						x=i ;
					}
			}
		}
		return arr[x] ;
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
		int x = findDuplicate(array);
		System.out.println(x);
	}

}
