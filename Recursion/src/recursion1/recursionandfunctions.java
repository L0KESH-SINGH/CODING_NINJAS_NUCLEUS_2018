package recursion1;

public class recursionandfunctions {
	
	public static boolean check_sorted(int input[])
	{
		if(input.length<=1)
		{
			return true ;
		}
		if(input[0]>input[1])
		{
			return false ;
		}
		int small_input[] = new int[input.length -1];
		for(int i=1 ; i< input.length ; i++)
		{
			small_input[i-1] = input[i] ;
		}
		boolean small_ans = check_sorted(small_input) ;
		return small_ans ;
	}

	public static void main(String[] args) {
		
		int radhe[] = { 1 , 2 ,4 ,5 , 6,} ;
		System.out.println(check_sorted(radhe));

	}

}
