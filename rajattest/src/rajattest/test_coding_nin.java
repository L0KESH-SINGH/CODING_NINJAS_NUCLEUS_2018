package rajattest;

import java.util.Scanner;

public class test_coding_nin {
	
	public static int sqrt(int num)
	{
		int count = 0 ;
		while(num !=1)
		{
			int x = (int)Math.sqrt(num) ;
			if(x*x==num)
			{
				num = x ;
				count++ ;
			}
			else
			{
				num = num-1 ;
				count++ ;
			}
		}
		return count ;
	}

	public static void main(String[] args) {
		
//		int x = 4 ;
//		System.out.println(sqrt(x));
		
		
		Scanner s = new Scanner(System.in) ;
		
		int N = s.nextInt() ;
		
		int arr[] = new int[N] ;
		
		int count = 0 ;
		int temp = 0 ;
		
		for(int i=0 ; i<N ; i++)
		{
			arr[i] = s.nextInt() ;
			if(arr[i]<0)
			{
				for(int j=count ; j>0 ; j--)
				{
					System.out.print(j+" ");
				}
				//System.out.print(1);
				count = 0 ;
				temp++ ;
			}
			else
			{
				for(int k = temp ; k>0 ; k--)
				{
					System.out.print(k+" ");
				}
				temp = 0;
				count++ ;
			}
		}
		
		for(int j=count ; j>0 ; j--)
		{
			System.out.print(j+" ");
		}
		for(int m=temp ; m>0 ; m--)
		{
			System.out.print(m+" ");
		}

	}

}
