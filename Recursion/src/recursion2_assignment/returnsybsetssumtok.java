package recursion2_assignment;

public class returnsybsetssumtok {
	
	public static int[][] subsetsSumK(int input[], int k)
	{
		int [][] arr = array(input , 0) ;
		int index[] = new int[arr.length] ;
		int count =0 ;
		for(int i=0 ; i< arr.length ; i++)
		{
			int sum = 0 ;
			for(int j=0 ; j<arr[i].length ; j++)
			{
				sum = sum + arr[i][j] ;
			}
			if(sum==k)
			{
				index[count] = i ;
				count++ ;
			}
		}
		int array2[][] = new int[count][] ;
		for(int i=0 ; i<array2.length ; i++)
		{
			array2[i] = new int[arr[index[i]].length] ;
			for(int j=0 ; j<array2[i].length; j++)
			{
				array2[i][j] = arr[index[i]][j] ;
			}
		}
		return array2 ;
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

	public static void main(String[] args) {
		
		int input[] = {15,20,12} ;
		int array[][] = subsetsSumK(input, 35) ;
		for(int i=0 ; i<array.length ; i++)
		{
			for(int j=0 ; j<array[i].length ; j++)
			{
				System.out.print(array[i][j]+" ");
			}
		}
		
	}

}
