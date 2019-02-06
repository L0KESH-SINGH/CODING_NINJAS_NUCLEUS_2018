package condition$loopsAssignments;

import java.util.Scanner;

public class sumorproduct {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		if(x==1)
		{
			int sum = 0;
			for( int i=1 ; i <=n ; i++)
			{
				sum = sum +i;
				
			}
			System.out.println(sum);
		}
		else if ( x==2)
		{
			long pro=1;
			for (int j =1 ; j<=n ; j++)
			{
				pro = pro *j;
				
			}
			System.out.println(pro);
		}
		else
		{
			System.out.println(-1);
		}
		
	}

}
