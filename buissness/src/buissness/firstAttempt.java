package buissness;

import java.util.Scanner;

public class firstAttempt {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double profit = s.nextDouble() ;
		double x = profit ;
		double b = 0 ;
		double tloss = x ;
		double a = 0 ;
		for (int i = 1 ; i<n ; i++)
		{
			//double tloss = 0 ;
			profit = profit + (50%profit) ;
			for(int j = i ; j>1 ; j--)
			{
			b = b + (20.0%tloss);
			tloss=20.0%tloss;
			a = a + b ;
		    }
			//a = a + loss ;
		}
		System.out.println(profit);
		double p = profit - a ;
		System.out.println(p);
	}

}
