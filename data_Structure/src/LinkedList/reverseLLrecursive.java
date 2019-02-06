package LinkedList;

public class reverseLLrecursive extends LinkedListbasic {
	
	public static Node<Integer> reverse_R( Node<Integer> head )
	{
		if(head.next==null || head==null)
		{
			return head ;
		}
		Node<Integer>smallans = reverse_R(head.next) ;
		Node<Integer>ans = smallans ;
		while(ans.next!= null)
		{
			ans = ans.next ;
		}
		Node<Integer>temp = head ;
		temp.next = null ;
		ans.next = temp ;
		return smallans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer>head = TakeLinkedlistINPUT() ;
		Node<Integer>temp = new Node<Integer>(0) ;
		temp = reverse_R(head) ;
		printLinkedlist(temp);

	}

}
