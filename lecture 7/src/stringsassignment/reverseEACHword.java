package stringsassignment;

public class reverseEACHword {
	
	public static String reverseEachWord(String str)
	{
		str = str + 'A' ;
		int start = 0 ;
		String reverse = "" ;
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)==' ' || str.charAt(i)=='A')
			{
				for(int j= i-1 ; j>= start ; j-- )
				{
					reverse = reverse + str.charAt(j) ;
				}
				start = i + 1 ;
				reverse = reverse + ' ' ;
			}
		}
		return reverse ;
	}

	public static void main(String[] args) {
		
		String loki = "lokesh is my name" ;
		String reverse = reverseEachWord(loki) ;
		System.out.println(reverse);

	}

}
