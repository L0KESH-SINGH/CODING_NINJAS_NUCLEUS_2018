package arrays;

import java.util.Scanner;

public class arrangenoinarrays {
	
	public static int[] arrange(int n)
	{
		int arr[] = new int[n];
		int j = n- 1 ;
		arr[0]=1;
		int a = 0 ;
		
		
		for(int i=1  ; i<=n ; i++ )
		{
			
			if(i%2==0)
			{
				
				arr[j]=i;
				j-- ;
			}
			else
			{
				
				arr[a]=i;
				a++ ;
			}
			
		}
		
		return arr ;
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
	  int n = s.nextInt();
      int array[] = arrange(n);
      print(array);
      
	}

}
