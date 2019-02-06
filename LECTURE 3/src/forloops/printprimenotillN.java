package forloops;

import java.util.Scanner;

public class printprimenotillN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =2; i<=n ; i++)
		{
			int x= 0;
			for(int j=2 ; j<i ; j++)
			{
				
				if((i%j)==0)
				{
					x = 1 ;
					break;
				}
			}
			if(x==0)
			{
				System.out.println(i);
			}
		}

	}

}
