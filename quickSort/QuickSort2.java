
import java.util.Arrays;

class QuickSort2 {
	
	//main function or driver code
	public static void main(String args[]) {
		// initialize a numeric array, intArray
		int[] data = { 1, 5, 6, 2, 3, 8, 4, 7, 9 };
					// { 4, -1, 6, 8, 0, 5, -3 };
		int n = data.length;
		// print the original array
		System.out.println("Original Array: " + Arrays.toString(data));
		// call quick_sort routine using QuickSort object
		QuickSort2 obj = new QuickSort2();
		obj.quick_sort(data, 0, n - 1);
		// print the sorted array
		System.out.println("\nSorted Array: " + Arrays.toString(data));
	}

	// selects last element as pivot, pi using which array is partitioned.
	int partition(int intArray[], int low, int high) {
		int pi = intArray[high];
		int i = (low - 1); // smaller element index
		for (int j = low; j < high; j++) {
			// check if current element is less than or equal to pi
			if (intArray[j] <= pi) {
				i++;
				// swap intArray[i] and intArray[j]
				swap(intArray, j, i);
			}
		}

		// swap intArray[i+1] and intArray[high] (or pi)
		swap(intArray, high, i + 1);

		return i + 1;
	}

	// utility function to swap two indexes in an array
	private void swap(int[] intArray, int high, int i) {
		int temp = intArray[i];
		intArray[i] = intArray[high];
		intArray[high] = temp;
	}

	// routine to sort the array partitions recursively
	void quick_sort(int intArray[], int low, int high) {
		if (low < high) {
			// partition the array around pi=>partitioning index and return pi
			int pi = partition(intArray, low, high);

			// sort each partition recursively
			quick_sort(intArray, low, pi - 1);
			quick_sort(intArray, pi + 1, high);
		}
    }
}