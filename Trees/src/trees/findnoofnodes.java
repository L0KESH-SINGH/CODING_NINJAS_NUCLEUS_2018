package trees;

public class findnoofnodes extends inputANDprint{
	
	public static int numnodes(TreeNode<Integer> root)
	{
		int count = 1 ;
		for(int i=0 ; i< root.Chidren.size() ; i++)
		{
			count += numnodes(root.Chidren.get(i)) ;
		}
		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeinputlevelwise() ;
		int count = numnodes(root) ;
		System.out.println(count);

	}

}
