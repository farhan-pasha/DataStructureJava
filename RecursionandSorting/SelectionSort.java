import java.util.Arrays;

public class SelectionSort {
	
	public int[] sorter(int[] a) {
		for(int i=0; i<a.length; i++) {
			int minIndex = findMinIndex(a, i);
			a = swapElement(minIndex, i, a);
		}
		return a;
	}
	
	private int[] swapElement(int minIndex, int i, int[] a) {
		if (minIndex == i)
			return a;
		else {
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		return a;
	}

	private int findMinIndex(int[] a, int i) {
		int min = i;
		for(int j = i+1; j< a.length; j++) {
			if(a[j] < a[min])
				min = j;
		}
	return min;
	}
	
	public static void main(String args[]) {
		SelectionSort selection = new SelectionSort();
		int [] a = selection.sorter(new int[]{65, 46, 14, 52, 38, 2, 96, 39, 14, 33, 13, 4, 24, 99, 89, 77, 73, 87, 36, 81});
		System.out.println(Arrays.toString(a));
	}

}
