package LinkedList;

import java.util.Arrays;

public class removeduplicatenodes extends LinkedListbasic{
	
	public static Node<Integer> removeDuplicates(Node<Integer> head)
	{
		Node<Integer> temp = head ;
		int i=0 ;
		while(temp.next != null)
		{
			
			if(temp.data.equals(temp.next.data))
			{
				head = deletenode(head, i) ;
				i-- ;
			}
			
			i++ ;
			temp = temp.next ;
		}
		return head ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = TakeLinkedlistINPUT();
		head = removeDuplicates(head) ;
		printLinkedlist(head);
		
		
	}

}
