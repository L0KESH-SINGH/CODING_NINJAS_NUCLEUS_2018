package recursion1;

public class sumofarrayelements {
	
	public static int sumofarrayelement(int input[])
	{
		if(input.length == 1)
		{
			return input[0] ;
		}
		int small_input[] = new int[input.length -1];
		for(int i=1 ; i< input.length ; i++)
		{
			small_input[i-1] = input[i] ;
		}
		return sumofarrayelement(small_input) + input[0] ;
		
	}

	public static void main(String[] args) {
		
		int array[] = { 2 ,3 ,4 ,5 ,6} ;
		System.out.println(sumofarrayelement(array));

	}

}
