package oops1;

public class fraction 
{
	
	private int numerator ;
	private int denominator ;
	
	public fraction (int numerator , int denominator)
	{
		this.numerator = numerator ;
		this.denominator = denominator ;
		if(this.denominator==0)
		{
			return ;
		}
		simplify() ;
	}
	
	public void simplify()
	{
		int gcd = 1 ;
		int smaller ; 
		if(numerator>denominator)
		{
			smaller = denominator ;
		}
		else
		{
			smaller = numerator ;
		}
		for(int i=2 ; i<= smaller ; i++)
		{
			if(numerator%i==0 && denominator%i==0)
			{
				gcd = i ;
			}
		}
		numerator = numerator / gcd ;
		denominator = denominator / gcd ;
	}
	
	public int getdenominator()
	{
		return denominator ;
	}
	
	public int getnumerator()
	{
		return numerator ;
	}
	
	public void setnumerator(int numerator)
	{
		this.numerator = numerator ;
	}
	
	public void setdenominator ( int denominator)
	{
		this.denominator = denominator ;
	}
	
	public void print ()
	{
		if(denominator==1)
		{
			System.out.println(numerator);
		}
		else
		{
			System.out.println(numerator + "/" + denominator);
		}
	}
	
	public static fraction add( fraction f1 , fraction f2)
	{
		int newnum = f1.numerator*f2.denominator + f1.denominator*f2.numerator ;
		int newden = f1.denominator* f2.denominator ;
		fraction f3 = new fraction(newnum , newden) ;
		return f3 ;
	}
	
	public void add(fraction f2)
	{
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator ;
		this.denominator = this.denominator*f2.denominator ;
		simplify() ;
	}
	
	public void multiply(fraction f2)
	{
		this.numerator = this.numerator *  f2.numerator ;
		this.denominator = this.denominator * f2.denominator ;
		simplify() ;
	}

}
