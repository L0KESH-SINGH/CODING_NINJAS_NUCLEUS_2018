package complexity;

public class rotate_array {
	
	public static void rotate(int[] arr, int d)
	{
		int array[] = new int[d] ;
		for(int j=0 ; j<d ; j++)
		{
			array[j] = arr[j] ;
		}
		int i ;
		for(i=0 ; i+d<arr.length ; i++)
		{
			arr[i] = arr[i+d] ;
		}
		int u=0 ;
		for( int k=i ; k<arr.length ; k++)
		{
			arr[k] = array[u] ;
			u++ ;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1,2,3,4,5,6,7,8 } ;
		rotate(array, 2);
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
