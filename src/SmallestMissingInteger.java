package src;


	public class SmallestMissingInteger {

	    public static int findSmallestMissing(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] != i) {
	                return i;
	            }
	        }
	        
	        return n;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {0, 1, 3, 4};

	        System.out.println("Smallest missing integer in arr1: " + findSmallestMissing(arr1));  // Output: 0
	        System.out.println("Smallest missing integer in arr2: " + findSmallestMissing(arr2));  // Output: 2
	    }
	}


