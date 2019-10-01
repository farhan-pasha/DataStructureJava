import java.util.Arrays;

public class QuickSort {

	public int[] sort(int[] a) {
		return sort(a, 0, a.length-1);
	}

	private int[] sort(int[] a, int from, int to) {
		if(from >= to)
			return a;
		else {
			int partitioned = partition(a, from, to);
			sort(a, from, partitioned);
			sort(a, partitioned+1, to);
		}
		return a;
	}

	private int partition(int[] a, int from, int to) {
		int pivot = a[from];
		int i = from - 1;
		int j = to + 1;
		while( i < j) {
			i++;
			while(a[i] < pivot)
				i++;
			j--;
			while(a[j] > pivot)
				j--;
			if(i < j)
				a= swap(a, i, j);
		}
		return j;
	}

	private int[] swap(int[] a, int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		return a;
	}

	public static void main(String args[]) {
		QuickSort qs = new QuickSort();
		int[] sorted = qs.sort(new int[]{65, 46, 14, 52, 38, 2, 96, 39, 14, 33, 13, 4, 24, 99, 89, 77, 73, 87, 36, 81});
		System.out.println(Arrays.toString(sorted));
	}
}
