package LinkedList;

public class Kreverse extends reverse_LL_iterative{
	
	public static Node<Integer> kReverse(Node<Integer>head2 , int k)
	{
		if(head2.next==null)
		{
			return head2 ;
		}
		Node<Integer>h1 = head2 ;
		Node<Integer>t1 = head2 ;
		int count =1 ;
		while(t1!=null)
		{
			if(count>=k)
			{
				break ;
			}
			count++ ;
			t1 = t1.next ;
		}
		Node<Integer>h2 = t1.next ;
		t1.next = null ;
		h1 = revreseiterative(h1) ;
		t1.next = kReverse(h2, k) ;
		return h1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = kReverse(head, 3) ;
		printLinkedlist(head);

	}

}
