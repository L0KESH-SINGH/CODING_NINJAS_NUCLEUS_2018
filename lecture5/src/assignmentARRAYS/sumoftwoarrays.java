package assignmentARRAYS;

import java.util.*;

public class sumoftwoarrays {
	
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
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
	{
		int size = Math.max(arr1.length,arr2.length);
		int loki= size +1 ;
		int array[] = new int[loki] ;
		int carry = 0 ;
//		int n = arr1[j]+arr2[k] ;
//		array[0] = n%10 ;
		int j = arr1.length - 1 ;
		int k = arr2.length - 1 ;
		//int loki= size +1 ;
		//System.out.println(loki);
		for(int i = loki -1 ; i >=0 ; i--)
		{
			
			if(j>=0 && k>=0)
			{
				array[i] = arr1[j] + arr2[k] + carry ;
				int x = array[i] / 10 ;
				carry = x % 10 ;
				if(array[i]>9)
				{
					//int x = array[i] / 10 ;
					array[i] = array[i] % 10 ;
					//carry = x ;
					//System.out.println(carry);
				}
				j-- ; 
				k-- ;
			}
			else 
			{
				if(j>=0) 
				{
				array[i] = arr1[j] + carry ;
				int x = array[i] / 10 ;
				carry = x % 10 ;
				if(array[i]>9)
				{
					//int x = array[i] / 10 ;
					array[i] = array[i] % 10 ;
					//carry = x ;
					//System.out.println(carry);
				}  
				j-- ;
				}
				if(k>=0)
				{
					array[i] = arr2[k] + carry ;
					int x = array[i] / 10 ;
					carry = x % 10 ;
					if(array[i]>9)
					{
						//int x = array[i] / 10 ;
						array[i] = array[i] % 10 ;
						//carry = x ;
						k-- ;
					}
				}
//				if(i==0)
//				{
//					array[i] = carry ;
//				}
			}
			if(i==0)
			{
				array[i] = carry ;
			}
		}
		return array ;
	}

	public static void main(String[] args) {
		
		int array1[] = arrinput();
		int array2[] = arrinput();
		int array[] = sumOfTwoArrays(array1, array2);
		print(array);

	}

}
