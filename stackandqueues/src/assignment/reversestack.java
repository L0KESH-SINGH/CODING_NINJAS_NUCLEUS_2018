package assignment;
import java.util.* ;

public class reversestack {
	
	public static void reverseStack(Stack<Integer> s1 , Stack<Integer> s2 )
	{
		if(s1.size()==0)
		{
			return ;
		}
		Integer x = s1.pop() ;
		reverseStack(s1 , s2 ); 
		s2.push(x) ;
		
//		if(s2.size() == a)
//		{
//			while(s2.size()!=0)
//			{
//				s1.push(s2.pop()) ;
//			}
		//}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>() ;
		Stack<Integer> s2 = new Stack<>() ;
		for(int i=1 ; i<6 ; i++)
		{
			s.push(i) ;
		}
		int x = s.size() ;
		reverseStack(s , s2);
		for(int j=1 ; j<6 ; j++)
		{
			System.out.println(s.pop());
		}

	}

}
