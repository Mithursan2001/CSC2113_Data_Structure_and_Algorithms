public class BubbleSort{
	
	public static void BubbleSort(int array[]){
        int n = array.length;      
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
		}
	}
	
	public static void main(String args[]){
		int[] arr1 = {77,42,35,12,101,5};
		System.out.println("Before Bubble sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();		
		BubbleSort(arr1);		
		System.out.println("After Bubble sort");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
	}
}