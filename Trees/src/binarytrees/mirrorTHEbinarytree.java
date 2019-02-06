package binarytrees;

public class mirrorTHEbinarytree extends inputNprint{
	
	public static void mirror(BinaryTreeNode<Integer> root)
	{
		if(root.getLeft() == null || root.getRight() == null)
		{
			return ;
		}
		BinaryTreeNode<Integer> node = root.getLeft() ;
		root.setLeft(root.getRight()) ;
		root.setRight(node) ;
		mirror(root.getLeft());
		mirror(root.getRight());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root = takeinputlevelwise() ;
		mirror(root);
		printlevelwise(root);

	}

}
