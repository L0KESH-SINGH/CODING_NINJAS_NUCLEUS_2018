package patternpractise;

import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int b =n;
		while(i<=n)
		{
			int j=1;
			
			while(j<=b)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			b--;
			i++;
		}
		i=2;
		while(i<=n)
		{
			int c=1;
			while(c<=i)
			{
				System.out.print(c);
				c++;
				
			}
			System.out.println();
			i++;
		}
		
	}

}