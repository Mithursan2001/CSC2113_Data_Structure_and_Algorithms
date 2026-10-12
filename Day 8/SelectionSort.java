public class SelectionSort{	
	public static void SelectionSort(int array[]){
		int n = array.length;
		for(int i = 0; i < n - 1; i++){
			int minIndex = i;
			for(int j = i + 1; j < n; j++){
				if(array[j] < array[minIndex]){
					minIndex = j;
				}	
			}
			if(minIndex != i){
				swap(array,i,minIndex);
			}
		}
	}
	public static void swap(int array[], int a, int b){
			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;
    }
	
	public static void main(String args[]){
		int[] arr1 = {9,3,2,14,43,11,58,22};
		System.out.println("Before Selection sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();		
		SelectionSort(arr1);		
		System.out.println("After Selection sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
	}
}