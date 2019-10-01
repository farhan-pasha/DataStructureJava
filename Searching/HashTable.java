import java.util.Arrays;

public class HashTable {
	int size;
	int[] slots;
	String[] data;
	
	public HashTable(int size) {
		this.size = size;
		slots = new int[size];
		Arrays.fill(slots, size+1);
		data = new String[size];
	}
	
	public void put(int key, String value) {
		int hashValue = hashFunction(key, this.size);
		if(this.slots[hashValue] == size+1) {
			this.slots[hashValue] = key;
			this.data[hashValue] = value;
		}
		else if (this.slots[hashValue] == key)
			this.data[hashValue] = value;
		else {
			int nextSlot = reHashFunction(hashValue, this.size);
			while(this.slots[nextSlot] != size+1 && this.slots[nextSlot] != key)
				nextSlot = reHashFunction(hashValue, this.size);
			if (this.slots[nextSlot] == size+1) {
				this.slots[nextSlot] = key;
				this.data[nextSlot] = value;
			}
			else if (this.slots[nextSlot] == key)
				this.data[nextSlot] = value;
		}
	}
	
	public String get(int key) {
		boolean stop = false;
		int position = hashFunction(key, this.size);
		while(this.slots[position] != this.size + 1 && !stop) {
			if (this.slots[position] == key)
				return this.data[position];
			else {
				position = reHashFunction(position, this.size);
				if (position == hashFunction(key, this.size))
					stop = true;
			}
			
		}
		return this.data[position];
	}

	private int reHashFunction(int hashValue, int size) {
		return (hashValue + 1)%size;
	}

	private int hashFunction(int key, int size) {
		return key % size;
	}
	
	public static void main(String args[]) {
		HashTable table = new HashTable(5);
		table.put(1, "one");
		table.put(2, "two");
		table.put(3, "three");
		System.out.println(table.get(1));
		System.out.println(Arrays.toString(table.slots));
		System.out.println(Arrays.toString(table.data));
	}

}
