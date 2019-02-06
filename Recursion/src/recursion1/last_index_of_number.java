package recursion1;

public class last_index_of_number {
	
	 public static void printsubsets(int[] input , int size , int[] outputsofar , int element)
	    {
	        if (size == input.length)
	        {
	            int sum = 0;
	            int count = 1 ;
	            for (int i = 0; i < outputsofar.length; i++)
	            {
	                sum += outputsofar[i];
	                count ++ ;
	            }
	            if ((sum/count) >= element)
	            {
	                System.out.println(count);
	            }
	            return;
	        }
	        printsubsets(input, size + 1, outputsofar , element);
	        int[] temp = outputsofar ;
	        outputsofar = new int[temp.length+1] ;
	        int j=0;
	        for(int k= 0 ; k<temp.length ; k++)
	        {
	            outputsofar[j] = temp[k] ;
	            j++ ;
	        }
	        outputsofar[j] = input[size] ;
	        printsubsets(input, size + 1, outputsofar , element);  
	    }

	public static void main(String[] args) {
		
		int[] outputsofar = new int[0] ;
		int input[] = {1,2,3,4,5} ;
		printsubsets(input , 0 , outputsofar , 2) ;
		
	}

}
