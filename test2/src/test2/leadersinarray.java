package test2;

public class leadersinarray {
	
	public static void leadersinarray2(int input[])
	{
		int size = input.length ;
		for(int i=0 ; i<size ; i++)
		{
			int temp = 0 ;
			for(int  j = i+1 ; j< size ; j++ )
			{
				if(input[i]<input[j])
				{
					break ;
				}
				else if(j==size-1)
					temp = i ;
			}
			if(i==size -1)
				temp = i ;
			if(temp!=0)
				System.out.print(input[temp] + " ");
		}
	}

	public static void main(String[] args) {
		
		int array[] = { 13, 17, 5, 4, 6 } ;
		leadersinarray2(array);

	}

}
