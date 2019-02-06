package oops1;

public class Polynomial 
{
	dynamicarray coefficient = new dynamicarray() ;
	int max = Integer.MIN_VALUE ;
	
	public void setcoefficient(int deg , int coeff)
	{
		//int max = Integer.MIN_VALUE ;
		if(deg>max)
		{
			max = deg ;
		}
		coefficient.set(deg,coeff);
	}
	
	public void print()
	{
		int i = 0 ;
		while(i<=max)
		{
			if(coefficient.get(i)!=0) {
			if(coefficient.get(i+1)<0) {
				System.out.print(coefficient.get(i)+"x^"+i+" ");}
			else
				System.out.print(coefficient.get(i)+"x^"+i+" + ");}
			i++ ;
		}
	}
	
	public static Polynomial add(Polynomial p1 , Polynomial p2)
	{
		Polynomial p3 = new Polynomial() ;
		dynamicarray d = new dynamicarray() ;
		d =  dynamicarray.adds(p1.coefficient, p2.coefficient) ;
		for(int i =0 ; d.get(i)!= 0 ; i++)
		{
			p3.setcoefficient(i, d.get(i)); 
		}
		return p3 ;
	}
	
	public static Polynomial substract(Polynomial p1 , Polynomial p2)
	{
		Polynomial p3 = new Polynomial() ;
		dynamicarray d2 = new dynamicarray() ;
		d2 = dynamicarray.substract(p1.coefficient, p2.coefficient) ;
		for(int i =0 ; d2.get(i)!= 0 ; i++)
		{
			p3.setcoefficient(i, d2.get(i)); 
		}
		return p3 ;
	}

}
