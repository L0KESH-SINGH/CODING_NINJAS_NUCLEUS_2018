package oops1;

public class dynamicarray 
{
	
	private int data[] ;
	private int indexno ;
	
	public dynamicarray() 
	{
		data = new int[5] ;
	}
	
	public int size ()
	{
		return indexno ;
	}
	
	public static dynamicarray substract(dynamicarray d1 , dynamicarray d2)
	{
        int size ;
		
		if(d1.data.length>d2.data.length)
		{
			size = d1.data.length ;
		}
		else
			size = d2.data.length ;
        dynamicarray d = new dynamicarray() ;
		
		for(int i=0 ; i<size ; i++)
		{
			d.data[i] = d1.data[i] - d2.data[i] ;
		}
		return d ;
	}
	
	public static dynamicarray adds(dynamicarray d1 , dynamicarray d2)
	{
		int size ;
		
		if(d1.data.length>d2.data.length)
		{
			size = d1.data.length ;
		}
		else
			size = d2.data.length ;
		
		dynamicarray d = new dynamicarray() ;
		
		for(int i=0 ; i<size ; i++)
		{
			d.data[i] = d1.data[i] + d2.data[i] ;
		}
		return d ;
	}
	
	public void add (int element)
	{
		if(indexno >= data.length)
		{
			restructure();
		}
		data[indexno] = element ;
		indexno ++ ;
	}
	
	private void restructure ()
	{
		int temp[] = data ;
		data = new int[temp.length*2];
		for(int i = 0 ; i<temp.length ; i++)
		{
			data[i] = temp[i] ;
		}
	}
	
	public void set(int index , int element)
	{
		if(index>=data.length)
		{
			restructure();
		}
//		if(index == indexno)
//		{
//			add(element) ;
//		}
//		else
		//{
			data[index] = element ;
		//}
	}
	
	public int get(int index)
	{
		//if(index < indexno && index >=0) {
		return data[index] ; //;}
//		else
//		{
//			return -1 ;
//		}
	}
	
	public boolean isempty()
	{
		if(size()==0)
		{
			return true ;
		}
		else
			return false ;
	}
	
	public int removelast()
	{
		int temp = data[indexno-1];
		data[indexno-1] = 0 ;
		indexno-- ;
		return temp ;
	}

}
