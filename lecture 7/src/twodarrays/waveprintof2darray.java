package twodarrays;

import java.util.Scanner;

public class waveprintof2darray {
	
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

	public static void wavePrint(int input[][])
	{
		int rows = input.length ;
		int cols = input[0].length ;
		int x = 0;
		int temp = rows - 1 ;
		for(int j=0 ; j< cols ; j++)
		{
			if(j%2==0 || j == 0)
			{
			for(int i=0 ; i< rows ;i++)
			{
				System.out.print(input[i][j]+" ");
			}
			}
			else
			{
				for(int i=temp ; i >=0 ;i--)
				{
					System.out.print(input[i][j]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int array[][] = twoDarrayinput();
		wavePrint(array);

	}

}
