package binarytrees;

public class BinaryTreeNode <T> {
	
	private T data ;
	public BinaryTreeNode(T data) {
		this.setData(data) ;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode<T> getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	public BinaryTreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}
	private BinaryTreeNode<T> left ;
	private BinaryTreeNode<T> right ;

}
