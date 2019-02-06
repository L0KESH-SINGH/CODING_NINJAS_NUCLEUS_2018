package stringsassignment;

public class removeconsecutiveduplicate {
	
	public static String removeConsecutiveDuplicates(String input)
	{
		input = input+ 'A' ;
		String str = "" ;
		char str1[] = input.toCharArray() ;
		char str2[] = input.toCharArray() ;
		char str3[] = new char[20] ;
		int x = 0 ;
		for(int i= 0 ; i<input.length() ; i++ )
		{
			
			for(int j= i+1 ; j<input.length() ; j++)
			{
				if(str1[i]==str2[j])
				{
					i++ ;
				}
				else
				{
					str3[x] = str2[j] ;
					x++ ;
					str2[j] = 'P' ;
					break ;
				}
			}
			
			str = str + str3[x-1] ;
			
		}
		return str ;
	}

	public static void main(String[] args) {
		
		String input = "aabccbaa" ;
		String str = removeConsecutiveDuplicates(input);
		System.out.println(str);

	}

}
