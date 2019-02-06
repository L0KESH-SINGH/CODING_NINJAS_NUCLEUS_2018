package assingmentArray;

import java.util.Scanner;

public class rajat {
	
	public static void intersections(int[] input1, int[] input2)
	{
		int c= 0;int l;
		if(input1.length > input2.length)
		{
			l=input1.length ;
		} else {
		l=input2.length;
		}
		int array[]=new int[l];
		for(int i = 0 ;i < array.length ; i++)
		{
			for(int j= 0 ; j<array.length ; j++)
			{
				if(input1[i]==input2[j])
				{
					array[c++]= input1[i];
					input2[j]=26262626;
					
					break;
				}
				
			}
		}
		for(int i = 0 ;i< c ; i++)
		{
			System.out.println(array[i]);
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
