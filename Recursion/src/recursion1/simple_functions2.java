package recursion1;

public class simple_functions2 {
	
	public static String replace(String input , String temp)
	{	
		if(input.length()<=1)
		{
			return temp + input ;
		}
		temp = replace(input.substring(1), temp) ;
		
			if(temp.charAt(0)=='i' && input.charAt(0)=='p')
			{
				temp = "3.14" + temp.substring(1) ;
			}
			else
			{
				temp = input.charAt(0) + temp ;
			}
		
		return temp ;
	}
	
	public static void increasingorder(int n)
	{
		if(n==0)
		{
			return ;
		}
		System.out.println(n);
		increasingorder(n-1);
		//System.out.println(n);
	}

	public static void main(String[] args) {
		
		String input = "piip" ;
		String ans = "" ;
		System.out.println(replace(input, ans));
		increasingorder(10);
		
	}

}
