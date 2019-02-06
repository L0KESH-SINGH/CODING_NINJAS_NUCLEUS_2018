package whileloop;

import java.util.Scanner;

public class sumofnofrom1ton {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int d = 1;
		int p = 0;
		while (d<=n) 
		{
			if(d%2==0)
			{
				p=p+d;
			}
			d=d+1;
		}
		System.out.println(p);
	}
}
