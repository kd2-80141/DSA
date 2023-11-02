import java.util.Scanner;

public class Binary {

	public static int BinarySearch(int arr[], int size, int key) {
		int count = 0;
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;
			
			count++;
			
			if (arr[mid] == key) {
				System.out.println("No. of comparisions : " + count);
				return mid;
			}
			else {
				if (arr[mid] > key)
					right = mid - 1;

				else
					left = mid + 1;
			}
		}
		System.out.println("No. of comparisions : " + count);
		return -1;
	}

	public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		     int arr[]= {11,35,47,57,62,79,88,98,115,137};
		     System.out.println("Enter the key element: ");
		     int key = sc.nextInt();
		     int index = BinarySearch(arr,arr.length,key );
		     if(index!=-1)
		    	 System.out.println("Key found at index: " + index);
		     else
		    	 System.out.println("Key not found");
		     
		     }

}
