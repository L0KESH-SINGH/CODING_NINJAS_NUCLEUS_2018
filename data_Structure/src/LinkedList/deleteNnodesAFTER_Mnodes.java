package LinkedList;

public class deleteNnodesAFTER_Mnodes extends LinkedListbasic{
	
	public static Node<Integer> skipMdeleteN(Node<Integer> node , int M , int  N)
	{
		Node<Integer> temp2 = node ;
		//int j = 0 ;
		while(node!=null)
		{
			for ( int i = 1 ; i < M && node != null; i++) {
                node = node.next; // can be thought of as int x = a[i];
            }

            if (node == null || node.next == null) 
            	{return temp2 ; }

            Node<Integer> temp = node;

            for (int i = 0; i < N && temp.next != null; i++) {
                temp = temp.next; // can be thought of as int x = a[i];
                //size--;
            }

            if (temp == null) return temp2 ;

            node.next = temp.next;
            node = node.next;
            //j++ ;
		}
		return temp2 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = TakeLinkedlistINPUT() ;
		head = skipMdeleteN(head, 2, 2) ;
		printLinkedlist(head);

	}

}
