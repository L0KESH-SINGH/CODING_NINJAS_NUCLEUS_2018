package complexity;
import java.util.* ;

public class prntarrayinter2 {
	
public static	int binarySearch(int arr[], int l, int r, int x) 
    {
	    Arrays.sort(arr);
        if (r >= l) 
        {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can only 
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }

	public static void intersection(int[] arr1, int[] arr2 , int m , int n)
	{
		 if (m > n) 
	        {
	            int tempp[] = arr1;
	            arr1 = arr2;
	            arr2 = tempp;
	 
	            int temp = m;
	            m = n;
	            n = temp;
	        }
	 
	        // Now arr1[] is smaller
	        // Sort smaller array arr1[0..m-1]
	        Arrays.sort(arr1);
	 
	        // Search every element of bigger array in smaller array
	        // and print the element if found
	        for (int i = 0; i < n; i++) 
	        {
	            if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1) 
	                {
	            	System.out.println(arr2[i]);
	                arr1[i] = Integer.MIN_VALUE ;
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
		int m = array1.length ;
		int n= array2.length ;
		intersection(array1, array2 , m , n);

	}

}
