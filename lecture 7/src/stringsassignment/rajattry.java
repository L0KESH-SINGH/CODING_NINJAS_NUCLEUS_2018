package stringsassignment;

public class rajattry {

	public static void main(String[] args) {
		


		String one = "edcba" ;
		String two = "abcde" ;
		boolean loki = str(one, two);
		System.out.println(loki);

	}
	
	public static Boolean str(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(!(s1.charAt(i)==s2.charAt(j)))
				{
					return false;
					
				}
		
			}
			
		}
		return true;
	}

}
