package recursion1;
import java.util.*;

public class rajatprac {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String sb = "" ;
		String str="aaabbc";
		System.out.println(removedupli(str, sb));
		
	}
	
	public static String removedupli(String str,String sb) {
		
		if(str.length()==1)
		{	
			return sb + str;
		}
		sb = sb + removedupli(str.substring(1), sb);
		
		if(str.charAt(0)==sb.charAt(0))
		{
			
			
			
		}
		else {
		    
			String temp = str.charAt(0) + sb ;
			sb = temp ;
			
		}
		
		return sb;
		
	}

}
