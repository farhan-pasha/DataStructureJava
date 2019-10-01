
public class Palindrome {

	private int beg;
	private int end;
	String a;
	boolean test=false;
public Palindrome(String a)
{
	beg=0;
	end=a.length()-1;
	this.a=a;
	palindrome(end,beg);
	
}

public void palindrome(int end,int beg)
{
	if(end==beg )
	{
		test=true;
		return;
	}
	if(end==beg+1)
	{
		if(a.charAt(end)==a.charAt(beg))
			{test=true; return;}
		else 
		{test=false; return;}
	}
	if(a.charAt(end)==a.charAt(beg))
		palindrome(end-1,beg+1);
}

public boolean getTest()
{
	return test;
}
}

