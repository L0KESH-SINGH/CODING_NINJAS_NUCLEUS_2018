package rajattest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class recursion {
	
	public static int funct(int[]arr , int si)
	{
		if(si==arr.length)
		{
			return 0 ;
		}
		//Arrays.sort(arr);
		int count = 1 , recans = 0 ;
		
		for(int i=si ; i<arr.length-1 ; i++)
		{
			int temp = (arr[i+1] - arr[i]) ;
			if(temp == 0 || temp == 1)
			{
				count++ ;
			}
			else {
				break ;}
		}
		recans = funct(arr , si+1) ;
		return Math.max(count, recans) ;
	}
	
	public static void main(String[] args) {
		
		int[]arr = {4,13,2,3} ;
		Arrays.sort(arr);
		int ans = funct(arr , 0) ;
		System.out.println(ans);
		
	}

}
