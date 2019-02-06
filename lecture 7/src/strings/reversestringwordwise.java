package strings;
import javax.print.DocFlavor.STRING;

public class reversestringwordwise {
	
	public static String reverseWordWise(String input)
	{
        String str = "";
        int temp = input.length() ;
        for( int i=input.length()-1 ; i>=0 ; i-- )
        {
        	if(input.charAt(i)==' ' || i == 0)
        	{
        		if(i==0)
        		{
        			str = str + input.substring(i , temp) + ' ' ;
            		temp = i ;
        		}
        		else
        		{
        		str = str + input.substring(i + 1, temp) + ' ' ;
        		temp = i ;
        		}
        	}
        }
        return str ;
	}

	public static void main(String[] args) 
	{
		
		String stro = "my name is lokesh" ;
		String loki = reverseWordWise(stro);
		System.out.println(loki);

	}

}
