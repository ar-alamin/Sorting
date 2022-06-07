
public class InsertionSort {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr = {8, 7, 6, 3 , 1, 2};
		
		// Insertion Sort
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1; 
			while(j>=0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			//placement
			arr[j+1] = key;
		}
		
		printArray(arr);
	}
}
