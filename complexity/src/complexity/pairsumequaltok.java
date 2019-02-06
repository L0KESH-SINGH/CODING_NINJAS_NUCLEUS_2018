package complexity;

import java.util.Arrays;
import java.util.Scanner;

public class pairsumequaltok {
	
	public static void pairSum(int[] arr, int num)
	{
		Arrays.sort(arr);
		int left = 0 ;
		int right = arr.length-1 ;
		while(left<right)
		{
			int sum = arr[left]+arr[right] ;
			if(sum==num)
			{
				int count =1 ;
				int i = left ;
				int j = right ;
				while(arr[i]==arr[i+1])
				{
					count++ ;
					i++ ;
					if(arr[j]==arr[j-1])
				  {
					count++ ;
					j-- ;
				  }
				}
				for(int k =0 ; k<count ; k++) {
				System.out.print(arr[left]+" "+arr[right]);
				System.out.println();}
				left++ ;
				right-- ;
			}
			else if(sum>num)
			{
				right-- ;
			}
			else
				left++ ;
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

	public static void main(String[] args) {
		
		int array[] = arrinput() ;
		pairSum(array, 4);

	}

}
