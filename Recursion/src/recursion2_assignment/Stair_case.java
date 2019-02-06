package recursion2_assignment;

public class Stair_case {
	
	public static int staircase(int n)
	{
		if(n==0)
		{
			return 1 ;
		}
		else if(n<0)
		{
			return 0 ;
		}
		int smallans = staircase(n-1) + staircase(n-2) + staircase(n-3) ; 
		
		return smallans ;
	}

	public static void main(String[] args) {
		
		System.out.println(staircase(4));

	}

}
