package assignmentARRAYS;

import java.util.Scanner;

public class secondlargestinarray {
	
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
	
	public static int secondLargestElement(int[] arr)
	{
		int size = arr.length ;
		int max = arr[0] ;
		//max[0] = arr[0] ;
		int temp = 0 ;
		int j = 1 ;
		int loki = 0 ;
		int f = 0 ;
		while(loki != -1 && f < size)
		{
			if(arr[0]!=arr[f])
			{
				loki = -1 ;
				break ;
			}
			f++ ;
		}
		if(loki==0)
		{
			loki = Integer.MIN_VALUE ;
			return loki ;
		}
		for(int i = 1 ; i< size ; i++)
		{
			if(arr[i]>=max)
			{
				max = arr[i] ;
				temp = i ;
			}
		}
//		for(int x = 0 ; x< size ; x++)
//		{
//			if(arr[x]==arr[temp])
//			{
//				arr[x] = Integer.MIN_VALUE ;	
//			}
//		}
		//arr[temp] = Integer.MIN_VALUE ;
		int maximum = arr[0] ;
		//int temp = 0 ;
		for(int i = 0 ; i< size ; i++)
		{
			if(arr[i]>maximum && arr[i]!=arr[temp])
			{
				maximum = arr[i] ;
				//temp = i ;
			}
		}
		//maximum = Integer.MIN_VALUE ;
		return maximum ;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int array[] = arrinput();
		int x = secondLargestElement(array);
		System.out.println(x);
	}

}
