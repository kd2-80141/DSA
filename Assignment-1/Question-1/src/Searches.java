import java.util.Scanner;

public class Searches {

	public static int linear_Search(int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (arr[i] == key) {
				System.out.println("No. of comparisions : " + count);
				return i;
			}
		}

	return-1;

	}

	public static void main(String[] args) {
		int arr[] = { 66, 11, 33, 88, 22, 99, 77, 33 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		int index = linear_Search(arr, arr.length, key);
		if (index != -1)
			System.out.println("Key found at: " + index);
		else
			System.out.println("Key not found");

		sc.close();
	}

}
