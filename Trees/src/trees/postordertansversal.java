package trees;

import binarytrees.BinaryTreeNode;

public class postordertansversal extends inputANDprint{
	
	BinaryTreeNode root;
    static int preIndex = 0;
  
  public static BinaryTreeNode<Integer> buildTree(int in[], int pre[], int inStrt, int inEnd ) 
    {
        if (inStrt > inEnd) 
            return null;
  
        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
        BinaryTreeNode<Integer> tNode = new BinaryTreeNode<Integer>(pre[preIndex++]);
  
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return tNode;
  
        /* Else find the index of this node in Inorder traversal */
    	int x  = tNode.getData() ;
        int inIndex = search(in, inStrt, inEnd, x);
  
        /* Using index in Inorder traversal, construct left and
           right subtress */
        tNode.setLeft((buildTree(in, pre, inStrt, inIndex - 1)));
        tNode.setRight(buildTree(in, pre, inIndex + 1, inEnd));
  
        return tNode;
    }
  
    /* UTILITY FUNCTIONS */
     
    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
    public static int search(int arr[], int strt, int end, int value) 
    {
        int i;
        for (i = strt; i <= end; i++) 
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
      int len = in.length -1 ;
      return buildTree( in , pre , 0 , len) ;
      
		
	}
	
	public static void postOrder(TreeNode<Integer> root)
	{
		for(int i=0 ; i<root.Chidren.size() ; i++)
		{
			postOrder(root.Chidren.get(i));
		}
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = takeinputlevelwise() ;
		postOrder(root);
		

	}

}
