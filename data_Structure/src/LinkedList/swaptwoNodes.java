package LinkedList;

public class swaptwoNodes extends LinkedListbasic{
	
	public static Node<Integer> swap_nodes(Node<Integer>head , int i , int j) 
	{
		Node<Integer>temp1 = head ;
		Node<Integer>temp2 = head ;
		int c1=0 , c2 =0 ;
		while(temp1!=null)
		{
			if(c1 == i)
			{
				break ;
			}
			c1++ ;
			temp1 = temp1.next ;
		}
		while(temp2!=null)
		{
			if(c2 == j)
			{
				break ;
			}
			c2++ ;
			temp2 = temp2.next ;
		}
		int x = temp1.data ;
		int y = temp2.data ;
		head = deletenode(head , i) ;
		head = insert(head, y , i) ;
		head = deletenode(head, j) ;
		head = insert(head, x , j) ;
		System.out.println(x+" "+y);
		
		
		return head ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		head = swap_nodes(head, 1, 3) ;
		printLinkedlist(head);

	}

}
