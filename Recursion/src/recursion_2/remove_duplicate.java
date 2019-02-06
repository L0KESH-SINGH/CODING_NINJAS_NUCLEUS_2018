package recursion_2;

public class remove_duplicate {
	
	public static String removeConsecutiveDuplicates(String s)
	{
		if(s.length()==1)
		{
			return s ;
		}
		String myans = removeConsecutiveDuplicates(s.substring(1)) ;
		if(!(s.charAt(0)==myans.charAt(0)))
		{
			String temp = s.charAt(0) + myans ;
			myans = temp ;
		}
		return myans ;
	}

	public static void main(String[] args) {
		
		System.out.println(removeConsecutiveDuplicates("aaabbc"));

	}

}
