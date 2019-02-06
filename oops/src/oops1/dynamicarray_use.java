package oops1;

public class dynamicarray_use {

	public static void main(String[] args) {
		
		dynamicarray d = new dynamicarray() ;
		
		for(int i=0 ; i<100 ; i++)
		{
			d.add(i+10);
		}
		
		System.out.println(d.size());
		
		System.out.println(d.get(4));
		d.set(4, 25);
		System.out.println(d.get(4));
		
		while(!d.isempty())
		{
			System.out.println("at size = "+ d.size());
			System.out.println(d.removelast());
		}

	}

}
