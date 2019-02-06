package condition$loopsAssignments;

import java.util.Scanner;

public class squarerootofn {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		// for ( int i = 1 ; i >0 ; i++)
		// {
		// if((i*i)<(n))
		// {
		// continue;
		// }
		// else if ((i*i)==(n))
		// {
		// System.out.println(i);
		// break ;
		// }
		// else
		// {
		// System.out.println(--i);
		// break;
		// }
		//
		// }
		for (int i = 1; i <= n / 2; i++) {
			if ((i * i) == n) {
				System.out.println(i);
				break;
			}
			if ((i * i) > n) {
				System.out.println(--i);
				break;
			}
		}
 s.close();
	}

}
