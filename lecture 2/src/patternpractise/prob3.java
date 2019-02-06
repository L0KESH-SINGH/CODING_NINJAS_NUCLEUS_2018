package patternpractise;

import java.util.Scanner;

public class prob3 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int b=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
				b=j-2;
			}
			while(b>=1)
			{
				System.out.print(b);
				b--;
			}
			System.out.println();
			i++;
		}
		
	}

}