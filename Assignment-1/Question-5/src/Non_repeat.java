/*1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8*/
public class Non_repeat {

	public static void main(String[] args) {
		int count;
              int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
              
              for(int i=0 ; i<arr.length ; i++) {
            	  count=0;
            	  for(int j= 0 ; j< arr.length ; j++) {
            		  if(arr[i]==arr[j])
            			  count++;
            	  }
            	  if(count==1) {
            		  System.out.println("Non-repeating element is" + arr[i]);
            		  break;
            	  }
              }
	}

}
