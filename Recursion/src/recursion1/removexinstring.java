package recursion1;

public class removexinstring {
	
	public static String removeX(String input , String ans )
	{
			if(input.length()<1)
			{
				return ans ;
			}
			if(!(input.charAt(0)=='x'))
			{
				ans += input.charAt(0) ;
			}
			return removeX(input.substring(1), ans) ;
	}

	public static void main(String[] args) {
		
		String s = "xbaxsss" ;
		String l ="" ;
		String k = "1234" ;
		System.out.println(removeX(s, l));
		
	}

}
