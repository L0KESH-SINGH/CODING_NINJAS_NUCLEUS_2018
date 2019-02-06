package patternpractise;

import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int space=1;
			int j=1;
			while(space<=(n-i))
			{
				System.out.print(1);
				space++;
			}
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
