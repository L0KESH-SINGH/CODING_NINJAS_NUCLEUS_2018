package function;

import java.util.Scanner;

public class NcR {
	
	public static int factorial (int n)
	{
		int ans = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			ans = ans*i;
		}
		return ans ;
	}
	

	public static int ncr (int n , int r , int c)
	{
		int num = factorial(n);
		int den1 = factorial(r);
		int den2 = factorial(c);
		int result = num / (den1 *den2);
		return result;
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int result = ncr(n , r , n-r);
		System.out.println(result);

		
	}

}
