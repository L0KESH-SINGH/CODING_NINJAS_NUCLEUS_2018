package oops1;

public class fractionuse {

	public static void main(String[] args) 
	{
		
		fraction f1 = new fraction(4 , 8) ; 
		f1.print();
		fraction f2 = new fraction(4, 5) ;
		f2.print();
		
		f1.multiply(f2);
		f1.print();
		
		f1.add(f2);
		f1.print();
		
		fraction f3 = fraction.add(f1, f2);
		f3.print();
		
		f1.setdenominator(4);
		f1.setnumerator(5);
		f2.setdenominator(5);
		f2.setnumerator(7);
		
		f1.multiply(f2);
		f1.print();
		
	}

}
