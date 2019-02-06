package strings;

public class countwords {
	
	public static int countWords(String str)
	{
		int counter = 1 ;
		for(int i=0 ; i< str.length() ; i++)
		{
			if(str.charAt(i)==' ')
			{
				counter++ ;
			}
		}
		return counter ;
	}

	public static void main(String[] args) {
		
		
		
	}

}
