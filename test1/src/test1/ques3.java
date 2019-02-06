package test1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int r = n;
		int[] Arr = new int[20];
		int i = 0;
		int marker = 0 ;
		while(n!=0)
		{
			Arr[i]=(n%10);
			n=n/10;
			marker = i +1 ;
			i++;
			
		}
		int sum = 0 ;
		//int d=marker;
		for(int l = 0 ; l < marker ; l++)
		{
		int b=1 ;
		int d=marker;
		while(d!=0)
		    {
			b=b*(Arr[l]);
			--d;
		    }
		sum= sum +b ;
		
		}
		if(sum==r)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
	}

}
