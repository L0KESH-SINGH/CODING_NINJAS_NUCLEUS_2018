package LinkedList;

public class deleteNode_recursive extends LinkedListbasic{
	
	public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i , int count)
	{
		if(i==0)
		{
			return head.next ;
		}
		if(head.next == null)
		{
			return head ;
		}
		if(count == i)
		{
			if(head.next!=null)
			{
			head.next = head.next.next ;
			}
			else {
				head = null ;}
			return head ;
		}
		head.next = deleteIthNodeRec(head.next, i, count+1) ;
		return head ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = deleteIthNodeRec(head, 6 , 1) ;
		printLinkedlist(head);

	}

}
