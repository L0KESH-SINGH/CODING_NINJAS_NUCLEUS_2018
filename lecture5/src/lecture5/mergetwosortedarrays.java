package lecture5;

import java.util.Scanner;

public class mergetwosortedarrays {
	
	public static int[] mergearrays(int input1[] , int input2[])
	{
		
		int size1 = input1.length ;
		int size2 = input2.length ;
		int size = size1 + size2 ;
		int array[] = new int[size ];
		int j = 0 ;
		int i = 0 ;
		for(int x=0 ; x < size ; x++)
		{
			if((i != size1 ) && (j != size2  ))
			{
			if((input1[i]<=input2[j])) 
			{
				array[x] = input1[i] ;
				i++ ;
			}
			else 
			{
				array[x] = input2[j] ;
				j++ ;
			}
			}
			else
			{
				if(i != size1 )
				   {
					array[x] = input1[i] ;
					i++;
				   }
				else if( j != size2 )
				{
					array[x] = input2[j];
					j++;
				}
				else
				{
					break ;
				}
			}
		}
		return array ;
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
			
			{
			System.out.print(arr[i] + " ");
			
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int input1[] = arrinput();
		int input2[] = arrinput();
		int array[] = mergearrays(input1, input2) ;
		print(array);

	}

}
