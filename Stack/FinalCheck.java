
public final class FinalCheck extends AbstractCheck{

	int a;
	int b;
	
	public FinalCheck(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void sum()
	{
	System.out.println(a+b);
	}
	
	public void sum12()
	{
		System.out.println(2*a+b);
	}
	
}
