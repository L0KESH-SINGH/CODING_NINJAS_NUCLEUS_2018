import java.util.HashMap;
import java.util.Set;

public class max_occuring_number {
	
	public static int maxFrequencyNumber(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<>() ; // map< key , no of occurence>
		int size = arr.length ;
		
		int max = arr[0] ;
		
		for(int i=0 ; i<size ; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int x = map.get(arr[i]);
				x++ ;
				map.put(arr[i], x) ;
				if(x>map.get(max))
				{
					max = arr[i] ;
				}
			}
			else
			{
				map.put(arr[i], 1) ;
			}
		}
		return max ;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
