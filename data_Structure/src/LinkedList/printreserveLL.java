package LinkedList;

public class printreserveLL extends LinkedListbasic{
	
	public static Node<Integer> temp2 ;
	
	public static void printReverseRecursive(Node<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		
		printReverseRecursive(root.next);
		
		System.out.print(root.data+" ");
	}
	
	public static boolean isPalindrome_2(Node<Integer> head )
	{
		if(head == null)
		{
			return true ;
		}
		boolean ans = isPalindrome_2(head.next) ;
		if(temp2.data != head.data)
		{
			ans = false ;
		}
		temp2 = temp2.next ;
		
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = TakeLinkedlistINPUT() ;
		temp2 = head ;
		//printReverseRecursive(head);
		System.out.println(isPalindrome_2(head));

	}

}
