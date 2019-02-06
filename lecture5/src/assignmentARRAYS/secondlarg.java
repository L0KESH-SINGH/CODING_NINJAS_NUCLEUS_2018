package assignmentARRAYS;

import java.util.Scanner;

public class secondlarg {
	
	public static int[] arrinput()
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		
		for(int i= 0 ; i<size ; i ++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int secondLargestElement(int[] arr)
	{
		int i, first, second;
		int v = 0 ;
		 
	    /* There should be atleast two elements */
	    if (arr.length < 2)
	    {
	        System.out.println(" Invalid Input ");
	         v = Integer.MIN_VALUE ;
	        return v;
	    }
	    int loki = 0;
	    int f = 0 ;
	    int size = arr.length ;
	    while(loki != -1 && f < size)
		{
			if(arr[0]!=arr[f])
			{
				loki = -1 ;
				break ;
			}
			f++ ;
		}
		if(loki==0)
		{
			loki = Integer.MIN_VALUE ;
			return loki ;
		}
	 
	    first = Integer.MIN_VALUE ;
	    second = Integer.MIN_VALUE ;
	    for (i = 0; i < arr.length ; i ++)
	    {
	        /* If current element is smaller than first
	           then update both first and second */
	        if (arr[i] > first)
	        {
	            second = first;
	            first = arr[i];
	        }
	 
	        /* If arr[i] is in between first and 
	           second then update second  */
	        else if (arr[i] > second && arr[i] != first)
	            second = arr[i];
	    }
	    return second ;
	}

	public static void main(String[] args) {
		
      int array[] = arrinput();
      int x = secondLargestElement(array);
      System.out.println(x);
		

	}

}
