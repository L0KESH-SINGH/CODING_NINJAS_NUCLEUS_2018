package strings;

public class printallSubstrings {
	
	public static void printSubstrings(String str)
	{
		for( int i=0 ; i<str.length() ; i++)
		{
			for(int j= i+1 ; j<str.length() + 1 ; j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "xyz is my name" ;
		printSubstrings(str);

	}

}
