package recursion_2;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr= {1,2,3,4};
	ArrayList<Integer> list=new ArrayList<>();
	for(int i: arr)
	{
		list.add(i);
	}
	System.out.println(list);
	
	int[] res=new int[list.size()];
	for(int i=0;i<list.size();i++)
	{
		res[i]=(int)list.get(i);
	}
	
	for(int i:res)
	{
		System.out.println(i);
	}
	String str="lucky";
	
	
	StringBuilder sb=new StringBuilder();
	sb.append(str.substring(0,2));
	sb.append("rajat");
	sb.append(str.substring(2));
	System.out.println(sb.toString());
	
	
	String p = str.substring(0, 2) ;
	p+= "rajat" + str.substring(2) ;
	System.out.println(p);
	
	
		
		
		
		
		

	}

}
