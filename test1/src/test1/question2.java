package test1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		int n = num;
		int c ;
		int r;
		
		for( r=1 ; r<= num ; r++ , n-- )
		{
			for(  c =1 ; c <r ; c++ )
			{
				System.out.print(0);
			}
			
			for(c = 1 ; c<=n ; c++)
			{
				if(c==1)
				{
					System.out.print("*");
				}
				else
					System.out.print(0);
				
			}
			
			System.out.print("*");
			for(c=1 ; c<n ; c++)
			{
				System.out.print(0);
			}
			for(c=1 ; c<=r ; c++)
			{
				if(c==1)
				System.out.print("*");
				else
					System.out.print(0);
			}
			System.out.println();
				
			
			}
		}
		
		
		
	}


