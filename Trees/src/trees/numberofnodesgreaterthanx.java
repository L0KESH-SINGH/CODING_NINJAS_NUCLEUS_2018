package trees;

public class numberofnodesgreaterthanx extends inputANDprint{
	
	public static int numNodeGreater(TreeNode<Integer> root,int x)
	{
		int count = 1 ;
		if(root.data<x) {
			count = 0 ;
		}
		for(int i=0 ; i< root.Chidren.size() ; i++)
		{
			count += numNodeGreater(root.Chidren.get(i) , x) ;
		}
		return count ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> root = takeinputlevelwise() ;
		System.out.println(root.Chidren.size());
		//System.out.println(numNodeGreater(root, 35));
		int x = numNodeGreater(root, 35) ;
		//System.out.println(x);

	}

}
