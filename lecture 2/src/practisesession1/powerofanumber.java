package practisesession1;

import java.util.Scanner;

public class powerofanumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long x = s.nextLong();
		long b = 1;
		while(x!=0)
		{
			b=b*n;
			--x;
		}
		System.out.println(b);
		
	}

}
