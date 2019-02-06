package twodarrays;

import java.util.Scanner;

public class largestrowORcolUM {
	
	public static int[][] twoDarrayinput(int rows , int cols)
	{
		Scanner s = new Scanner(System.in);
		 //rows = s.nextInt();
		 //cols = s.nextInt();
		int arr2d[][] = new int[rows][cols] ; 
		for(int i=0 ; i< rows ; i++ )
		{
			for( int j = 0 ; j<cols ; j++)
			{
				//System.out.println("enter element for "+i+"row and "+j+"column");
				arr2d[i][j] = s.nextInt();
			}
		}
		return arr2d ;
	}
	
	public static void findLargest(int input[][])
	{
		int rows = input.length ;
		int cols = input[0].length ;
		int array[] = new int[rows ] ;
		int array2[] = new int[cols] ;
		int k = 0 ;
		int temp = 0 ;
		String loki  = "row" ;
		int largest = Integer.MIN_VALUE ;
		int pt ;
		int low ;
		if(rows>=cols) 
         {
		pt = rows ;
		low = cols ;
	      }
	     else
		{
	     pt = cols ;
	     low = rows ;
		}
		for(int i = 0 ; i< pt   ; i++)
		{
			for(int j=0 ;  j< pt ;j++)
			{
				if(j < low) 
				{
				array[k] = array[k] + input[i][j] ; 
				}
				if(i < low) 
				{
				array2[k] = array2[k] + input[j][i] ;
				}
			}
			if(rows > cols && i == cols )
			{
		     break ;
			}
			if(array[k]>= array2[k] && array[k]>largest)
			{
				largest = array[k] ;
				temp = i ;
				loki = "row" ;
			}
			else if(array2[k]>array[k] && array2[k]>largest)
			{
				largest = array2[k] ; 
				temp = i ;
				loki = "column" ;
			}
			k++ ;
		}
		System.out.println(loki + " " +temp +" " + largest);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		int rows = s.nextInt();
		int cols = s.nextInt();
		int array[][] = twoDarrayinput(rows, cols) ;
		findLargest(array);

	}

}
