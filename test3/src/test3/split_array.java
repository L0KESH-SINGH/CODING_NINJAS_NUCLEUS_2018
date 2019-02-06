package test3;

public class split_array {
	
	static void printSubArray(int arr[], int start, int end)
    {
        System.out.print("[ ");
        for (int i = start; i <= end; i++)
            System.out.print(arr[i] +" ");
        System.out.print("] ");
    }
	
	public static boolean splitArray(int arr[])
	{
		int n = arr.length ;
		int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
  
        // sum stores sum till previous index of the array
        int sum_so_far = 0;
  
        for (int i = 0; i < n; i++)
        {
            // If on removing arr[i], we get equals left
            // and right half
            if (2 * sum_so_far + arr[i] == sum)
            {
                System.out.print("The array can be divided into "
                    +"two subarrays with equal sum\nThe"
                    +" two subarrays are - ");
                printSubArray(arr, 0, i - 1);
                printSubArray(arr, i + 1, n - 1);
  
                return true;
            }
            // add current element to sum_so_far
            sum_so_far += arr[i];
        }
  
        // The array cannot be divided
        System.out.println("The array cannot be divided into two "
                +"subarrays with equal sum");
                 
        return false;
	}

	public static void main(String[] args) {
		
		int array[] = {6,2,3,2,1} ;
		System.out.println(splitArray(array));
		
	}

}
