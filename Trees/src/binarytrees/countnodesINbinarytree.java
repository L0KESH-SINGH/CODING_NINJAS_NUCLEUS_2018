package binarytrees;


public class countnodesINbinarytree extends inputNprint{
	
	public static countleafnode(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 1 ;
		}
	}

	public static int countnodes(BinaryTreeNode<Integer> root )
	{
		if(root == null)
		{
			return 0 ;
		}
		int ans  =1 ;
		ans += countnodes(root.getLeft()) ;
		ans += countnodes(root.getRight()) ;
		return ans ;
	}
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x)
	{
		if(root == null)
		{
			return false ;
		}
		boolean ans ;
		if(root.getData() == x)
		{
			return true ;
		}
		ans = isNodePresent(root.getLeft(), x) ;
		if(ans == true )
		{
			return true ;
		}
		ans = isNodePresent(root.getRight(), x) ;
		return ans ;
		
	}
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null)
		{
			return 0 ;
		}
		int high = 1 , a , b ;
		a = height(root.getLeft()) ;
		b = height(root.getRight()) ;
		if(a>b)
		{
			high+=a;
		}
		else
			high+=b ;
		return high ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeinputlevelwise() ;
		System.out.println(countnodes(root));
		System.out.println(isNodePresent(root, 7));
		System.out.println(height(root));

	}

}
