package LinkedList;

import java.util.Scanner;

public class LinkedListbasic {
	
	public static Node<Integer> insert(Node<Integer> head , Integer data , int pos)
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
	
	public static Node<Integer> deletenode(Node<Integer> head , int pos)
	{
		if(pos==0)
		{
			head = head.next ;
			return head ;
		}
		int i=0 ;
		Node<Integer> temp = head ;
		while(i<pos-1)
		{
			temp = temp.next ;
			i++ ;
		}
		temp.next = temp.next.next ;
		return head ;
	}
	
	public static Node<Integer> TakeLinkedlistINPUT()
	{
		Node<Integer> head = null , tail = null ;
		Scanner s = new Scanner(System.in) ;
		int data = s.nextInt() ;
		
		while(data != -1)
		{
			Node<Integer> newnode = new Node<>(data) ;
			if(head == null)
			{
				head = newnode ;
				tail = newnode ;
			}
			else
			{
				tail.next = newnode ;
				tail = newnode ;
			}
			data = s.nextInt() ;
		}
		return head ;	
	}
	
	public static <T> void printLinkedlist(Node<T> head)
	{
		Node<T> temp = head ;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next ;
		}
	}

	public static void main(String[] args) {
		
		Node<Integer> head = TakeLinkedlistINPUT() ;
		head = deletenode(head, 2) ;
		printLinkedlist(head);
		
		
	}

}
