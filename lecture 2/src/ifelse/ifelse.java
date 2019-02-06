package ifelse;

import java.util.*;
public class ifelse {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int rem = (n%2);
		if (rem == 0)
		{
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
