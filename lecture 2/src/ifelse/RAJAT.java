package ifelse;
import java.util.*;

public class RAJAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int a;
       a=s.nextInt();
       int c=1;
       for(int i=1;i<=a;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(c);
    	   }
    	   System.out.println();
       }
       s.close();
	}

}
