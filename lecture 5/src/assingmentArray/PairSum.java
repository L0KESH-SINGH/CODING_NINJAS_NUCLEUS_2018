package assingmentArray;

import java.util.Scanner;

public class PairSum {
	
	public static void pairSum(int[] input, int x)
	{
		int size = input.length;
		for(int i= 0 ; i< size ; i++)
		{
			for(int j=0 ; j< size ; j++)
			{
				if(i!=j)
				{
						//size = size -2 ;
					if(input[i]+input[j]== x)
					{
						if(input[i]>input[j])
						{
						int l = input[j];
						int m = input[i];
						System.out.println( l + " " + m);
						}
						else
						{
							int l = input[i];
							int m = input[j];
							System.out.println( l + " " + m);
						}
					}
				  
//					else
//					{
//						if(i==0 && j==1)
//						{
//						size = (size -2) ;
//						}
//						if(input[i]+input[j]== x)
//						{
//							int l = input[i];
//							int m = input[j];
//							System.out.println( l + " " + m);
//						}
//					}
				}
			}
			input[i] = 2626262 ;
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
		int n = s.nextInt();
		pairSum(array, n);
		
	}

}
