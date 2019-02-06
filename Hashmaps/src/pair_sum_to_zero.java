import java.util.HashMap;

public class pair_sum_to_zero {
	
public static void PairSum(int[] arr, int size) {
	
	HashMap<Integer, Integer> map = new HashMap<>() ; // map< key , no of occurence>
	
	for(int i=0 ; i<size ; i++)
	{
		if(map.containsKey(arr[i]))
		{
			int x = map.get(arr[i]);
			x++ ;
			map.put(arr[i], x) ;
		}
		else
		{
			map.put(arr[i], 1) ;
		}
	}
	
	int temp = 0 ;
	for(int j=0 ; j<size ; j++)
	{
		int p = map.get(arr[j]) ;
		if(map.containsKey(-arr[j]) &&  map.get(arr[j])!=0)
		{
			int q = map.get(-arr[j]) ;
			int m = p+q ;
			int a = arr[j];
			int b = -a ;
			for(int n =0 ; n<n ; n++)
			{
				System.out.print(Math.min(a, b)+" ");
				System.out.println(Math.max(a, b));
			}
			map.put(arr[j], 0) ;
			map.put(-arr[j], 0) ;
		}
	}

	}

	public static void main(String[] args) {
		
		System.out.printf("lok");
		
	}
	
}
