package recursion2_assignment;

public class printallcodes {
	
	public static char helper(int i)
	{
		char ch = (char)(96 + i) ;
		return ch ;
	}
	
	public static void printAllPossibleCodes(String input , String output)
	{
		if(input.length()==1)
		{
			for(int i=0 ; i< output.length() ; i++)
			{
				System.out.println(output);
			}
		}
		int temp = input.charAt(0) - 48 ;
		output = output + helper(temp) ;
		printAllPossibleCodes(input.substring(1), output);
		if(input.length()>1)
		{
		int temp2 = 10*temp ;
		temp2 = temp2 + (input.charAt(1) - 48) ;
		String output2 = "" ;
		output2 = output2 + helper(temp2) ;
		if(temp2>=10 && temp2<=26)
		{
			printAllPossibleCodes(input.substring(1), output2);
		}
		}
	}

	public static void main(String[] args) {
		
		String temp = "123" ;
		printAllPossibleCodes( temp , "" );
		
	}

}
