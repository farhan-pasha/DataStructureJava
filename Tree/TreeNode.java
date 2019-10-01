

public class TreeNode<E> implements Position<E>
{

	private E elem;
	private TreeNode<E> parent;
	private PositionList<E> children = new PositionList<E>();
	
	public TreeNode(E elem, Position<E> parent )
	{
		this.elem = elem;
		TreeNode<E> parentnode = (TreeNode<E>) parent;
		this.parent = parentnode;
		parentnode.children.addChild(this);
		
	}
	
	public TreeNode(E elem)
	{
		this.elem = elem;
		this.parent = null;
		
	}
	
	public E element()
	{
		return elem;
	}
	
	public TreeNode<E> getParent()
	{
		return parent;
	}
	
	public PositionList<E> getChildren()
	{
		return children;
	}
	
	
	public void setElement(E e)
	{
		this.elem = e;
	}
	
	
	
	
}
