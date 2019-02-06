package trees;

import java.util.ArrayList;

public class TreeNode<T> {
	
	public T data ;
	public ArrayList<TreeNode<T>> Chidren ;
	
	public TreeNode(T data)
	{
		this.data = data ;
		this.Chidren = new ArrayList<>() ;
	}

}
