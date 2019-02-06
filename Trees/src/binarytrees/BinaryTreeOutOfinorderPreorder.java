package binarytrees;

public class BinaryTreeOutOfinorderPreorder extends inputNprint{
	
	public static BinaryTreeNode<Integer> BuildTreeHelper(int in[] , int pre[] , int inS , int inE , int preS , int preE)
	{
		       if(inS>inE)
		       {
		    	   return null ;
		       }
		       int rootdata = pre[preS] ;
		       BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata) ;
		       int rootindex = -1;
		       for(int i= inS ; i<=inE ; i++)
		       {
		    	   if(in[i]==rootdata)
		    	   {
		    		   rootindex = i ;
		    		   break ;
		    	   }
		       }
		       int leftinS = inS;
		       int leftinE = rootindex -1 ;
		       int leftpreS = preS + 1;
		       int leftpreE = leftinE - leftinS + leftpreS ;
		       int rightinS = rootindex + 1 ;
		       int rightinE = inE;
		       int rightpreS = leftpreE + 1;
		       int rightpreE = preE;
		       root.setLeft(BuildTreeHelper(in, pre, leftinS, leftinE, leftpreS, leftpreE));
		       root.setRight(BuildTreeHelper(in, pre, rightinS, rightinE, rightpreS, rightpreE));
		       return root ;
	}
	
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] in,
			int[] pre){
		
			return BuildTreeHelper( in , pre , 0 , in.length-1 , 0 , pre.length -1) ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = { 4,2,5,1,3,7 } ;
		int pre[] = { 1,2,4,5,3,7 } ;
		BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(in , pre) ;
		printlevelwise(root);

	}

}
