import java.util.Scanner;


public class InsertionSort {
	public static void main(String[] args)
	{
	Scanner test = new Scanner(System.in);
	System.out.println("Input the size of array");
	int size= test.nextInt();
	int temp;
	int insert[] = new int[size];
	for(int i=0;i<size;i++)
	{
		insert[i]=test.nextInt();
	}
	
	boolean loop=false;
	
	int j=0;
	for(int i=1; i<size; i++)
	{
		temp=insert[i];
		j=i-1;
		while(j>=0 && temp<insert[j])
		{
				insert[j+1]=insert[j];
				j--;
		}
		insert[j+1]=temp;
	}
	System.out.println("Sorted array is:");
	for(int elem: insert)
	{
		System.out.print(elem+" ");
	}
	test.close(); 
	}	
	
}
