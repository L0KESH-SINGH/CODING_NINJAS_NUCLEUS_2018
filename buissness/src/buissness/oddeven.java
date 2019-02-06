package buissness;

import java.util.Random ;
import java.util.Scanner;

public class oddeven {
	
	public static void compare(int sum , int sum2)
	{
		if(sum>sum2)
		{
			System.out.println("congrats you won the match !");
		}
		else if(sum<sum2)
		{
			System.out.println("sorry you loose");
		}
		else if(sum == sum2)
		{
			System.out.println("bad luck match draws");
		}
	}
	
	public static int balling()
	{
		System.out.println("time for u to ball start now ! ");
		Scanner s = new Scanner(System.in);
		int sum2=0;
		int y=1;
		int input = 0 ;
		int n = 0 ;
		int b = 0 ;
		while(y>0)
		{
			input = s.nextInt();
			b = randomint(n);
			System.out.println("baap shows "+b);
			if(input!=b)
			{
				sum2 = sum2 + b ;
			}
			else if(input==b)
			{
				System.out.println("baaps got caught !");
				System.out.println("baaps total score = " + sum2);
				y=-1;
			}
	     }
			return sum2;
	}
	
	public static int batting()
	{
		Scanner s = new Scanner(System.in) ;
		System.out.println("bat well ;) ");
		int n = 2 ;
		int b=0 ;
		int input = 0 ;
		int y =1 ;
		int sum = 0 ;
		while(y>0)
		{
			input = s.nextInt();
			if(input>10)
			{
				System.out.println("chutiya na bana ! bhag ...");
				System.out.println("your total score = "+sum + " as per disqualification");
				break ;
			}
			b = randomint(n);
			System.out.println("baap shows "+b);
			if(input!=b)
			{
				sum = sum + input ;
			}
			else if(input==b)
			{
				System.out.println("out :p");
				System.out.println("your total score = "+sum);
				y = -1 ;
			}
		}
		return sum ;
	}
	
	public static int randomint(int b)
	{
		for(int i=1 ; i>0 ; i++)
		{
			Random rand = new Random();
			 b = 0 ;
		b = rand.nextInt(11);
		if(b==0)
		{
			continue ;
		}
		else
		{
			break ;
		}
		}
		return b ;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("odd(1) or even(0)....?");
		int a = s.nextInt();
		if(a>1)
		{
			System.out.println("wrong choice !");
			return ;
		}
		System.out.println("enter the no for toss !");
		int n = s.nextInt();
		if(n>10)
		{
			System.out.println("wrong choice");
			return ;
		}
		int b = randomint(n) ;
		System.out.println("baap shows "+ b);
		if(((a==0) && ((n+b)%2==0)) || ((a==1)&&((n+b)%2!=0 )))
		{
			System.out.println("you won the toss , bat(1) or ball(0) ....?");
			int c = s.nextInt();
			if(c==1)
			{
				int sum = batting();
				int sum2 = balling();
				compare(sum, sum2);
			}
		
		if(c==0)
		{
			int sum2 = balling();
			int sum = batting();
			compare(sum, sum2);
		}
		
		}
		else
		{
			System.out.println("you loose the toss ! ");
			Random rand = new Random();
			 int l = 3 ;
		    l = rand.nextInt(2);
		     if(l==0)
		     {
		    	 System.out.println("baap chooses to bat first");
		    	 int sum2 = balling();
		    	 int sum = batting();
		    	 compare(sum, sum2);
		     }
		     else if(l==1)
		     {
		    	 System.out.println("baap chooses to ball first");
		    	 int sum = batting();
		    	 int sum2 = balling();
		    	 compare(sum, sum2);
		     }
		}
	}

}
