package complexity;

public class findduplicate {
	
	public static int duplicate(int[] arr)
	{
		int size = arr.length ;
		int helper = ((size-1)*(size-2))/2 ;
		int sumofarray = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			sumofarray += arr[i] ;
		}
		int ans = sumofarray - helper ;
		return ans ;
	}

	public static void main(String[] args) {
		
		int array[] = { 0 ,7 ,2, 5, 4, 7, 1, 3, 6 } ;
		System.out.println(duplicate(array));
		
		
	}

}
