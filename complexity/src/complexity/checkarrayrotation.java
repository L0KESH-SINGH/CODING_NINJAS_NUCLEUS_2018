package complexity;

public class checkarrayrotation {
	
	public static int arrayRotateCheck(int[] arr)
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			if(arr[i]-arr[i+1]>0)
			{
				return i+1 ;
			}
		}
		return 0 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {3,6,8,9,10} ;
		System.out.println(arrayRotateCheck(array));
	}

}
