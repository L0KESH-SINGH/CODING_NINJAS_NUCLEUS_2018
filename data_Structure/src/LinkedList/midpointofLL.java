package LinkedList;

public class midpointofLL extends LinkedListbasic {
	
	public static int printMiddel(Node<Integer> head)
	{
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
		int ans = slow.data ;
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = TakeLinkedlistINPUT() ;
		System.out.println(printMiddel(head));

	}

}
