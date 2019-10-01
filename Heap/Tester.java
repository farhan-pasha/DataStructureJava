import java.util.Iterator;
import java.util.Map;

public class Tester {
	public static void main(String[] args)
	{
		
		ArrayHeap<String> first = new ArrayHeap<String>();
		ArrayHeap<Integer> second = new ArrayHeap<Integer>();
		first.insert(new Entry<Integer,String>(4,"check4"));
		first.insert(new Entry<Integer,String>(14,"check14"));
		first.insert(new Entry<Integer,String>(10,"check10"));
		first.insert(new Entry<Integer,String>(9,"check9"));
		first.insert(new Entry<Integer,String>(3,"check3"));
		first.insert(new Entry<Integer,String>(1,"check1"));
		first.insert(new Entry<Integer,String>(5,"check5"));
		first.insert(new Entry<Integer,String>(7,"check7"));
		first.insert(new Entry<Integer,String>(2,"check2"));
		first.insert(new Entry<Integer,String>(12,"check12"));
		Iterator it = first.iterator();
		/*while(it.hasNext())
		{
			Entry<Integer, String> val = (Entry<Integer, String>) it.next();
			System.out.println(val.getKey()+val.getValue());
		}*/
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		System.out.println(first.remove().getKey());
		first.insert(new Entry<Integer,String>(4,"check4"));
		first.insert(new Entry<Integer,String>(1,"check1"));
		first.insert(new Entry<Integer,String>(2,"check2"));
		it = first.iterator();
		for(int i=0;i < first.size();i++)
		{
			Entry<Integer, String> val = (Entry<Integer, String>) it.next();
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
		second.insert(new Entry<Integer,Integer>(3,10));
		second.insert(new Entry<Integer,Integer>(1,10));
		second.insert(new Entry<Integer,Integer>(2,20));
		it = second.iterator();
		for(int i=0;i < second.size();i++)
		{
			Entry<Integer, Integer> val = (Entry<Integer, Integer>) it.next();
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
		
	}

}
