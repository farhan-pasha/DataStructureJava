import java.util.*;
public class ArrayHeap<T> implements Iterable<Entry<Integer,T>>{
	private int size=0;
	Vector<Entry<Integer,T>> heap = new Vector<Entry<Integer,T>>();
	Comparator<Integer> check = new Compare1<Integer>();
	public Entry<Integer,T> insert(Entry<Integer,T> Elem)
	{
		heap.add(size, Elem);;
		size++;
		upheap(Elem);
		return Elem;
	}
	
	
	public Entry<Integer,T> remove()
	{
		Entry<Integer,T> temp = heap.get(0);
		heap.set(0,heap.get(size-1));
		size--;
		downheap(heap.get(0));
		return temp;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void upheap(Entry<Integer,T> Elem)
	{
		if(size==1)
			return;
		int count = size;
		Entry<Integer,T> parent;
		Integer nextparent = heap.get((count/2)-1).getKey();
		while(count!=1 && check.compare(Elem.getKey(), nextparent)<1)
			{
			parent = heap.get((count/2)-1);
			Entry<Integer,T>  temp = parent;
			heap.set((count/2)-1, Elem);
			heap.set(count-1,temp);
			count = count/2;
			}
		
	}
	
	public void downheap(Entry<Integer,T> Elem)
	{
		if(size==1)
			return;
		int count=2;
		while (count<=size) 
				{
				if(count==size)
				{
					Integer nextchild=heap.get(count-1).getKey();
				if(check.compare(Elem.getKey(),nextchild)>0)
				{
				Entry<Integer,T> temp= heap.get(count-1);
				heap.set(count-1, Elem);
				heap.set((count/2)-1,temp);
				}
				break;
				}
				else
				{
				Entry<Integer,T> child;
				Integer nextchild=heap.get(count-1).getKey();
				if(check.compare(heap.get(count).getKey(),nextchild)<0)
				{
					child=heap.get(count);
				    count=count+1;
				}
				else
				{
					child = heap.get(count-1);
				}
				if(check.compare(Elem.getKey(),child.getKey())>0)
				{
				Entry<Integer,T> temp= child;
				heap.set(count-1, Elem);
				heap.set((count/2)-1,temp);
				count=count*2;
				}
				else 
				break;
			    }
				}
	}

	@Override
	public Iterator iterator() {
		return heap.iterator();
	}
	
	
	
}
