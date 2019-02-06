package recursion1;

public class findXinARRAY {
	
	public static boolean checkNumber(int input[], int x)
	{
		if(input[0]==x)
		{
			return true ;
		}
		if(input.length<=1)
		{
			return false ;
		}
		int small_input[] = new int[input.length -1];
		for(int i=1 ; i< input.length ; i++)
		{
			small_input[i-1] = input[i] ;
		}
		return checkNumber(small_input, x) ;
	}

	public static void main(String[] args) {
		
		int array[] = { 1, 2 ,3,4,5,6};
		int x= 0 ;
		System.out.println(checkNumber(array, x));

	}

}
