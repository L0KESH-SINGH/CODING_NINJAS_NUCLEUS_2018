package LinkedList;

public class Node <T>
{
	
	T data ;
	Node next ;
	
	Node(T data)
	{
		this.data = data ;
		next = null ;
	}
	
	public T getData() {
		return data;
	}

}
