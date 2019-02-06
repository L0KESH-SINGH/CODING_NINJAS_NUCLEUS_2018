package oops1;

public class Polynomialuse {

	public static void main(String[] args) {
		
		Polynomial p1 = new Polynomial() ;
		p1.setcoefficient(0, 3);
		p1.setcoefficient(1, 4);
		p1.setcoefficient(2, 1);
		p1.print();
		
		System.out.println();
		
		Polynomial p2 = new Polynomial() ;
		p2.setcoefficient(0, 2);
		p2.setcoefficient(1, 3);
		p2.setcoefficient(5, 1);
		p2.print();
		
		System.out.println();
		
		//Polynomial p3 = Polynomial.add(p1, p2) ;
		
		//p3.print();
		
		System.out.println();
		
		//Polynomial p4 = Polynomial.substract(p2, p1);
		
		//p4.print();
		
		int deg[] = { 0 , 2 ,3 ,5 ,6 } ;
		int coeff[] = { 3 , 5 ,7 ,9 ,1 } ;
		Polynomial2 p = new Polynomial2() ;
		p.setcoefficient(deg, coeff);
		p.print();
		
	}

}
