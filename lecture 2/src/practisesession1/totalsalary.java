package practisesession1;

import java.util.Scanner;

public class totalsalary {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		float basic = s.nextFloat();
		char ch = s.next().charAt(0);
		float allow;
		float hra = (20*basic)/100;
		float da = (50*basic)/100;
		//System.out.println(da);
		if(ch==65)
		{
			allow=1700;
		}
		else if(ch==66)
		{
			allow=1500;
		}
		else
		{
			allow = 1300;
		}
      
		float pf= (11*basic)/100;
		float sallary = ((basic +hra + da + allow )-pf);
		int b=(int)(Math.round(sallary));
		System.out.println(b);
		
		
		
	}

}
