import java.util.Iterator;


public class LinkTree<E> implements Tree<E> {

	int size;
	private Position<E> root;
	
	public LinkTree()
	{
		root = null;
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		PositionList<E> totpos = new PositionList<E>();
		this.preOrder(root, totpos);			
		return totpos;
	}

	@Override
	public E replace(Position<E> v, E e) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>)v;
		node.setElement(e);
		return node.element();
	}

	@Override
	public Position<E> root() throws EmptyTreeException {
		return root;
	}

	@Override
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		TreeNode<E> node = (TreeNode<E>)v;
		return node.getParent();
	}

	@Override
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>)v;
		return node.getChildren();
	}

	@Override
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>)v;
		return node.getChildren()!=null;
	}

	@Override
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>)v;
		return node.getChildren()==null;
	}

	@Override
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		 return v==root;
	}
	
	public void addRoot(E e)
	{
		if(!isEmpty())
			throw new NonEmptyTreeException("Tree already has a root");
		root = new TreeNode<E>(e);
		size=1;
	}
	
	public void addNode(E e, Position<E> parent)
	{
		Position<E> node = new TreeNode<E>(e, parent);
		size++;
	}
	
	public void preOrder(Position<E> node, PositionList<E> pos )
	{
		pos.addChild(node);
		if(this.isInternal(node))
		{	 	
		Iterable<Position<E>> childlist = this.children(node);
		Iterator<Position<E>> it = childlist.iterator();
		while(it.hasNext())
			preOrder(it.next(),pos);
		}
	}
	
	public void postOrder(Position<E> node, PositionList<E> pos )
	{
		if(this.isInternal(node))
		{
		Iterable<Position<E>> childlist = this.children(node);
		Iterator<Position<E>> it = childlist.iterator();
		while(it.hasNext())
			postOrder(it.next(),pos);
		}
		pos.addChild(node);
	}

		
}
