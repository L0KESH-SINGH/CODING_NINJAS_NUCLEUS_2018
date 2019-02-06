package assingmentArray;

import java.util.Scanner;

public class arrayintersection {
	
	public static void intersections(int[] input1, int[] input2)
	{
		int array[] = new int[10000];
		int c=0 ;
		for(int i=0 ; i< input1.length ; i++)
		{
			for(int j=0 ; j< input2.length ; j++)
			{
				if(input1[i]==input2[j])
				{
					//input2[j] = 0 ;
					array[c]=input1[i];
					input2[j] = 262626 ;
					c++;
					break;
				}
			}
		}
		array[c]= 555555 ;
		for(int i = 0 ; i< array.length ; i++)
		{
			if(array[i]!= 555555)
			{
				System.out.println(array[i]);
			}
			else
				break ;
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
		int array2[] = arrinput();
		intersections(array, array2);
		
	}
}
