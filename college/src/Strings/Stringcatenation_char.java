package Strings;

import java.util.Scanner;

public class Stringcatenation_char {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		int size1 = s.nextInt() ;
		char ch1[] = new char[size1] ;
		for(int j=0 ; j<size1 ; j++)
		{
			ch1[j] = s.next().charAt(0);
		}
		int size2 = s.nextInt() ;
		char temp[] = ch1 ;
		ch1 = new char[size1+size2];
		for(int i=0 ; i <size1 ; i++)
		{
			ch1[i] = temp[i] ;
		}
		for(int k=size1 ; k<size1+size2 ; k++)
		{
			ch1[k] = s.next().charAt(0) ;
		}
		for(int m = 0 ; m<size1 + size2 ; m++)
		{
			System.out.print(ch1[m]);
		}
		

	}

}
