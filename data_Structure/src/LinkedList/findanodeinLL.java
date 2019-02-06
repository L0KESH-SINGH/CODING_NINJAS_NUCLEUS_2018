package LinkedList;

import java.util.LinkedList;

public class findanodeinLL extends LinkedListbasic {
	
	public static int indexOfNIter(Node<Integer> head, int n)
	{
		Node<Integer> temp = head ;
		int i=0 ;
		while(temp != null)
		{
			if(temp.data == n)
			{
				return i ;
			}
			i++ ;
			temp = temp.next ;
		}
		return -1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer>head = TakeLinkedlistINPUT() ;
		System.out.println(indexOfNIter(head, 5));
	}

}
