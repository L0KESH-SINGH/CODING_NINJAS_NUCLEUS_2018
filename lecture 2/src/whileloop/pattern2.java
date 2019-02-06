package whileloop;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n = s.nextInt();
		int val = 1;
		int space = 1;
		int j=1;
		int i=1;
		while ( i<=n)
		{
			while (space <= (n-i))
			{
				System.out.print(" ");
				space = space +1;
				}
			while (j<=i)
			{
				System.out.print(val);
				val=val+1;
				j=j+1;
				
			}
			System.out.println();
			i=i+1;
			space =1;
			j=1;
		}
		

	}

}
