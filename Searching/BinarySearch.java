public class BinarySearch {
	
	public int search(int[] array, int searchValue) {
		int low = 0;
		int high = array.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] == searchValue)
				return mid;
			else if (array[mid] < searchValue)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		BinarySearch binary = new BinarySearch();
		System.out.println(binary.search(new int[]{2, 4, 13, 14, 14, 24, 33, 36, 38, 39, 46, 52, 65, 73, 77, 81, 87, 89, 96, 99}, 39));
	}
	

}
