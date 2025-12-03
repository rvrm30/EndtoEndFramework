package PrTest;

public class DuplicatesRemoveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
	        int n = arr.length;

	    
	        // Temporary array to store unique elements
	        int[] temp = new int[n];
	        int k = 0; // index for temp

	        for (int i = 0; i < n; i++) {
	            boolean duplicate = false;

	            // check if arr[i] already exists in temp
	            for (int j = 0; j < k; j++) {
	                if (arr[i] == temp[j]) {
	                    duplicate = true;
	                    break;
	                }
	            }
	            if (!duplicate) {
	                temp[k++] = arr[i];
	            }
	        }

	        // Print result
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(temp[i] + " ");
	        }

	}

}
