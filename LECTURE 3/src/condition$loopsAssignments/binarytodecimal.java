package condition$loopsAssignments;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result;
		
		int sum= 0;
		
		int c = 0;
		
		while(n!=0)
		{
			int b=1;
			
			int a = c ;
			result=(n%10);
			while(a>0)
			{
				b=b*2;
				a--;
			}
			sum = sum + (result*b) ;
			
			c++;
			n=n/10;
			
			
		}
		System.out.println(sum);
	}

}
