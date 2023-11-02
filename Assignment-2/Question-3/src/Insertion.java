import java.util.Arrays;

public class Insertion {
	public static void Insertion_sort(int arr [], int N){
		int count=0;
		for(int i = 1 ; i< N ; i++) {
			int temp=arr[i];
			int j = i-1;
			
			while( j>=0 && arr[j] > temp) {
				count++;
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		System.out.println("Comparisons are:" + count);
	}

	public static void main(String[] args) {
            int arr[]= {55,44,22,66,11,33};
            
            System.out.println("Array before Sort:" + Arrays.toString(arr));
            
            Insertion_sort(arr,arr.length);
            System.out.println("Array after Sort:" + Arrays.toString(arr));
            
	}

}
