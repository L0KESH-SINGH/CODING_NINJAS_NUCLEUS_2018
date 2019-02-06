package strings;

public class checkPallindrome {
	
	public static boolean checkPalindrome(String str)
	{
		String loki = "" ;
		for(int i= str.length() - 1 ; i>=0 ; i--)
		{
		loki = loki + str.charAt(i) ;
		}
		return str.contains(loki);
	}

	
	public static void main(String[] args) {
		
		String str = "naman" ;
		boolean loki =checkPalindrome(str);
		System.out.println(loki);

	}

}
