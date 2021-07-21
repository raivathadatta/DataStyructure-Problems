package mergSort;

public class MergSort {
	static void merge(int array[], int length, int middle, int rare) {
		int n1 = middle - length + 1;
		int n2 = rare - middle;

		int Left[] = new int[n1];
		int Right[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			Left[i] = array[length + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = array[middle + 1 + j];

		int i = 0, j = 0;

		int k = length;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				array[k] = Left[i];
				i++;
			} else {
				array[k] = Right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = Left[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}

	static void sort(int array[], int length, int rere) {
		if (length < rere) {
			int m = length + (rere - length) / 2;

			sort(array, length, m);
			sort(array, m + 1, rere);

			merge(array, length, m, rere);
		}
	}

	static void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

}
