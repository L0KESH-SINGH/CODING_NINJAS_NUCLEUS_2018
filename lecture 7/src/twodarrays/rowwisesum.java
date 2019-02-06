package twodarrays;

import java.util.Scanner;

public class rowwisesum {
	
	public static int[] sumoftwo2darrays(int rows , int cols , int[][]arr)
	{
		int array[] = new int[rows ] ;
		int k = 0 ;
		for(int i = 0 ; i<rows ; i++)
		{
			for(int j=0 ; j<cols ;j++)
			{
				array[k] = array[k] + arr[i][j] ; 
			}
			k++ ;
		}
		return array ;
	}
	
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
		
		int rows = s.nextInt();
		int cols = s.nextInt() ;
		int arr2d[][] = twoDarrayinput(rows, cols);
		int array[] = sumoftwo2darrays(rows, cols, arr2d);
		print(array);
		
	}
}