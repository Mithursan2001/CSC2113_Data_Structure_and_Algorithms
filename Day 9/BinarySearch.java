import java.util.*;
class BinarySearch {

    public static int Search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high ) / 2;
            if (arr[mid] == target) {
				return mid;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
		
		int arr1[] = {2,4,5,7,9,10,12,15,16};
		
		System.out.print("Target: ");
		int target = sc.nextInt();

        int result = Search(arr1, target);

		if(result == -1){
			System.out.println("Element not found");
		}
		else{
			System.out.println(target + " is at the index of " + result);
        }
    }
}
