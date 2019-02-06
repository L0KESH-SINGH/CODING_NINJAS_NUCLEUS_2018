package trees;

public class countleafnodes extends inputANDprint{
	
	public static int countLeafNodes(TreeNode<Integer> root)
	{
		if(root.Chidren.size() == 0)
		{
			return 1 ;
		}
		int count = 0 ;
		for(int i=0 ; i< root.Chidren.size() ; i++)
		{
			count += countLeafNodes(root.Chidren.get(i));
		}
		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = takeinputlevelwise() ;
		System.out.println(countLeafNodes(root));

	}

}
