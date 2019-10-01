public class LinearSearch {
	
	public int search(int[] array, int searchValue) {
		for (int i=0; i < array.length; i++) {
			if (array[i] == searchValue)
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		LinearSearch linear = new LinearSearch();
		System.out.println(linear.search(new int[]{65, 46, 14, 52, 38, 2, 96, 39, 14, 33, 13, 4, 24, 99, 89, 77, 73, 87, 36, 81}, 99));
	}

}
