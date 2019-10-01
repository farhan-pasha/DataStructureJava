import java.util.Iterator;

public class PositionList<T> implements Iterable<Position<T>> {
	
	public class Node<E> implements Position<Position<T>> {
		private TreeNode<T> element = null;
		private Node<T> next = null;

		public Node(TreeNode<T> elem)
	 {
		 this.element= elem;
	 }
		
	public TreeNode<T> element()
	{
		return element;
	}

	}
	private Node<T> last;
	private Node<T> first;


	public void addChild(Position<T> childpos) {
	TreeNode<T> child = (TreeNode<T>)childpos;
	Node<T> inschild = new Node<T>(child);
		if (last == null) {
			last = inschild;
			first = inschild;
		} else {
			last.next = inschild;
			last = inschild;
		}

	}
	
	public Position<Position<T>> getFirst()
	{
		return first;
	}


	public Position<Position<T>> next(Position<Position<T>> node)
	{
		@SuppressWarnings("unchecked")
		Node<T> innode= (Node<T>)node;
		innode=innode.next;
		node = innode; 
		return node;
	}
	/*
	public boolean hasNext(Position<T> node)
	{
		Node<T> innode= (Node<T>)node;
		innode=innode.next;
		return innode!=null;
	}
	*/
	
	
	@Override
	public Iterator<Position<T>> iterator() {
		Iterator<Position<T>> list = new ListIterator<T>(this);
		return list;
	}
}
