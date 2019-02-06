package oops1;

public class complexnumber 
{
	
	private int real ;
	private int imaginary ;
	
	public complexnumber(int r , int i)
	{
		real = r ;
		imaginary = i ;
	}
	
	public int getreal()
	{
		return real ;
	}
	
	public int getimaginary()
	{
		return imaginary ;
	}
	
	public void setreal(int r)
	{
		real = r ;
	}
	
	public void setimaginary(int i)
	{
		imaginary = i ;
	}
	
	public void print()
	{
		System.out.println(real+" + i"+imaginary);
	}
	
	public void plus(complexnumber c2)
	{
		this.real = this.real + c2.real ;
		this.imaginary = this.imaginary + c2.imaginary ;
	}
	
	public void multiply(complexnumber c2)
	{
		int temp = this.real * c2.real - this.imaginary * c2.imaginary ;
		this.imaginary = this.imaginary * c2.real + this.real * c2.imaginary ;
		this.real = temp ;
	}
	
//	public static complexnumber add1(complexnumber c1 , complexnumber c2)
//	{
//		int newreal = c1.real + c2.real ;
//		int newimg = c1.imaginary + c2.imaginary ;
//		complexnumber c3 = new complexnumber(newreal, newimg) ;
//		return c3 ;
//	}
//	
//	public void conjugate()
//	{
//		
//	}
	
}

