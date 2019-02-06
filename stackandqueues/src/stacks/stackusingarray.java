package stacks;

public class stackusingarray {
	
	private int data[] ;
	private int top ;
	
	public stackusingarray(int capacity)
	{
		data = new int[capacity] ;
		top = -1 ;
	}
	
	public stackusingarray()
	{
		data = new int[10] ;
		top = -1 ;
	}
	
	public boolean isempty()
	{
		return (top==-1) ;
	}
	
	public int size()
	{
		return top+1 ;
	}
	
	public int top() throws stackemptyexception
	{
		if(size()==0)
		{
			stackemptyexception e = new stackemptyexception() ;
			throw e ;
		}
		else
			return data[top+1] ;
	}
	
	public void push (int elem)
	{
		if(size()==data.length)
		{
			int temp[] = data ;
			data = new int[2*temp.length] ;
			for(int i=0 ; i<temp.length ; i++)
			{
				data[i] = temp[i] ;
			}
		}
		
			top++ ;
			data[top] = elem ;
		
		//data[top+1] = elem ;
	}
	
	public int pop() throws stackemptyexception
	{
		if(size()==0)
		{
			stackemptyexception e = new stackemptyexception() ;
			throw e ;
		}
		int temp = data[top] ; 
		top-- ;
		return temp ;
	}

	
	public static void main(String[] args) {
		stackusingarray s1 = new stackusingarray(5) ;
		for(int i=0 ; i< 12 ; i++)
		{
			s1.push(i+1);
		}
		while(!(s1.isempty()))
		{
			try {
				System.out.println(s1.pop());
			} catch (stackemptyexception e) {
				// TODO Auto-generated catch block
				return ;
			}
		}
	}
}


