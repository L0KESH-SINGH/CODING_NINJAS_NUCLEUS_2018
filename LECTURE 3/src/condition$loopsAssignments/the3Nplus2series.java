package condition$loopsAssignments;

import java.util.Scanner;

public class the3Nplus2series {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int series = 0;
		for ( int i =1 ; i<=x ; i++)
		{
			series = 3*i + 2 ;
			if (series%4==0)
			{
				x++;
				continue;
			}
			System.out.print(series + " ");
		}
		
		
	}

}
