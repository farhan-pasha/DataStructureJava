import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SumRecursion {
	
	static int sum=0;
	
	public static void main(String[] args)
	{
		getarea(4);
		System.out.println(sum);
		getarea2(4);
		System.out.println(sum);
		
		Palindrome check = new Palindrome("012210");
		System.out.println(check.getTest());
		
		fibonacci test = new fibonacci(5);
		
		System.out.println("check".substring(5));
		
		Permutations str = new Permutations();
		ArrayList<String> str1 =  new ArrayList<String>();
		str1=str.perm("eat");
		for(String elem: str1)
		System.out.print(elem+" ");
		 
		MergeSort merge = new MergeSort();
		int input1[] = {6,4,0,3,2};
		int[] output;
		 output = merge.sort(input1);;
		 for(int i: output)
		 System.out.println(i); 
		 
		 
		 QuickSort quick = new QuickSort(input1);
		 System.out.println("Brace Yourselve Farhan");
		 quick.sort();
		 quick.getsorted();
		 System.out.println();
	
		 Coin[] coin1 = new Coin[2];
		 coin1[0] = new Coin(4);
		 coin1[1] = new Coin(2);
		 System.out.println(coin1[0].getVal());
		 Arrays.sort(coin1);
		 System.out.println(Arrays.binarySearch(coin1,new Coin(-1)));
		 System.out.println(coin1[0].getVal());
		 int[] A = 	 new int[10];
		 Arrays.fill(A,2);
		 int[] B;
		 B = Arrays.copyOfRange(A, 3, 9);
		 System.out.println(Arrays.toString(A));
		 Random rand = new Random();
		 rand.setSeed(System.currentTimeMillis());
		 System.out.println(rand.nextInt());
		}
	
	public static int getarea(int width)
	{
		
		if(width==1) return 1;
		sum=getarea(width-1)+width;
		System.out.println("check".substring(4,5));
		return sum;
	}
	
	public static int getarea2(int width)
	{
		
		if(width==1) return 1;
		sum=getarea2(width-1)+width+width-1;
		return sum;
	}
	
	
}

