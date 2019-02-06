package whileloop;

import java.util.Scanner;

public class frantocelatgaptilln {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		while (a<=b)
		{
			int f = a;
		int d = (int)((5.0/9)*(f-32));
		
				System.out.print(a);
				System.out.print(" ");
				System.out.println(d);
				a = a+c;
		}

	}

}
