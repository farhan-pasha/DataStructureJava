import java.util.ArrayList;

public class fibonacci 
{

	int size=0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	public fibonacci(int a)
	{
		this.size = a;
		int show=fib(size-1);
		System.out.println(show);
	}
	
	public int fib(int size)
	{
		if(size==0||size==1)
		return 1;
		else
			return fib(size-2)+fib(size-1);
	}
	
	
}




