package LinkedList;

public class kreverse2 extends reverse_LL_iterative{
	
	public static Node<Integer> kReverse(Node<Integer>head , int k)
	{
		 Node current = head;
	       Node next = null;
	       Node prev = null;
	        
	       int count = 0;
	 
	       /* Reverse first k nodes of linked list */
	       while (count < k && current != null) 
	       {
	           next = current.next;
	           current.next = prev;
	           prev = current;
	           current = next;
	           count++;
	       }
	 
	       /* next is now a pointer to (k+1)th node 
	          Recursively call for the list starting from current.
	          And make rest of the list as next of first node */
	       if (next != null) 
	          head.next = kReverse(next, k) ;
	 
	       // prev is now head of input list
	       return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = kReverse(head,3) ;
		printLinkedlist(head);

	}

}
