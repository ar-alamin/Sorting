
public class QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;	// pivot index
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low < high) {
			// pivot index
			int pidx = partition(arr, low, high);
			
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 8, 7, 9, 4};

		quickSort(arr, 0, arr.length -1);
		
		//print
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
