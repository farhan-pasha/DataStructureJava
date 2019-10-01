
public class MergeSort {

	public int[] sort(int merge1[]) {
		if (merge1.length == 1)
			return merge1;
		int first[] = new int[merge1.length / 2];
		int second[] = new int[merge1.length - first.length];
		for (int i = 0; i < first.length; i++) {
			first[i] = merge1[i];
		}
		for (int i = 0; i < second.length; i++) {
			second[i] = merge1[first.length + i];
		}
		first = sort(first);
		second = sort(second);
		merge1 = merge(first, second);
		return merge1;

	}

	public int[] merge(int[] first, int[] second) {
		int a[] = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int inc = 0;
		while (inc < (first.length + second.length) && i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				a[inc] = first[i];
				i++;
				inc++;
			} else {
				a[inc] = second[j];
				j++;
				inc++;
			}

		}

		while (i < first.length) {
			a[inc] = first[i];
			i++;
			inc++;
		}
		while (j < second.length) {
			a[inc] = second[j];
			j++;
			inc++;
		}

		return a;

	}
}
