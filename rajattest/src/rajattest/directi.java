package rajattest;
import java.util.*;

public class directi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s=new Scanner(System.in);
		
		ArrayList<String> book=new ArrayList<>();
		
		book.add(s.nextLine());
		while(!book.contains("END"))
		{
			book.add(s.nextLine());
		}
		String a=s.nextLine();
		String b="";
		
//		for(int i=0;i<book.size();i++)
//		{
//			System.out.println(book.get(i));
//		}
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				b=a.substring(i+1);
				a=a.substring(0, i);
			}
		}
//		System.out.println(a);
//		System.out.println(b);
		
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<a.length();i++)
		{
			if(map.containsKey(a.charAt(i)))
			{
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else
			{
			map.put(a.charAt(i), 1);
			}
		}
		int count=0;
		for(int i=0;i<b.length();i++)
		{
			if(map.containsKey(b.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(b.length()-count);
			
		
		
		

	}

}
