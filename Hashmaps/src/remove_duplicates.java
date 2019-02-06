import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class remove_duplicates {
	
	public static ArrayList<Integer> remdupli(ArrayList<Integer> arr)
	{
		ArrayList<Integer> ans = new ArrayList<>() ;
		HashMap<Integer, Boolean> map = new HashMap<>() ;
		int size = arr.size() ;
		for(int i=0 ; i<size ; i++)
		{
			if(!(map.containsKey(arr.get(i))))
			{
				map.put(arr.get(i), true) ;
				ans.add(arr.get(i)) ;
			}
		}
		return ans ;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,5,3,2,6)) ;
		ArrayList<Integer> ans = remdupli(arr) ;
		for(int i : ans)
		{
			System.out.println(i);
		}
		
	}

}
