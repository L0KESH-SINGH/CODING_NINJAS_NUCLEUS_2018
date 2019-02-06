package trees;

public class sumofallnodes extends inputANDprint{
	
	public static int sumOfAllNodes(TreeNode<Integer> root)
	{
		int sum = root.data;
		for(int i=0 ; i< root.Chidren.size() ; i++)
		{
			sum += sumOfAllNodes(root.Chidren.get(i)) ;
		}
		return sum ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeinputlevelwise() ;
		System.out.println(sumOfAllNodes(root));
	}

}
