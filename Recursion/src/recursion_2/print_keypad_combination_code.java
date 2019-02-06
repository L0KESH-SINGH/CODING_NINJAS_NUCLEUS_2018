package recursion_2;

public class print_keypad_combination_code {
	
	public static String keywords(int n)
	{
		String ans = "" ;
		switch (n) 
		{
		case 2 : ans = "abc" ; return ans ;
			
		case 3 : ans = "def" ; return ans ;
			
		case 4 : ans = "ghi" ; return ans ;
		
		case 5 : ans = "jkl" ; return ans ;
		
		case 6 : ans = "mno" ; return ans ;
		
		case 7 : ans = "pqr" ; return ans ;
		
		case 8 : ans = "stuv" ; return ans ;
		
		case 9 : ans = "wxyz" ; return ans ;

		default: return "" ;
			
		}
	}
	
	public static void printKeypad(int input ,String outputsofar)
	{
		if(input==0)
		{
			System.out.println(outputsofar);
			return ;
		}
		String str = keywords(input%10) ;
		for(int i=0 ; i<str.length() ; i++)
		{
			printKeypad(input/10 , str.charAt(i) + outputsofar);
		}
	}
	
	public static void printKeypad(int input)
	{
		printKeypad(input,"");
	}

	public static void main(String[] args) {
		
		printKeypad(23);

	}

}
