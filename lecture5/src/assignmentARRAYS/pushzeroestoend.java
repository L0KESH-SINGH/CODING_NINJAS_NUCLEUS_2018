package assignmentARRAYS;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class pushzeroestoend {
	
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
			
			{
			System.out.print(arr[i] + " ");
			
			}
		}
		System.out.println();
	}
	
	public static void rotate(int[] arr, int d)
	{
		int size = arr.length ;
		for(int i = 0 ; i< d ; i++)
		{
			int p = 0 ;
			int temp = arr[0];
				for( int j = 1 ; j < size  ; j++)
				{
				arr[p] = arr[j];
				p++ ;
			    }
				arr[size -1] = temp ;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int array[] = arrinput();
		int d = s.nextInt();
		rotate(array, d);
		print(array);
		
		
	}

}
