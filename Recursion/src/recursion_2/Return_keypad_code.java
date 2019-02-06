package recursion_2;

public class Return_keypad_code {
	
	public static String keywords(int n)
	{
		String ans = "" ;
		switch (n) {
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
	
	public static String[] keypad(int n)
	{
		if(n%10==0)
		{
			String ans[] = {""} ;
			return ans ;
		}
		String[] smallans = keypad(n/10) ;
		String str = keywords(n%10) ;
		 String ans[] = new String[str.length()* smallans.length] ;
		    int k=0 ;
			for(int i=0 ; i<smallans.length ; i++)
			{
				for(int j=0 ; j<str.length() ; j++)
				{
					ans[k] = smallans[i] + str.charAt(j) ;
					k++ ;
				}
			}
		
		return ans ;
	}

	public static void main(String[] args) {

		String ans[] = keypad(23) ;
		for(int i=0 ; i<ans.length ; i++)
		{
			System.out.println(ans[i]);
		}
		
	}

}
