package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inputANDprint
{
	
	public static TreeNode<Integer> takeInput(Scanner s)
	{
		System.out.println("enter the next node data");
		int n = s.nextInt() ;
		TreeNode<Integer> root = new TreeNode<>(n) ;
		System.out.println("enter number of chidren of "+ n+ " root node");
		int childcount = s.nextInt() ;
		for(int i=0 ; i<childcount ; i++)
		{
			TreeNode<Integer> child = takeInput(s) ;
			root.Chidren.add(child) ;
		}
		return root ;
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s = root.data + " : " ;
		for(int i=0 ; i<root.Chidren.size() ; i++)
		{
			s = s + root.Chidren.get(i).data + " , " ;
		}
		System.out.println(s);
		for(int i=0 ; i<root.Chidren.size() ; i++)
		{
			print(root.Chidren.get(i)) ;
		}
	}

	public static TreeNode<Integer> takeinputlevelwise()
	{
		Scanner s= new Scanner(System.in) ;
		System.out.println("enter root data");
		int rootdata = s.nextInt() ;
		Queue<TreeNode<Integer>> pendingnodes = new LinkedList<>() ;
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata) ;
		pendingnodes.add(root) ;
		while(!pendingnodes.isEmpty())
		{
			TreeNode<Integer>frontnode = pendingnodes.remove() ;
			System.out.println("enter no of children of "+frontnode.data+" : ");
			int numchildren = s.nextInt() ;
			int i=1 ;
			while(i<=numchildren)
			{
				System.out.println("enter "+i+"th child of "+frontnode.data);
				int child = s.nextInt() ;
				TreeNode<Integer> childnode= new TreeNode<Integer>(child) ;
				frontnode.Chidren.add(childnode) ;
				pendingnodes.add(childnode) ;
				i++ ;
			}
		}
		return root ;
	}
	
	public static void printlevelwise(TreeNode<Integer> root)
	{
		Scanner s= new Scanner(System.in) ;
		Queue<TreeNode<Integer>> pendingnodes = new LinkedList<>() ;
		System.out.println(root.data);
		pendingnodes.add(root) ;
        //add null to pending
		pendingnodes.add(null) ;
		while(!pendingnodes.isEmpty())
		{
			TreeNode<Integer> frontnode = pendingnodes.remove() ;
          //if frontnode is null printnewline and add null again
			if(frontnode == null)
			{
				System.out.println();
				if(pendingnodes.size()!=0) {
				pendingnodes.add(null) ;
				}
				
				frontnode = pendingnodes.remove() ;
			}
          //but before adding null check if size of pending is 0 or not
          //if it is 0 then don't add
			for(int i=0 ; i< frontnode.Chidren.size() ; i++)
			{
				TreeNode<Integer> child = frontnode.Chidren.get(i) ;
				System.out.print(child.data + " ");
				pendingnodes.add(child) ;
			}
			//System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in) ;
		TreeNode<Integer> root = takeinputlevelwise() ;
		printlevelwise(root);//(root) ;
	}
}
