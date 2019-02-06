package test3;

import java.util.*;

public class maximum_app_profit {
	
	public static int maximumProfit(int budget[])
	{
		Arrays.sort(budget);
		
		int cost[] = new int[budget.length] ;
		for(int i=0 ; i<budget.length ; i++)
		{
			cost[i] = budget[i] * (budget.length-i) ;
		}
		int max = Integer.MIN_VALUE ;
		for(int i =0 ; i< cost.length ; i++ )
		{
			if( cost[i] > max)
			{
				max = cost[i] ;
			}
		}
		return max ;
	}

	public static void main(String[] args) {
		
		int [] array = { 30 , 20 , 53 , 14 } ;
		System.out.println(maximumProfit(array));

	}

}
