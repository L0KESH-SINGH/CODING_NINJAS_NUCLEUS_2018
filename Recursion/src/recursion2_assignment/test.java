package recursion2_assignment;

import java.util.Scanner;

public class test {
	
	public static  int maxdistance(int arr[]) {
		
		int temp = 0 ;
		int max = 0 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr.length && j!=i ; j++)
			{
				if(arr[i]==arr[j])
				{
					temp = Math.abs(j-i) ;
				}
				if(temp>max)
				{
					max = temp ;
				}
			}
		}
		return temp ;
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in) ;
		int N = s.nextInt() ;
		int M = s.nextInt() ;
		int matrix[][] = new int[N][M] ;
		for(int i=0 ; i<N ; i++)
		{
			for(int j=0 ; j<M ; j++)
			{
				int p = s.nextInt() ;
				matrix[i][j] = p ;
			}
		}
		int NQ = s.nextInt() ;
		int arr[][] = new int[NQ][M] ;
		
		for(int k=0 ; k<NQ ;k++)
		{
			for(int b=0 ; b<M ;b++)
			{
				int w = s.nextInt() ;
				arr[k][b] = w ;
			}
		}
		
		for(int g=0 ; g<NQ ; g++) {
		int temp = 0 ;
		int c= 0;
		for(int o=0 ; o<M ; o++)
		{
			if(arr[g][o]==-1)
			{
				c++ ;
			}
		}
		if(c==3)
		{
			System.out.println(N);
			continue ;
		}
		for(int q=0 ; q<N ; q++)
		{
			int l = 0 ;
			for(int r=0 ; r<M ; r++)
			{
				if((matrix[q][r] == arr[g][r]) || (arr[g][r] == -1))
				{
					l++ ;
				}
			}
			if(l==3)
			{
				temp++ ;
			}
		}
		System.out.println(temp);
		}
		
		
	}

}
