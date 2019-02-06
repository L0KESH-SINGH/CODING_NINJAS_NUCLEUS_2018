package twodarrays;

public class spiralprint {
	
	public static void spiralPrint(int matrix[][])
	{
		int row = matrix.length ;
		int col = matrix[0].length ;
		int cols = 0 ;
		int cole = col - 1 ;
		int rows = 0 ;
		int rowe = row - 1 ;
		int counter = 0 ;
		while(counter < (row*col))
		{
			for(int i=cols ; i<=cole ; i++)
			{
				System.out.print(matrix[rows][i]+" ") ;
				counter++ ;
			}
			rows++;
			for(int i = rows ; i<=rowe ; i++)
			{
				System.out.print(matrix[i][cole]+" ");
				counter++ ;
			}
			cole-- ;
			for(int i = cole ; i>=cols ; i--)
			{
				System.out.print(matrix[rowe][i]+" ");
				counter++ ;
			}
			rowe-- ;
			for(int i =rowe ; i>=rows ; i--)
			{
				System.out.print(matrix[i][cols]+" ");
				counter++ ;
			}
			cols++;
		}
	}

	public static void main(String[] args) {
		
		int array[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} ,{13,14,15,16} };
		spiralPrint(array);

	}

}
