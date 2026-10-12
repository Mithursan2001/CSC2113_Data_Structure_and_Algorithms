public class InsertionSort{
	
	public static void InsertionSort(int array[]){
		int n = array.length;
		for(int i = 1; i < n; i++){	// Start loop from the second element
			int temp = array[i];	// Temporarily store the current element
			int j = i - 1;			// Initialize j to the index before the current one			
			// Move elements that are greater than temp to one position ahead
			while( (j >= 0) && ( array[j] > temp) ){
				array[j+1] = array[j];
				j--;	// Move to the previous index
			}
			array[j+1] = temp; 	// Place temp in its correct position
		}
	}
	
	public static void main(String args[]){
		int[] arr1 = {9,14,3,2,43,11,58,22};
		System.out.println("Before Insertion sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();		
		InsertionSort(arr1);		
		System.out.println("After Insertion sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
	}
}