package bubbleSort;

import java.util.LinkedList;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort sort = new BubbleSort();
		LinkedList  list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(101);
		list.add(110);
		list.add(0110);
		list.add(910);
		list.add(510);
		list.add(410);
		list.add(110);
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = (int) list.get(i);
		}

		sort.bubbleSort(arr);
		System.out.println("Sorted list");
		sort.printArray(arr);
	}

}
