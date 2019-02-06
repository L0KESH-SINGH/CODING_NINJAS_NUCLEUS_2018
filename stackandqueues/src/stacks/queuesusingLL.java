package stacks;

public class queuesusingLL <T> {
	
	private Node<T> head ;
	private Node<T> temp ;
	private int size = 0 ;
	
	int size()
	{
		return size ;
	}
	
	boolean isEmpty()
	{
		return (size()==0) ;
	}
	
	T front() throws QueueEmptyException
	{
		if(size()==0)
		{
			QueueEmptyException e = new QueueEmptyException() ;
			throw e ;
		}
		return head.data ;
	}
	
	void enqueue(T data)
	{
		Node<T> newnode = new Node<T>(data) ;
		if(head ==null)
		{
			head = newnode ;
			temp = head ;
		}
		temp.next = newnode ;
		temp = newnode ;
		size++ ;
	}
	
	T dequeue() throws QueueEmptyException
	{
		if(size==0)
		{
			QueueEmptyException e = new QueueEmptyException();
			throw e ;
		}
		T temp = head.data ;
		head = head.next ;
		size-- ;
		return temp ;
	}
	
//	 public static void reverseQueue(queuesusingLL q) throws QueueEmptyException
//	 {
//	    	if(q.size == 0 )
//	    	{
//	    		return ;
//	    	}
//	    	int x = q.dequeue() ;
//	    	reverseQueue(q);
//	    	q.enqueue(x);
//	  	}

	public static void main(String[] args) throws QueueEmptyException{
		
		queuesusingLL<Integer> s = new queuesusingLL<>();
		for(int i=1 ; i<6 ; i++)
		{
			s.enqueue(i);
			//System.out.println(s.front());
		}
		//System.out.println(s.isEmpty());
		//reverseQueue(s);
		for(int j=1 ; j<6 ; j++)
		{
			System.out.println(s.dequeue());
		}
		//System.out.println(s.front());

	}

}
