package LinkedList;

public class AppendLastNtofirst extends LinkedListbasic{
	
	public static Node<Integer> append(Node<Integer> root, Integer n)
	{
		Node<Integer> temp = root ;
		int i=0 ;
		Node<Integer> H2 = null ;
		while(temp != null)
		{
			i++ ;
			temp = temp.next ;
		}
		int count = i - n ;
		int k = 0 ;
		temp = root ;
		while(k<count-1)
		{
			temp = temp.next ;
			k++ ;
		}
		H2 = temp.next ;
		temp.next = null ;
		Node<Integer> temp2 = root ;
		root = H2 ;
		while(H2.next != null)
		{
			H2 = H2.next ;
		}
		H2.next = temp2 ;
		return root ;	
	}

	public static void main(String[] args) {
		
		Node<Integer> head = TakeLinkedlistINPUT();
		head = append(head, 5) ;
		printLinkedlist(head);

	}

}
