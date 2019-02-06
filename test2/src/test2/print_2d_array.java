package test2;

import java.util.Scanner;

public class print_2d_array {
	
	public static void print2DArray(int input[][])
	{
		int cols = input[0].length ;
		int n = cols ;
		int x= 0 ;
		for(int p = 0 ; p< cols ; p++) {
		for(int i=n ; i > 0 ; i--)
		{
			for(int j = 0 ; j< cols ; j++)
			{
				System.out.print(input[x][j] + " ");
			}
			System.out.println();
		}
		n-- ;
		x++ ;
		}
	}
	
	public static int[][] twoDarrayinput()
	{
		Scanner s = new Scanner(System.in);
		 int rows = s.nextInt();
		 int cols = s.nextInt();
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

	public static void main(String[] args) {
		
		int array[][] = twoDarrayinput() ;

		print2DArray(array);

	}

}
