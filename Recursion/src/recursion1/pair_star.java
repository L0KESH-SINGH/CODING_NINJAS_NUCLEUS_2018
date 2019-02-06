package recursion1;

public class pair_star {
	
	public static String addStars(String s , String temp)
	{
		if(s.length()==1)
		{
			return temp + s ;
		}
		temp = addStars(s.substring(1), temp) ;
		if(s.charAt(0)==s.charAt(1))
		{
			temp = s.charAt(0) + "*" + temp ;
		}
		else
		{
			temp = s.charAt(0) + temp ;
		}
		return temp ;
	}

	public static void main(String[] args) {
		
		String loki = "hello" ;
		String temp = "" ;
		System.out.println(addStars(loki, temp));

	}

}
