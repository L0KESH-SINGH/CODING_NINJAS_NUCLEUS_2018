package practisesession1;

import java.util.Scanner;

public class sumofevenandodd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long a = 0;
		long b=0;
		//int i = 1;
		while(n!=0)
		{
			if((n%10)%2==0)
			{
				a=a+(n%10);
				
			}
			else
			{
				b=b+(n%10);
			}
			n=n/10;
		}
		System.out.println(a + " " + b);
		
	}

}
