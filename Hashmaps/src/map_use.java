import java.util.HashMap;
import java.util.Set;

public class map_use {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>() ;
		
		//input 
		map.put("abc", 1) ;
		map.put("def" , 2);
		map.put("xyz", 10);
		map.put("pqr" , 20);
		
		// check presence
		if(map.containsKey("abc"))
		{
			System.out.println("has abc as key");
		}
		if(map.containsValue(2))
		{
			System.out.println("has 2 as value");
		}
		
		//get value 
		int x = map.get("abc") ;  // return null in case of no such key found
		System.out.println(x);
		
		//delete or remove 
		int b = map.remove("def") ;
		System.out.println(b);
		
		//size
		System.out.println(map.size());  //keys in map
		
		//iterate over all keys in maps
		Set<String> keys = map.keySet() ;
		for(String str : keys)
		{
			System.out.println(str);
		}
		
	}

}
