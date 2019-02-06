package oops1;

public class Polynomial2 {
	
	int degree[] = new int[10] ;
	int max = Integer.MIN_VALUE ;
//	private int coefficient[] ;
	
	public void setcoefficient(int deg[] , int coeff[])
	{
		//int max = Integer.MIN_VALUE ;
		for(int i=0 ; i< deg.length ; i++)
		{
			if(deg[i]>max)
			{
				max = deg[i] ;
			}
		}
		if(deg.length >degree.length)
		{
			//int temp[] = degree ;
			degree = new int[deg.length] ;
		}
		int x = 0 ;
		while(x<deg.length)
		{
			degree[deg[x]] = coeff[x] ;
			x++ ;
		}
	}
	
	public void print ()
	{
		int i = 0 ;
		while(i<=max)
		{
			if(degree[i]!=0) {
			if(degree[i]<0) {
				System.out.print(degree[i]+"x^"+i+" ");}
			else
				System.out.print(degree[i]+"x^"+i+" + ");}
			i++ ;
		}
	}

}
