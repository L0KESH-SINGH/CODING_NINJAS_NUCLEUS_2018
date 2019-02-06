package arrays;

public class isarraysorted {
	
	public static boolean ISsorted(int [] arr )
	{
		int max = -1 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i] ;
			}
			else
			{
				return false  ;
			}f
		}
		return true  ;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,7,9,10} ;
		System.out.println(ISsorted(arr));

	}

}
