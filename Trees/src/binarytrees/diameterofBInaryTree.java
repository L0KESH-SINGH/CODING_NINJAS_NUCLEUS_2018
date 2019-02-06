package binarytrees;

public class diameterofBInaryTree extends inputNprint{
	
	public static pair<Integer, Integer> heightdiameter(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		{
			pair<Integer, Integer> output = new pair<>() ;
			output.first = 0 ;
			output.second = 0 ;
			return output ;
		}
		
		pair<Integer, Integer> lo = heightdiameter(root.getLeft()) ;
		pair<Integer, Integer> ro = heightdiameter(root.getRight()) ;
		
		int height = 1 + Math.max(lo.first, ro.first) ;
		
		int option1 = lo.first + ro.first ;
		int option2 = lo.second ;
		int option3 = ro.second ;
		
		int diameter = Math.max(option1, Math.max(option2, option3)) ;
		
		pair<Integer, Integer> output = new pair<>() ;
		output.first = height ;
		output.second = diameter ;
		return output ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeinputlevelwise() ;
		pair<Integer, Integer> output = heightdiameter(root) ;
		System.out.println("height of binary tree is : "+output.first);
		System.out.println("diameter of binary tree is : "+ output.second);

	}

}
