package recursion1;

import java.util.Scanner;

public class simple_functions {
	
	public static void print(int n){
		if(n == 1){
			System.out.print(1+" ");
          return ;
		}
      else{
		print(n - 1);}
      System.out.print(n+ " ");
	}

	public static int power(int x, int n) {
		
	      if(n==0)
	      {
	        return 1 ;
	      }
	      return (power(x,n-1))*x ;
			
		}
	
	public static int countzero(int n){
		
		if(n/10 == 0)
		{
			return 0 ;
		}
		int smallans = 0 ;
		if(n%10==0)
		{
			smallans=1 ;
		}
		
		return smallans + countzero(n/10);
		
	}
	
	public static double findGeometricSum(int k)
	{
		if(k<=0)
		{
			return 1 ;
		}
		double smallans = 1 ;
		for(int i=0 ; i<k ; i++)
		{
			smallans = smallans * (0.5) ;
		}
		//System.out.println(smallans);
		return findGeometricSum(k-1) + smallans ;
	}
	
	public static int fib(int n)
	{
		if(n==0 || n==1)
		{
			return n ;
		}
		return fib(n-1) + fib(n-2) ;
	}
	
	public static boolean isStringPalindrome(String input , int start , int end)
	{
	    if(end-start<0)
	    {
	    	return true ;
	    }
	    if(input.charAt(start)!=input.charAt(end))
	    {
	    	return false ;
	    }
	   return isStringPalindrome(input, start+1, end-1) ;
	}

	public static int sumOfDigits(int input)
	{
		if(input/10==0)
		{
			return input ;
		}
		return (input%10) + sumOfDigits(input/10) ;
	}
	
	public static void twotopowerNcheck(int []input)
	{
		
		for(int i=0 ; i<input.length ; i++)
		{ 
			if(input[i]==1)
			{
				input[i]=0 ;
				continue ;
			}
			while(input[i]!=1)
			{
				if(input[i]%2!=0)
				{
					input[i] = 0 ;
					break ;
				}
				input[i] = input[i]/2 ;
			}
			if(input[i]!=0)
			{
				input[i]= 1 ;
			}
		}	
	}
	
	public static void main(String[] args) {
		

//		Scanner s = new Scanner(System.in) ;
//		print(22);
//		System.out.println();
//		int x = power(2,4);
//		System.out.println(x);
//		
//		int p = countzero(12004) ;
//		System.out.println(p);
//		
//		System.out.println(findGeometricSum(3));
//		
//		System.out.println(isStringPalindrome("abccbl",0,5));
//		
//		String se = "loki" ;
//		System.out.println(se.length());
//		
//		System.out.println(sumOfDigits(2099));
//		//System.out.println(fib(7));
		
		int array[] = {1,2,8,10,16,32} ;
		twotopowerNcheck(array);
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
