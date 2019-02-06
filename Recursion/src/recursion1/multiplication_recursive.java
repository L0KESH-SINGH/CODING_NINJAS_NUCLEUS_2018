package recursion1;

public class multiplication_recursive {
	
	public static int multiplyTwoIntegers(int m, int n)
	{
		if(n<=1)
		{
			return m ;
		}
		return multiplyTwoIntegers(m, n-1) + m ;
	}

	public static void main(String[] args) {
		
		System.out.println(multiplyTwoIntegers(6, 10));

	}

}
