package assingmentArray;

import java.util.Scanner;

public class tripletSum {
	
	public static void arrange (int a , int b , int c )
	{
		//int r = a;
		for( int i = 1 ; i >0 ; i++)
		{
			int r = a;
			if(a<b && b<c)
			{
				System.out.println(a+" "+b+" "+c);
				break ;
			}
		   a=b;
		   b=c;
		   c=r;
		}
	}

	public static void tripletSum (int[] input, int x)
	 {
		int size = input.length;
		for(int i= 0 ; i< size ; i++)
		{
			for(int j=0 ; j< size ; j++)
			{
				for(int p=0 ; p< size ; p++)
				{
					if(input[i]+input[j]+input[p]== x)
					{
						int a = input[i];
						int b = input[j];
						int c = input[p];
						for( int h = 1 ; h >0 ; h++)
						{
							int r = a;
							if(a<b && b<c)
							{
								System.out.println(a+" "+b+" "+c);
								break ;
							}
						   a=b;
						   b=c;
						   c=r;
						}
						//System.out.println();
						//arrange( input[i], input[j], input[p]);
						
					}
				}
				
			}
			input[i] = Integer.MIN_VALUE ;
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

		Scanner s = new Scanner (System.in);
		
		int array[] = arrinput();
		int n = s.nextInt();
		tripletSum(array, n);
		
	}

}
