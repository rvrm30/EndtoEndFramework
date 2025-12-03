package PrTest;

public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 2, 7, 8, 3, 1};

	        System.out.println("Duplicate elements in the array:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    break; // avoid printing same duplicate multiple times
	                }
	            }
	        }
	}

}
