package lecture5;

import java.util.Scanner;

public class binarysearch {
	
	public static void binarysearch(int[] input , int x )
	{
		int start = 0 ;
		int counter = -1 ;
		int end = input.length - 1 ;
		
		while(start<=end)
		{
			int mid = (start+ end) /2 ;
			if(input[mid]==x)
			{
				counter = mid ;
				break ;
			} 
			else if(x<input[mid])
			{
				end = mid -1 ;
			}
			else if (x>input[mid])
			{
				start = mid + 1 ;
			}
		}
		System.out.println(counter);
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

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int array[] = arrinput();
		int n = s.nextInt();
		binarysearch(array, n);
		
	}

}
