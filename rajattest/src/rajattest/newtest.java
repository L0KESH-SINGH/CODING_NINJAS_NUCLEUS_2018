package rajattest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class newtest {
	
static void minRange(int arr[],  
            int n, int k) 
{ 
int l = 0, r = n; 

for (int i = 0; i < n; i++) 
{ 

Set<Integer> s = new HashSet<Integer>(); 
int j; 
for (j = i; j < n; j++)  
{ 
   s.add(arr[j]); 
   if (s.size() == k)  
   { 
       if ((j - i) < (r - l)) 
       { 
           r = j; 
           l = i; 
       } 
       break; 
   } 
} 

if (j == n) 
   break; 
} 

System.out.println(r-l+1); 
} 

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,5,6} ;
		
		minRange(arr, 6, 5);
		
//		int count = 0 ;
//		int help = 0 ;
//		int k=6;
//		HashMap<Integer, Integer> map = new HashMap<>() ;
//		
//		int i=0 ;
//		
//		for( ; i<arr.length ; i++)
//		{
//			if(!map.containsKey(arr[i]))
//			{
//				map.put(arr[i], i) ;
//				count++ ;
//				if(help<=count)
//				{
//					//help++ ;
//				}
//			}
//			else
//			{
//				map.remove(arr[i]) ;
//				count = 1 ;
//			}
//			if(count==k)
//			{
//				break ;
//			}
//		}
//		
//		System.out.println(Math.max(count, help));

	}

}
