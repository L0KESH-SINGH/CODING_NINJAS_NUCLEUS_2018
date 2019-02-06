package recursion2_assignment;

public class Binary_search {
	
	public static int binarySearch(int input[], int element , int start , int end)
	{
		if(start>end)
		{
			return -1 ;
		}
		int mid= (start+end)/2 ;
		if(input[mid]==element)
		{
			return mid ;
		}
		int ans = 0 ;
		if(element>input[mid])
		{
			ans = binarySearch(input, element, mid+1, end) ;
		}
		else
			ans = binarySearch(input, element, start, mid-1) ;
		return ans ;
	}

	public static void main(String[] args) {
		
		int array[] = {1, 4, 7, 2, 5, 8} ;
		System.out.println(binarySearch( array, 6 , 0 , 6));

	}

}
