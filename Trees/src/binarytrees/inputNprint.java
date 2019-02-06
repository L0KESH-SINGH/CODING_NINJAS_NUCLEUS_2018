package binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class inputNprint {
	
	public static BinaryTreeNode<Integer> takeinput (Scanner s)
	{
		System.out.println("enter root");
		int rootdata = s.nextInt() ;
		if(rootdata == -1)
		{
			return null ;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata) ;
		root.setLeft(takeinput(s)) ;
		root.setRight(takeinput(s)) ;
		return root ;
	}
	
	public static BinaryTreeNode<Integer> takeinputlevelwise()
	{
		Scanner s = new Scanner(System.in) ;
		System.out.println("enter root");
		int rootdata = s.nextInt() ;
		Queue<BinaryTreeNode<Integer>> pendingnodes = new LinkedList<>() ;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata) ;
		pendingnodes.add(root) ;
		while(!pendingnodes.isEmpty())
		{
			BinaryTreeNode<Integer> front = pendingnodes.remove() ;
			System.out.println("enter left child of : "+ front.getData());
			int leftchild = s.nextInt() ;
			if(leftchild!=-1)
			{
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftchild) ;
				front.setLeft(left) ;
				pendingnodes.add(left) ;
			}
			System.out.println("enter right child of : "+ front.getData());
			int rightchild = s.nextInt() ;
			if(rightchild!=-1)
			{
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightchild) ;
				front.setRight(right) ;
				pendingnodes.add(right) ;
			}
		}
		return root ;
	}

	public static void printrecursively(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return ;
		}
		String tobeprint = root.getData() + " " ;
		if(root.getLeft()!=null)
		{
			tobeprint += "L: " + root.getLeft().getData() + "," ;
		}
		if(root.getRight() != null)
		{
			tobeprint += "R: " + root.getRight().getData() + "," ;
		}
		System.out.println(tobeprint);
		printrecursively(root.getLeft());
		printrecursively(root.getRight());
	}
	
	public static void printlevelwise(BinaryTreeNode<Integer> root)
	{
		Queue<BinaryTreeNode<Integer>> pendingnodes = new LinkedList<>() ;
		pendingnodes.add(root) ;
		//pendingnodes.add(null) ;
		while(!pendingnodes.isEmpty())
		{
			BinaryTreeNode<Integer> front = pendingnodes.remove() ;
			String tobeprinted ;
//			if(front == null)
//			{
//				//System.out.println();
//				if(pendingnodes.size()!=0) {
//				pendingnodes.add(null) ;}
//			}
//			else
			{
				tobeprinted = front.getData() + ":" ;
				if(front.getLeft() !=null)
				{
					tobeprinted += "L:" + front.getLeft().getData() +",";
					pendingnodes.add(front.getLeft()) ;
				}
				else
					tobeprinted += "L:" + " ," ;
				if(front.getRight() != null)
				{
					tobeprinted += "R:" + front.getRight().getData() ;
					pendingnodes.add(front.getRight()) ;
				}
				else
					tobeprinted += "R:" + " " ;
				System.out.println(tobeprinted);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		//BinaryTreeNode<Integer> root = takeinput(s) ;
		BinaryTreeNode<Integer> root = takeinputlevelwise() ;
		//printrecursively(root);
		printlevelwise(root);

	}

}
