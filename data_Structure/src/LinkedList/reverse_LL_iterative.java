package LinkedList;

public class reverse_LL_iterative extends LinkedListbasic{
	
	public static Node<Integer> revreseiterative(Node<Integer>head)
	{
		Node<Integer>temp = null ; 
		Node<Integer>curr = head ;
		Node<Integer>prev = null ;
		while(curr!=null)
		{
			temp = curr.next ;
			curr.next = prev ;
			prev = curr ;
			curr = temp ;
		}
		return prev ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = revreseiterative(head) ;
		printLinkedlist(head);

	}

}
