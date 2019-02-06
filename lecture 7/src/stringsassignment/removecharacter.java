package stringsassignment;

import java.util.Scanner;

public class removecharacter {
	
	public static String removeAllOccurrencesOfChar(String input, char c)
	{
		String result = "" ;
		for(int i=0 ; i<input.length() ; i++)
		{
			if(input.charAt(i)!=c)
			{
				result = result + input.charAt(i) ;
			}
		}
		return result ;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		String loki = "lokesh is the best" ;
		char ch = s.nextLine().charAt(0) ;
		String output = removeAllOccurrencesOfChar(loki, ch);
		System.out.println(output);
	}

}
