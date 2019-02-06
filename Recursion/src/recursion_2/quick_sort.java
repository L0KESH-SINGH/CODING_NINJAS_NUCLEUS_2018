package recursion_2;

public class quick_sort {
	
	public static void quicksort(int input[] , int si , int ei)
	{
		if(si>ei)
		{
			return ;
		}
		int pivotpos = partion(input , si , ei) ;
		
		quicksort(input, si, pivotpos-1);
		quicksort(input, pivotpos+1, ei);
	}
	
	public static int partion(int input[] , int si , int ei)
	{
		int count = 0 ;
		for(int i=si+1 ; i<=ei ; i++)
		{
			if(input[i]<=input[si])
			{
				count++ ;
			}
		}
		int pivotpos = si + count ;
		int temp = input[pivotpos] ;
		input[pivotpos] = input[si] ;
		input[si] = temp ;
		
		int p = si ;
		int j = ei ;
		while(p<pivotpos && j>pivotpos)
		{
			
			if(input[p]<=input[pivotpos])
			{
				p++ ;
			}
			else if((input[j]<=input[pivotpos]))
			{
				int temp2 = input[j] ;
				input[j] = input[p] ;
				input[p] = temp2 ;
				p++ ;
				j-- ;
			}
			else
				j-- ;
		}
		return pivotpos ;
	}

	public static void main(String[] args) {
		
		int array[] = {2,9,8,1,8,7,5,4,3,2,9,7,4,4,33} ;
		quicksort(array, 0, (array.length-1));
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println(array[i]);
		}

	}

}
