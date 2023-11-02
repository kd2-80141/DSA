import java.util.Scanner;

public class DescBinary {
	public static int Binary_Search(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == key)
				return mid;

			else

			{
				if (arr[mid] > key)
					left = mid + 1;
			}

			{
				if (arr[mid] < key)
					right = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 99, 88, 77, 66, 55, 44, 11, 01 };
		System.out.println("Enter the key");
		int key = sc.nextInt();

		int index = Binary_Search(arr, arr.length, key);
		if (index != -1)
			System.out.println("Key found at index ---> " + index);
		else
			System.out.println("Key nor found");

		sc.close();

	}

}
