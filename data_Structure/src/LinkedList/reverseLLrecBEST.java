package LinkedList;

public class reverseLLrecBEST extends LinkedListbasic{
	
	public static Node<Integer> reversebest(Node<Integer>head)
	{
		if(head.next==null)
		{
			return head ;
		}
		Node<Integer> tail = head.next ;
		Node<Integer> smallans = reversebest(head.next) ;
		tail.next = head ;
		head.next = null ;
		
		return smallans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = reversebest(head) ;
		printLinkedlist(head); 

	}

}
