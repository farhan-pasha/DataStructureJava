import java.util.ArrayList;

public class BinaryTree<T> {

	class Node<I> implements Position<T>
	{
		T element;
		Position<T> right;
		Position<T> left;
		Position<T> parent;
				
		public Node(T element)
		{
			this.element=element;
			right=null;
			left=null;
			parent=null;
		}
		
		public Node(T element, Position<T> parent)
		{
			this.element=element;
			this.parent=parent;
		}
		
		@Override
		public T element() {
			return element;
		}
		
	}
	
	Node<T> root;
	int size;
//	ArrayList<T> traverse = new ArrayList<T>();
	
		  public boolean isEmpty()
		  {
			  return size==0;
		  }
		  
		  public Position<T> left(Position<T> v) 
		  {
			  Node<T> node = (Node<T>)v;
			  return node.left;
		  }
		  
		  public Position<T> right(Position<T> v) 
		  {
			  Node<T> node = (Node<T>)v;
			  return node.right;
		  }

		  
		  public boolean hasLeft(Position<T> v)
		  {
			  Node<T> node = (Node<T>)v;
			  return node.left!=null;
		  }
		  
		  public boolean hasRight(Position<T> v)
		  {
			  Node<T> node = (Node<T>)v;
			  return node.right!=null;
		  }
		 
		  public Position<T> addRoot(T e)
		  {
			  if(!isEmpty())
				  throw new NonEmptyTreeException("Tree already has a root");
			  root = new Node<T>(e);
			  size++;
			  return root;
		  }
		  
		  public Position<T> insertRight(T element, Position<T> par)
		  {
			  Node<T> parent = (Node<T>)par;
			  if(isEmpty())
				  throw new NonEmptyTreeException("Tree is empty");
			  if(parent.right!=null)
				  throw new InvalidPositionException("Right is not empty for this node");
			  Node<T> node = new Node<T>(element, par);
			  parent.right=node;
			  size++;
			  return node ;
		  }
		  
		  public Position<T> insertLeft(T element, Position<T> par)
		  {
			  Node<T> parent = (Node<T>)par;
			  if(isEmpty())
				  throw new NonEmptyTreeException("Tree is empty");
			  if(parent.left!=null)
				  throw new InvalidPositionException("Right is not empty for this node");
			  Node<T> node = new Node<T>(element, par);
			  parent.left=node;
			  size++;
			  return node ;
		  }
		  
		  public Position<T> rightElem(Position<T> node)
		  {
			  Node<T> parent = (Node<T>)node;
			  return parent.right;
		  }
		  
		  public Position<T> leftElem(Position<T> node)
		  {
			  Node<T> parent = (Node<T>)node;
			  return parent.left;
		  }
		  		 
		  
		  public void  inOrder(Position<T> element, ArrayList<Position<T>> list)
		  {
			  if(this.hasLeft(element))
				  inOrder(this.leftElem(element),list);
			  list.add(element);
			  if(this.hasRight(element))
				  inOrder(this.rightElem(element),list);
		  }
		  
		  public void  eulerTour(Position<T> element, ArrayList<Position<T>> list)
		  {	  
			  if(this.hasLeft(element))
			  {
				  list.add(element);  
				  eulerTour(this.leftElem(element),list);
			  }
				  list.add(element);
			  if(this.hasRight(element))
			  {
				  eulerTour(this.rightElem(element),list);
				  list.add(element);
			  }
		  }
	
		
}
