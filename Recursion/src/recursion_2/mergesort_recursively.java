package recursion_2;

public class mergesort_recursively {
	
public static void main(String[] args) {
		
		int[] array = {1,2,2,3,4,3,2,5,6,7,0,9} ;
		int starti = 0 ;
		int endi = array.length -1 ;
		mergeSort(array, starti, endi);
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.println(array[i]);
		}

	}
	
	public static void mergeSort(int[] input , int starti ,int endi)
	{
		if(starti>=endi)
		{
			return ;
		}
		int mid = (starti+endi)/2 ;
		mergeSort(input, starti, mid);
		mergeSort(input, mid+1, endi);
		merge(input, starti, endi);
	}
	
	public static void merge(int arr[], int l, int r)
	    {
		 int m = (l+r)/2 ;
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        /* Create temp arrays */
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	 
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = arr[m + 1+ j];
	 
	 
	        /* Merge the temp arrays */
	 
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	 
	        // Initial index of merged subarry array
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	
//	public static void merge(int input[] , int starti , int endi)
//	{
//		int mid = (starti + endi) /2 ;
//		int input1[] = new int[mid+1] ;
//		int input2[] = new int[endi-mid] ;
//		for(int i=0 ; i<=mid ;i++)
//		{
//			input1[i] = input[i] ;
//		}
//		int l= 0;
//		for(int k=mid+1 ; k<=endi ; k++)
//		{
//			input2[l]=input[k] ;
//			l++ ;
//		}
//		int size1 = input1.length ;
//		int size2 = input2.length ;
//		int size = size1 + size2 ;
//		int array[] = new int[size ];
//		int j = 0 ;
//		int i = 0 ;
//		for(int x=0 ; x < size ; x++)
//		{
//			if((i != size1 ) && (j != size2  ))
//			{
//			if((input1[i]<=input2[j])) 
//			{
//				array[x] = input1[i] ;
//				i++ ;
//			}
//			else 
//			{
//				array[x] = input2[j] ;
//				j++ ;
//			}
//			}
//			else
//			{
//				if(i != size1 )
//				   {
//					array[x] = input1[i] ;
//					i++;
//				   }
//				else if( j != size2 )
//				{
//					array[x] = input2[j];
//					j++;
//				}
//				else
//				{
//					break ;
//				}
//			}
//		}
//		for(int m=0 ; m<size ; m++)
//		{
//			input[m] = array[m] ;
//		}
//		
//	}
	
//	public static int[] mergearrays(int input1[] , int input2[])
//	{
//		
//		int size1 = input1.length ;
//		int size2 = input2.length ;
//		int size = size1 + size2 ;
//		int array[] = new int[size ];
//		int j = 0 ;
//		int i = 0 ;
//		for(int x=0 ; x < size ; x++)
//		{
//			if((i != size1 ) && (j != size2  ))
//			{
//			if((input1[i]<=input2[j])) 
//			{
//				array[x] = input1[i] ;
//				i++ ;
//			}
//			else 
//			{
//				array[x] = input2[j] ;
//				j++ ;
//			}
//			}
//			else
//			{
//				if(i != size1 )
//				   {
//					array[x] = input1[i] ;
//					i++;
//				   }
//				else if( j != size2 )
//				{
//					array[x] = input2[j];
//					j++;
//				}
//				else
//				{
//					break ;
//				}
//			}
//		}
//		return array ;
//	}

	

}
