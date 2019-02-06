package complexity;

import java.util.Scanner;

public class printarrayintersection extends mergesorting{
	
	public static void intersection(int[] a, int[] b )
	{
		int size1 = a.length ;
		int size2 = b.length ;
		mergeSort(a, 0, size1-1);
		mergeSort(b, 0, size2-1);
		int i = 0, j = 0;
	     
	    while (i < size1 && j < size2) 
	    {
	                 
	        if (a[i] > b[j]) 
	        {
	            j++;
	        } 
	                 
	        else
	        if (b[j] > a[i]) 
	        {
	            i++;
	        } 
	        else
	        {
	            // when both are equal
	            System.out.println(a[i]);
	            i++;
	            j++;
	        }
	    }
	}
	
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

	public static void main(String[] args) {
		

		int array1[] = arrinput() ;
		int array2[] = arrinput() ;
		intersection(array1, array2);

	}

}
