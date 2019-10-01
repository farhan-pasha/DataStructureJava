import java.util.Scanner;
import java.util.Stack;
import java.util.regex.*;  

public class BracketCheck {

public static void main(String[] args)
{
	FinalCheck test121 = new FinalCheck(1,2);
	FinalCheck test122 = new FinalCheck(2,3);
	test121.sum();
	test122.sum();
	Stack<String> brack = new Stack<String>();
	String input;
	System.out.println("Give your input please");
	Scanner scan = new Scanner(System.in);
	input = scan.next();
	String last;
	for(int i=0; i<input.length(); i++)
	{
		String check=input.substring(i, i+1);
	/*	if(i==0)
		{
			if(!Pattern.matches("[<{(]",check))
			System.out.println("false");
			else
			brack.push(check);
		}*/
		if(Pattern.matches("[<{(]",check))
			brack.push(check);
		if(Pattern.matches("[>})]",check))
		{
			if(brack.size()>0)
		{
			last=brack.pop();
			if(last.equals("(") && check.equals(")") || last.equals("{") && check.equals("}") || last.equals("<") && check.equals(">"))
			{
				if(i==input.length()-1)
				System.out.println("true");
			else
			continue;
			}
			else
			{
				System.out.println("false");
				break;
			}
				
		}
			else
				System.out.println("false");
		
	}
		
		
	}

	
}
}
