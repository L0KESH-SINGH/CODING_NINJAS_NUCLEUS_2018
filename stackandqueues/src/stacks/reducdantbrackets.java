package stacks;

import java.util.Stack;

public class reducdantbrackets {
//	
//	public static boolean checkBalanced(String s) { //throws StackEmptyException {
//		
//	       Stack<Character> s1 = new Stack<>();
//	        for(int i=0 ; i<s.length() ; i++)
//	        {
//	            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//	                Character p = s.charAt(i);
//	                s1.push(p);
//	            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
//	                Character h = helper(s.charAt(i));
//	                Character l = s1.pop() ;
//	                if ( s.charAt(i) == h ) {
//	                    return true;
//	                }
//	            }
//	        }
////	        if(s1.isEmpty())
////	        {
////	            return true;
////	        }
////	        else
////	            return false;
//	        return false ;
//
//		}
//	  
//	 		
//	  
//	  	public static Character helper(Character ch)
//	    {
//	        if(ch==')')
//	        {
//	            return '(';
//	        }
//	        else if(ch=='}')
//	        {
//	            return '{';
//	        }
//	        else 
//	        {
//	            return '[';
//	        }
//	    }

public static boolean braces(String str) {
    Stack<Character> stack = new Stack<Character>(); 
    int index = 0; 
    while(index < str.length()){ 
        char c = str.charAt(index); 
        if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/'){ 
            stack.push(c); 
        } 
        else if(c == ')'){ 
            if(stack.peek() == '('){ 
                return true; 
            } else{ 
                while(!stack.isEmpty() && stack.peek() != '('){ 
                    stack.pop(); 
                } 
                stack.pop(); 
            } 
        } 
        index++; 
    } 
    return false; 
}

static int[] calculateSpan(int price[], int n, int S[])
{
    // Span value of first day is always 1
    S[0] = 1;
     
    // Calculate span value of remaining days by linearly checking
    // previous days
    for (int i = 1; i < n; i++)
    {
        S[i] = 1; // Initialize span value
         
        // Traverse left while the next element on left is smaller
        // than price[i]
        for (int j = i-1; (j>=0)&&(price[i]>=price[j]); j--)
            S[i]++;
    }
    return S ;
}
	  		
	  	public static void main(String[] args) {
			String s = "((a+b))" ;
			//System.out.println(braces(s));
			 int price[] = {60,70,80,100,90,75,80,120};
		        int n = price.length;
		        int S[]= new int[n];
		       int[] p = calculateSpan(price, n, S) ;
		       for(int i=0 ; i<p.length ; i++)
		       {
		    	   System.out.println(p[i]);
		       }
		}
	}