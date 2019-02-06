package condition$loopsAssignments;

import java.util.*;

public class checkingsequence {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int[]Arr= new int[n];
		for(int i = 0 ; i<n ; i++)
		{
		    Arr[i]=s.nextInt();
		    
		}
		
		// for increasing ;  
		boolean check = false ;
		int min = Arr[0];
		for(int i=1 ; i< n ; i++)
		{
			if(min<Arr[i])
			{
				check= true;
				min=Arr[i];
			}
			else
			{
				check=false;
				break;
			}
				
		}
		
		
		// for decreaing
		boolean loki = false ;
		int max = Arr[0];
		for(int i=1 ; i< n ; i++)
		{
			if(max>Arr[i])
			{
				loki= true;
				max=Arr[i];
			}
			else
			{
				loki=false;
				break;
			}
				
		}
		if(check==true || loki==true)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
   }
}
