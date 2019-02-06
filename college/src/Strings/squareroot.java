package Strings;

public class squareroot {
	
	public static float squareroot( float n )
	{
		float x = n ;
		float y = 1 ;
		while(y<x)
		{
			x = (x+y)/2 ;
			y = n/x ;
		}
		return x ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(squareroot(29));
	}

}
