
public class LinkedList implements List {

	private class Node implements Position {
		Node previous;
		Node next;
		Object element;

		public Node(Object element) {
			this.element = element;
			previous = null;
			next = null;
		}

		@Override
		public Object element() {
			return element;
		}

	}

	int size;
	Node first;
	Node last;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public Position first() throws ListEmptyException {
		if (size == 0)
			throw new ListEmptyException();
		else
			return first;

	}

	@Override
	public Position last() throws ListEmptyException {
		if (size == 0)
			throw new ListEmptyException();
		else // check this one
			return last;

	}

	@Override
	public Position prev(Position p) throws BoundaryViolationException {
		if (first == null)
			throw new BoundaryViolationException();
		Node element = (Node) p;
		return element.previous;

	}

	@Override
	public Position next(Position p) throws BoundaryViolationException {
		if (first == null)
			throw new BoundaryViolationException();
		Node element = (Node) p;
		return element.next;
	}

	@Override
	public Position insertFirst(Object e) {
		if(first==null)
		{
		Node input = new Node(e);
		first=input ;
		last= input ;
		size++;
		return input;
		}
		else
		{
		Node input = new Node(e);
		input.next = first;
		first.previous = input;
		first = input;
		size++;
		return first;
		}
	}

	@Override
	public Position insertLast(Object e) {
		if(first==null)
		{ 
		Node input = new Node(e);
		first=input ;
		last= input ;
		size++;
		return input;
		}
		else
		{
		Node input = new Node(e);
		input.previous = last;
		last.next = input;
		last=input;
		return input;
		}
	}

	@Override
	public Position insertBefore(Position p, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position insertAfter(Position p, Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object replace(Position p, Object e) {
		Node input = (Node)p;
		input.element=e;
		return input;
	}

	@Override
	public Object remove(Position p) {
		Node input = (Node)p;
		input.previous.next = input.next;
		input.next.previous = input.previous;
		input.next=null;
		input.previous=null;
		return p.element();
	}

}
