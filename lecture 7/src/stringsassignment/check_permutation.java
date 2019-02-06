package stringsassignment;

public class check_permutation {
	
	public static boolean isPermutation(String input1, String input2)
	{
		char str1[] = input1.toCharArray() ;
		char str2[] = input2.toCharArray() ;
		boolean loki = false ;
		if(input1.length()==input2.length())
		{
		  for(int i=0 ; i<input1.length() ; i++)
		  {
			  loki = false ;
			  for(int j=0 ; j<input2.length() ; j++)
			  {
				  if(str1[i]==str2[j])
				  {
					  loki = true ;
					  str2[j] = 'A' ;
					  break ;
				  }
			  }
			  if(loki==false)
			  {
				  return loki ;
			  }
			  
		  }
		}
		else
		{
			return loki ;
		}
		return loki ;
	}

	public static void main(String[] args) {
		
		String one = "abca" ;
		String two = "cbaa" ;
		boolean loki = isPermutation(one, two);
		System.out.println(loki);

	}

}
