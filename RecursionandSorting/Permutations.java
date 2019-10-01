import java.util.ArrayList;

public class Permutations
{
	public ArrayList<String> perm(String word)
	{
	ArrayList<String> permutations = new ArrayList<String>();

	if(word.length()==1)
			{
			permutations.add(word);
	 return permutations;
			}
	for(int i=0; i<word.length();i++)
	{
	 String sw = word.substring(0,i)+word.substring(i+1);
	 
	 Permutations swc = new Permutations();
	 ArrayList<String> permutations1 = swc.perm(sw);
	 
	 for(String s: permutations1)
	 {
	 permutations.add(word.charAt(i)+s);
	 }
	 
	}
	return permutations;
	}
}
