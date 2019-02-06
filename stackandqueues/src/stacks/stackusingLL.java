package stacks;

class stackusingLL <T> 
{
	
	private Node<T> top;
	public stackusingLL() {
		top=new Node<T>(null);
		
	}
	
	public int size()
	{
		Node<T> temp=top;
		int count=0;
		while(temp.next!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void push(T data)
	{
		Node<T> node = new Node<T>(data) ;
		if(top==null)
		{
			top = node ;
		}
		else
		{
			node.next = top ;
			top = node ;
		}
	}
	
	public boolean isEmpty()
	{
		return (size()==0) ;
	}
	
	public T top() throws stackemptyexception
	{
		if(top == null)
		{
			stackemptyexception e = new stackemptyexception() ;
			throw e ;
		}
		return top.data;
	}
	public T pop() throws stackemptyexception
	{
		if(top == null)
		{
			stackemptyexception e = new stackemptyexception() ;
			throw e ;
		}
		Node<T> temp=top;
		top=top.next;
		return temp.data;	
	}
	
	public static void main(String[] args) throws stackemptyexception {
		
		stackusingLL s1 = new stackusingLL() ;
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		
	}

}
