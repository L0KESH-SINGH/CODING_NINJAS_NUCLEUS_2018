package recursion1;

public class find_index_of_number {
	
	public static int firstIndex(int input[], int x , int startindex , int temp)
	{
		if(startindex >= input.length)
		{
			return -1 ;
		}
		if(input[startindex]==x)
		{
			if(startindex<temp)
			System.out.print(startindex+" ");
			else
				return startindex ;
		}
		int smallans = firstIndex(input, x, startindex+1 , temp) ;
		return smallans ;
	}

	public static void main(String[] args) {
		
		int array[] = { 0 ,2, 3, 4, 0 , 8 , 0 ,2} ;
		int x = 0 ;
		int temp = 0 ;
		for(int i=0 ; i<array.length ; i++)
		{
			if(array[i]==x)
			{
				temp = i ;
			}
		}
		//System.out.println(temp);
		System.out.println(firstIndex(array, x, 0 , temp));

	}

}
