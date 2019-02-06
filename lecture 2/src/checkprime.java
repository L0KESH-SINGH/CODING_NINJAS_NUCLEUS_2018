import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a  = s.nextInt();
		int d = 2;
		while (d<a) {
			if(a%d==0) {
				System.out.println("not prime");
			return;
			}
			d=d+1;
		}
System.out.println("prime");
	}

}
