package oops1;

//import java.util.Scanner;

public class student extends human_being implements interface22
{
	//public String name ;
	private int rollno = 24 ;
	
	public void cal()
	{
		return ;
	}
	
//	student()
//	{
//		
//	}
//	
//	student(String n)
//	{
//		name = n ;
//	}
//	
//	public void getroll(int rn)
//	{
//		if(rn<=0)
//		{
//			return ;
//		}
//		rollno = rn ;
//	}
	
	@Override
	public void name(String input) {
		
		name = input ;
	}
	
	@Override
	public void country(String country) {
		// TODO Auto-generated method stub
		this.country = country ;
		super.country = country ;
	}

	public void print2()
	{
		System.out.println(name + " " + rollno);
	}

}
