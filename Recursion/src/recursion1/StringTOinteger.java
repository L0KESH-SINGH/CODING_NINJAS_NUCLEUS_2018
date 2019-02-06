package recursion1;

public class StringTOinteger {
	
	public static int convertStringToInt(String input)
	{
		if(input.length()==1)
		{
			int n = input.charAt(0) - '0' ;
			return n ;
		}
		int count = 0;
		int ten = 1 ;
		while(count<input.length()-1)
		{
			ten = ten * 10 ; ;
			count++ ;
		}
		int b = input.charAt(0) - '0' ;
		int a = convertStringToInt(input.substring(1));
		return (b*ten)+a ;
	}

	public static void main(String[] args) {
		
		String s = "12345" ;
		System.out.println(convertStringToInt(s));

	}

}
