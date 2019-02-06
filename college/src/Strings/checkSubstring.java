package Strings;
import java.util.*;

public class checkSubstring{
	
	public static char[] appendatpos(char[] result , char input[] , Integer pos)
	{
		char temp[] = result ;
		result = new char [temp.length + input.length] ;
		for(int i=0 ; i < pos ;i++)
		{
			result[i] = temp[i] ;
		}
		int k = pos ;
		for(int j=0 ; j< input.length ;j++)
		{
			result[k] = input[j] ;
			k++ ;
		}
		int h = k ;
		for(int m=pos ; m<temp.length ; m++)
		{
			result[h] = temp[m] ;
			h++ ;
		}
		return result ;
	}

	public static void main(String[] args) {
		
		char ch[] = {'a','b','c','d'} ;
		char ch2[] = {'a','x'} ;
		ch = appendatpos(ch, ch2, 1) ;
		for(int i=0 ; i< ch.length ; i++)
		{
			System.out.print(ch[i] + " ");
		}

	}

}
