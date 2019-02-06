package LinkedList;

public class insertnodeinLL extends LinkedListbasic 
{
	
	public static Node<Integer> insert(Node<Integer> head , int data , int pos)
	{
		Node<Integer>newnode = new Node<>(data) ;
		if(pos==0)
		{
			newnode.next = head ;
			return newnode ;
		}
		int i=0 ;
		Node<Integer>temp = head ;
		while(i<pos-1)
		{
			temp = temp.next ;
			i++ ;
		}
		newnode.next = temp.next ;
		temp.next = newnode ;
		return head ;
	}

	public static void main(String[] args) {
		
		Node<Integer> head = TakeLinkedlistINPUT() ;
		head = insert(head, 20, 6) ;
		printLinkedlist(head); 

	}

}
