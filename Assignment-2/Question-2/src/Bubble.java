import java.util.Arrays;

public class Bubble {
	   public static void bubble_Sort(int arr[] , int N) {
		   int count=0;
		   for(int i = 1 ; i<N ; i++) {
			   for(int j = 0 ; j<N-i ; j++) {
				   count ++ ;
				   
				   if(arr[j] > arr[j+1]) {
					   int temp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1] = temp;
				   }
			   }
		   }
		   System.out.println("No of comparisons is " + count);
	   }

	public static void main(String[] args) {
                   int arr[] = {22,33,44,11,55,66};
                    System.out.println("Array before Sort" + Arrays.toString(arr));
                    
                    bubble_Sort(arr,arr.length);
                    System.err.println("Array After Sort" + Arrays.toString(arr));
	}

}
