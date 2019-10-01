package queues;
import java.util.ArrayDeque;
import java.util.Deque;


public class deque {
	
	public static void main(String[] args)
	{
		Deque<Integer> deque1 = new ArrayDeque<Integer>();
		deque1.addFirst(23);
		deque1.addFirst(45);
		deque1.addFirst(2);
		System.out.println((Integer)deque1.removeLast()+" "+(Integer)deque1.removeFirst());
	}

}
