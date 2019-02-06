package recursion2_assignment;

public class subset_of_array {
	
	public static int[][] ansalter(int input[][])
	{
		int secans[][] = new int [input.length-1][] ;
		for(int i=0 ; i< secans.length ; i++)
		{
			secans[i] = new int[input[i+1].length-1] ;
			for(int j=0 ; j< input[i+1].length-1 ; j++)
			{
				secans[i][j] = input[i+1][j] ;
			}
		}
		return secans ;
	}
	
	public static int[][] array(int[] a , int index) 
	{
        if(index==a.length)
        {
        	int [][] ans  = new int[1][0] ;
            return ans ;
        }
        
        int[][] recans = array(a,index+1);
        int[][] myans = new int[2 * recans.length][];
        int i;
        for( i=0 ; i<recans.length ; i++ )
        {
        	myans[i] = new int[recans[i].length];
            for ( int j = 0; j < recans[i].length ; j++ ) 
            {
            	if(recans[i][j]!=0)
                {myans[i][j] = recans[i][j];}
            }
        }
        
        int element = a[index];
        int n = 0 ; 
        for(int k=i;k<myans.length;k++)
        {
        	myans[k] = new int[recans[n].length+1];
        	n++ ;
        	for(int j= 0 ; j< myans[k].length ; j++)
            {myans[k][j] = element;}
        }
        int o = i ;
        for (int c = 0; c < recans.length; c++) 
        {
            for ( int j = 0; j < recans[c].length ; j++ ) 
            {
                myans[o][j+1] = recans[c][j];
            }
            o++ ;
        }
        return myans;   
    }


	public static void main(String[] args) 
	{
		int input[] = { 15 , 20 } ;
		int array2[][] = array(input, 0) ;
		//int array2[][] = ansalter(array4) ;
		for(int i=0 ; i< array2.length ; i++)
		{
			for(int j=0 ; j<array2[i].length ; j++)
			{
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
