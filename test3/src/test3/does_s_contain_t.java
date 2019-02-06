package test3;

public class does_s_contain_t {
	
	public static boolean checkSequence(String a, String b)
	{
		int j= 0 ;
		int[] arr = new int[b.length()] ;
		for(int i=0 ; i< a.length() && j<b.length() ; i++)
		{
			if(a.charAt(i)==b.charAt(j))
			{
				arr[j] = 1 ;
				j++ ;
			}
		}
		int sum=0 ;
		for(int k=0 ; k<arr.length ; k++)
		{
			sum += arr[k] ;
		}
		if(sum==b.length())
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(checkSequence("abchjsgsuohhdhyrikkknddg", "coding"));

	}

}
