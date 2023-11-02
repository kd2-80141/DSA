import java.util.Arrays;

/*1. Write a selection sort function to sort array and returns no of comparisions.*/
public class Selection {
	public static void Selection_sort(int arr[], int N) {
		int count = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Count is :" + count);

	}

	public static void main(String[] args) {
		int arr[] = { 44, 11, 55, 22, 66, 33 };

		System.out.println("Array before sort" + Arrays.toString(arr));

		Selection_sort(arr, arr.length);

		System.out.println("Array after sort" + Arrays.toString(arr));
	}

}
