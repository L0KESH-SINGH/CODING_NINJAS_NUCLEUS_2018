package stringsassignment;

import java.util.Scanner;

public class highestoccuringchar {
	
	public static char highestOccuringCharacter(String inputString)
	{
		int largest = Integer.MIN_VALUE ;
		int counter = 0 ;
		int temp = 0 ;
		for(int i=0 ; i< inputString.length() ; i++)
		{
			counter = 0 ;
			for(int j = 0 ; j < inputString.length() ; j++)
			{
				if(inputString.charAt(i)==inputString.charAt(j))
				{
					counter ++ ;
				}
			}
			if(counter >largest)
			{
				largest = counter ;
				temp = i ;
			}
		}
		char ch = inputString.charAt(temp) ;
		return ch ;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String loki = "abbssshrffff" ;
		char ch = highestOccuringCharacter(loki);
		System.out.println(ch);

	}

}
