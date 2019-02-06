package LinkedList;

public class mergesorLL extends mergetwoLL{
	
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head.next == null)
		{
			return head ;
		}
		Node<Integer> slow = head ;
		Node<Integer>temp = head ;
		Node<Integer> fast = head ;
		while(fast.next != null)
		{
			slow = slow.next ;
			fast = fast.next.next ;
			if(fast == null)
			{
				slow = temp ;
				break ;
			}
			temp = slow ;
		}
		Node<Integer> l2 = slow.next ;
		slow.next = null ;
		Node<Integer> l1 = head ;
		Node<Integer> a1 = mergeSort(l1) ;
		Node<Integer> a2 = mergeSort(l2) ;
		temp = mergeTwoLists(a1, a2) ;
		
		return temp ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = TakeLinkedlistINPUT() ;
		head = mergeSort(head) ;
		printLinkedlist(head);

	}

}
