public final class InsertionSort {
	public static int[] sort(int[] data) {
		if (data.length < 2)
			return data;
		for (int j = 1; j < data.length; j++) {
			final int key = data[j];
			int i = j - 1;
			while (i >= 0 && data[i] > key) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
		}
		return data;
	}
	
	public static int[] sortDescend(int[] data) {
		if (data.length < 2)
			return data;
		for (int j = 1; j < data.length; j++) {
			final int key = data[j];
			int i = j - 1;
			while (i >= 0 && data[i] < key) {
				data[i + 1] = data[i];
				i--;
			}
			data[i + 1] = key;
		}
		return data;
	}
}
