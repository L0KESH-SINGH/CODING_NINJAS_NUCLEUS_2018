package LinkedList;

public class reverseLLbetter extends LinkedListbasic{
	
	public static doublenode reverseLLbetterway(Node<Integer> head)
	{
		if(head.next==null)
		{
			doublenode ans = new doublenode(head , head) ;
			return ans ;
		}
		doublenode smallans = reverseLLbetterway(head.next) ;
		
		smallans.tail.next = head ;
		head.next = null ;
		
		doublenode ans = new doublenode(smallans.head, head) ;
		
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		doublenode ans = reverseLLbetterway(head) ;
		printLinkedlist(ans.head);

	}

}
