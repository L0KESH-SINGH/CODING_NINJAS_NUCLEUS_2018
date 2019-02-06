package oops1;

public abstract class human_being {
	
	public String name ;
	public String country ;
	
	public abstract void name(String input) ;
	public abstract void country(String country) ;
	
	
	
	public final void print()
	{
		System.out.println("name = "+ name);
		System.out.println("country = "+country);
	}

}
