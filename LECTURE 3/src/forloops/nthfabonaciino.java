package forloops;

import java.util.Scanner;

public class nthfabonaciino {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int a=0;
		int b = 1;
		int c=0;
		
		for (int i=1;i<n;i++)
		{
			c=b;
			b=a+b;
			a=c;
			
		}
		System.out.print(b + " ");
		
	}

}
