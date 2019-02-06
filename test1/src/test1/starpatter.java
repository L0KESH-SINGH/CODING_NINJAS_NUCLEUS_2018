package test1;

import java.util.Scanner;

public class starpatter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1 ;
		int q =n;
		while(i<=n)
		{
			int p=n;
			
			int j=1;
			while(j<=n)
			{
				if(j==q)
				{
					System.out.print("*");
					q--;
					p--;
					j++;
					continue;
				}
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
