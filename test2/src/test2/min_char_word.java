package test2;

public class min_char_word {
	
	public static String minLengthWord(String str)
	{
		String pp = "" ;
		int k = 0 ;
		int count = 0 ;
		str = str + 'A' ;
		int max = Integer.MAX_VALUE ;
		int loki = 0;
		int temp = 0 ;
		for(int i=0 ; i< str.length() ; i++)
		{
			
			if(str.charAt(i)==' ' || str.charAt(i)=='A')
			{
				
				if(loki<max) {
					k= count ;
				max = loki ;
						temp = i;
						}
				loki = 0 ;
				count = i+1 ;
				
			}
			else
				loki++ ;
			
		}
		pp = str.substring(k , temp) ;
		return pp ;
	}

	public static void main(String[] args) {
		
		

	}

}
