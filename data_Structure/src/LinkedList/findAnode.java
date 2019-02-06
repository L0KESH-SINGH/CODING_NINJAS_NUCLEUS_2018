package LinkedList;

public class findAnode extends LinkedListbasic{
	
	public static int indexOfNRec(Node<Integer> head, int n , int x)
	{
		if(head.data == n)
		{
			return x ;
		}
		if(head.next == null)
		{
			int ans = -1 ;
			return ans ;
		}
		int ans  = indexOfNRec(head.next, n, x+1) ;
		return ans ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head = TakeLinkedlistINPUT() ;
		System.out.println(indexOfNRec(head, 4, 0));

	}

}
