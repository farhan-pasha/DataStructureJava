import java.util.Iterator;

public class ListIterator<T> implements Iterator<Position<T>> {

	PositionList<T> list;
	Position<Position<T>> node;
	public ListIterator(PositionList<T> list)
	{
		this.list=list;
		node=list.getFirst();
	}
	
	@Override
	public boolean hasNext() {
		
		return node!=null;
	}

	@Override
	public Position<T> next() 
	{
		Position<Position<T>> obj = node;
		node = list.next(node);
		return obj.element();
		
	}
		
	}
