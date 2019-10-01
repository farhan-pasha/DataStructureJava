public class DoublyCircularList implements List{
	private class Node implements Position
	{	Object element;
		Node prev;
		Node next;
		/*Node()
		{
			prev=null;
			next=null;
		}
		*/
		Node(Object element)
		{
			this.element=element;
		}
		@Override
		public Object element() {
			// TODO Auto-generated method stub
			return element;
		}
	}
	int size;
	Node current_head;
	DoublyCircularList()
	{
		size=0;
		current_head=null;
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public Position current_head() throws ListEmptyException {
		// TODO Auto-generated method stub
		return current_head;
	}

	@Override
	public Position prev(Position p) throws BoundaryViolationException {
		// TODO Auto-generated method stub
		if (size==0) throw new BoundaryViolationException();
		return ((Node)p).prev;
	}

	@Override
	public Position next(Position p) throws BoundaryViolationException {
		// TODO Auto-generated method stub
		if (size==0) throw new BoundaryViolationException();
		return ((Node)p).next;
	}

	@Override
	public Position insertFirst(Object e)throws NotEmptyException {
		// TODO Auto-generated method stub
		if(size!=0){throw new NotEmptyException();}
		else
		{
		Node n =new Node(e);
		n.next=n;
		n.prev=n;
		size++;
		current_head=n;
		return n;
		}
		
	}
	public Position add_after(Object e) throws NotEmptyException
	//add after current_node
	{	if (size==0) insertFirst(e);
		
		Node n = new Node(e);
		n.next=current_head.next;
		n.prev=current_head;
		current_head.next.prev=n;
		current_head.next=n;
		size++;
		return n;
		
	}
	public Position add_before(Object e) throws NotEmptyException
	//add after current_node
	{	if (size==0) insertFirst(e);
		
		Node n = new Node(e);
		n.next=current_head;
		n.prev=current_head.prev;
		current_head.prev=n;
		n.prev.next=n;
		size++;
		return n;
		
	}
	@Override
	public Position insertBefore(Position p, Object e)  throws NotEmptyException{
		// TODO Auto-generated method stub
		if (size==0) insertFirst(e);
		Node pos=(Node)p;
		Node n = new Node(e);
		n.next=pos;
		n.prev=pos.prev;
		pos.prev=n;
		//as we wrote pos.prev above we changed pos.prev
		//Therefore instead of pos.prev.next i wrote n.prev.next
		n.prev.next=n;
		//if(n.next==null)throw new NotEmptyException();

		size++;
		return n;	}

	@Override
	public Position insertAfter(Position p, Object e) throws NotEmptyException {
		// TODO Auto-generated method stub
		if (size==0) insertFirst(e);
		
		Node n = new Node(e);
		Node pos=(Node)p;

		n.next=pos.next;
		n.prev=pos;
		pos.next.prev=n;
		pos.next=n;
		size++;
		return n;	}

	@Override
	public Object replace(Position p, Object e) {
		// TODO Auto-generated method stub
		Node n = new Node(e);
		Node pos=(Node)p;
		Object res=pos.element;
		
		n.next=pos.next;
		n.prev=pos.prev;
		pos.prev.next=n;
		pos.next.prev=n;
		pos.next=null;
		pos.prev=null;
		
		return res;	}

	@Override
	public Object remove(Position p) {
		// TODO Auto-generated method stub
		Node pos=(Node)p;
		Object res=pos.element;
		pos.prev.next=pos.next;
		pos.next.prev=pos.prev;
		return res;
	}
	public static void main(String args[]) throws ListEmptyException, NotEmptyException, BoundaryViolationException
	{
		String a="First...insertFirst()";
		DoublyCircularList m =new DoublyCircularList();
		Position current1=m.insertFirst(a);
		
		Integer aa= new Integer(100);
		Position current2=m.insertAfter(current1,"2...insertAfter(current2)");
		Position current3=m.insertAfter(current2,"3...insertAfter(current3)");
		Position current5=m.insertAfter(current2,aa);
		Position current4=m.insertBefore(current3,"3...insertAfter(current3)");
		System.out.println(m.prev(current1));
		System.out.println(m.next(current1));
		System.out.println(m.prev(current2));
		System.out.println(m.next(current2));
		System.out.println(m.prev(current3));
		System.out.println(m.next(current3));
		Position[] cc=new Position[]{current1,current2,current3,current5,current4};
		//String c=m.replace(current1, "Replacement");

		/*
		 * Position current2=m.add_after("Second...add_after");
		Position current2=m.add_after("Second...add_after");
		
		Position current4=m.insertAfter(current2,"Fourth...insertAfter(current2)");
		Position current5=m.insertBefore(current3,"Fifth...insertBefore(current3)");
		*/
		/*System.out.println(m.prev(current4));
		System.out.println(m.next(current5));
		*/

		
		Position pos=m.current_head();
		for(int i=0;i<m.size;i++)
		{
			System.out.println(i + " : " + pos.element()+ "" +cc[i]);
			pos=m.next(pos);
		}
	}

}
