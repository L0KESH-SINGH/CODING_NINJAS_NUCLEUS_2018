package test2;

public class rajattest2 {
	
	public static int subsetsaveragegretequaltok(int input[] , int k)
	{
		int [][] subsets = array(input, 0) ;
		int max_sum = Integer.MIN_VALUE ;
		int temp = 0 ;
		for(int i=1 ; i<subsets.length ; i++)
		{
			int curr_sum = 0 ;
			int j ;
			for( j=0 ; j<subsets[i].length ; j++)
			{
				curr_sum += subsets[i][j];
			}
			if(curr_sum/j>=k && curr_sum>max_sum)
			{
				max_sum = curr_sum ;
				temp = i ;
			}
		}
		return subsets[temp].length ;
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
			
		int array[] = {1,2,3,4,5} ;
		System.out.println(subsetsaveragegretequaltok(array, 2));
		
	}

}
