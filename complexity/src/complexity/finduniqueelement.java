package complexity;

public class finduniqueelement {
	
	public static int findUnique(int[] arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			int temp = 0;
			for(int j=0 ; j<arr.length ; j++)
			{
				if(i!=j) {
				if(arr[i]==arr[j])
				{
					temp = 1 ;
				}}
			}
			if(temp == 0)
			{
				return arr[i] ;
			}
		}
		return -1 ;
	}

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,4,3,2,6,1} ;
		System.out.println(findUnique(array));

	}

}
