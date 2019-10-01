
public class Coin implements Comparable<Coin>{
	private int value;
	
	public Coin(int value)
	{
		this.value = value;
	}
	
	public int getVal()
	{
		return(value);
	}
	
	
	public int compareTo(Coin second){
		if(this.value>second.value)
			return 1;
		if(this.value==second.value)
		return 0;
		else 
			return -1;
			
	}


}
