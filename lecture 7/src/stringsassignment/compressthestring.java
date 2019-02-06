package stringsassignment;

import java.util.Scanner;

public class compressthestring {
	
	public static String compress(String inputString)
	{
		String str = "" ;
		for( int i=0 ; i<inputString.length() ; i++)
		{
			int counter = 0 ;
			for(int j=i ; j<inputString.length(); j++)
			{
				if(inputString.charAt(i)!=inputString.charAt(j))
				{
					break ;
				}
				counter++ ;
			}
			if(counter != 1)
			{
			str = str + inputString.charAt(i) + counter;
			}
			else {
				str = str + inputString.charAt(i) ;
			}
			//System.out.println(str.charAt(x));
			i = i+(counter-1) ;
		}
		return str ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String loki = "abbsssffffui" ;
		String lok = compress(loki);
		for(int i=0 ; i<lok.length() ; i++)
		{
			System.out.println(lok.charAt(i));
		}

	}

}
