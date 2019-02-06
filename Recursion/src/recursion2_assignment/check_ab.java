package recursion2_assignment;

public class check_ab {
	
	public static boolean checkAB(String input)
	{
		boolean ans = false ;
		if(input.length()==0)
		{
			return true ;
		}
		
		if(input.length()==1)
		{
			if(input.charAt(0)=='a')
			{
				ans = true ;
				input = input.substring(1) ;
			}
		}
		else if(input.length()==2)
		{
			if(input.charAt(0)=='a' && input.charAt(1)=='a')
			{
				ans = true ;
				input = input.substring(2) ;
			}
		}
		else if(input.length()>=3)
		{
			if(input.charAt(0)=='a' && input.substring(1,3).equals("bb"))
			{
				ans = true ;
				input = input.substring(3) ;
			}
			else if(input.charAt(0)=='a' && input.charAt(1)=='a')
			{
				ans = true ;
				input = input.substring(1) ;
			}
		}
		return ans && checkAB(input) ;
	}

	public static void main(String[] args) {
		
		System.out.println(checkAB("abb"));
		
	}

}
