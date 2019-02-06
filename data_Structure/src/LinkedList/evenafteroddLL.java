package LinkedList;

public class evenafteroddLL extends LinkedListbasic {
	
	public static Node<Integer> evenafterodd(Node<Integer>head)
	{
		//Node<Integer> temp = head ;
		Node<Integer> odd = null ;
		Node<Integer> even = null ;
		Node<Integer> a1 = null ;
		Node<Integer> a2 = null ;
		int i=0 ;
		int j = 0 ;
		while(head!=null)
		{
			if(head.data%2==0)
			{
				
				if(i==0)
				{
					even = head ;
					a2 = head ;
					i++ ;
				}
				else 
				{
					even.next = head ;
					even = even.next ;
				}
			}
			else {
				
				if(j==0)
				{
					odd = head ;
					a1 = head ;
					j++ ;
				}
				else {
					odd.next = head ;
					odd = odd.next ;
				}
				
			}
			head = head.next ;
			//i++ ;
		}
		if(even!=null)
		even.next = null ;
		if(odd==null)
		{
			return a2 ;
		}
		odd.next = a2 ;
		System.out.println("loki");
		return a1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = evenafterodd(head) ;
		printLinkedlist(head);

	}

}
