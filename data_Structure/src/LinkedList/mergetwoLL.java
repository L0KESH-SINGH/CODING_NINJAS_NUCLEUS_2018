package LinkedList;

public class mergetwoLL extends LinkedListbasic {
	
	public static Node<Integer> mergeTwoLists(Node<Integer> l1, Node<Integer> l2) {
	    Node<Integer> head = new Node<>(0);
	    Node<Integer> p = head;
	 
	    while(l1!=null||l2!=null){
	        if(l1!=null&&l2!=null){
	            if(l1.data < l2.data){
	                p.next = l1;
	                l1=l1.next;
	            }else{
	                p.next=l2;
	                l2=l2.next;
	            }
	            p = p.next;
	        }else if(l1==null){
	            p.next = l2;
	            break;
	        }else if(l2==null){
	            p.next = l1;
	            break;
	        }
	    }
	 
	    return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head1 = TakeLinkedlistINPUT() ;
		Node<Integer> head2 = TakeLinkedlistINPUT() ;
		Node<Integer>head3 = new Node<Integer>(0) ;
		head3 = mergeTwoLists(head1, head2) ;
		printLinkedlist(head3);

	}

}
