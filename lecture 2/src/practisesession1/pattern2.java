package practisesession1;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		char ch = 'A';
		while(i<=n)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print(ch);
				j++;
				
			}
			System.out.println();
			i++;
			ch++;
		}
		
	}

}
