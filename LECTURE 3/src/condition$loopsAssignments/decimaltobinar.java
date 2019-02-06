package condition$loopsAssignments;

import java.util.*;

public class decimaltobinar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] Arr = new int[50];
		int i =0;
		int marker = 0;
		while(n!=0)
		{
			Arr[i]=(n%2);
			n=n/2;
			marker = i ;
			i++;
			
		}
		
		for(int c= marker ; c>=0 ; c--)
		{
			System.out.print(Arr[c]);
		}
		
	}

}
