package trees;

public class heightoftree extends inputANDprint{
	
	public static int height(TreeNode<Integer> root)
	{
		int high = 1 ;
		int max = 0 ;
		for(int i=0 ; i<root.Chidren.size() ; i++)
		{
			int smallans = height(root.Chidren.get(i)) ;
			if(smallans > max)
			{
				max = smallans ;
			}
		}
		return high + max ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = takeinputlevelwise() ;
		System.out.println(height(root));

	}

}
