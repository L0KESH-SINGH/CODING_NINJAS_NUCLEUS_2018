package assignmentARRAYS;

import java.util.Scanner;

public class checkarrayrotation {
	
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
	
	public static int arrayRotateCheck(int[] arr)
	{
		int size = arr.length ;
		int a = 0 ;
		for(int i = 0 ; i<size -1 ; i++)
		{
			if(arr[i]-arr[i+1] > 0)
			{
				a = i+1 ;
			}
		}
		return a ;
	}

	public static void main(String[] args) {

		int array[] = arrinput();
		int x =arrayRotateCheck(array);
		System.out.println(x);
	}

}
