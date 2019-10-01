import java.util.Comparator;

public class Compare1<T> implements Comparator<T>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer obj1 = (Integer) o1;
		Integer obj2 = (Integer) o2;
		if(obj1>obj2)
			return 1;
			else if(obj1<obj2)
				return -1;
			else 
				return 0;
	}
	


}
