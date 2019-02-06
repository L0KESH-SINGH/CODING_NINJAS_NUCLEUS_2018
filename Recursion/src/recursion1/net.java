package recursion1;
import java.util.*;

public class net {
	
	
	public static ArrayList<Integer> findx(int[] arr,int x,int index , ArrayList<Integer> list)
	{
		if(index>=arr.length)
		{
			list=new ArrayList<>();
			return list;
		}
		if(arr[index]==x)
		{
			
			list.add(index);
		}
		
		findx(arr, x, index+1, list);
		return list;
	}
	public static void main(String[] args) {
		int array[] = { 0 ,2, 2, 4, 5 ,2 } ;
		int x = 2 ;
		
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Integer> ans=findx(array, x, 0, b);
		//System.out.println(ans.toArray());
//		Integer[] a=new Integer[ans.size()];
//		a=ans.toArray(a);
		int[] a=new int[ans.size()];
		for(int i=0;i<a.length;i++)
        {
          a[i]=ans.get(i).intValue();
        }
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
	}

	

	}


