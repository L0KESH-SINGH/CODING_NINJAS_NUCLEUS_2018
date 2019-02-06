package rajattest;

public class toppleandreversestring {
	
	public static int prob(String str , int x , int y)
	{
		if(str.length()==0)
		{
			return 0 ;
		}
		String reverse = "";
        
        for(int i = str.length() - 1 ; i >= 0 ; i--)
        {
            reverse = reverse + str.charAt(i);
        }

		int ans1 = x + prob(reverse.substring(1),x,y) ;
		int ans2 = y + prob(str.substring(1),x,y) ;
		
		return Math.min(ans1 , ans2) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "01000" ;
		
		System.out.println(prob(str, 1,10));
		
		

	}

}
