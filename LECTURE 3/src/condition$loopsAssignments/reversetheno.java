package condition$loopsAssignments;

import java.util.*;

public class reversetheno {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;
		
		
		while(n>0)
		{
			if(n%10==0)
			{
				n=n/10;
				continue;
			}
			else 
			{
			   break ;	
			}
			
		}
		while(n!=0)
		{
			result = n % 10 ;
			
			System.out.print(result);
			n=n/10;
			
		}
		
	}

}
