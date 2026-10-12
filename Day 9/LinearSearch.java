import java.util.*;
class LinearSearch{
	
	public static int Search(int array[],int target){
		int n = array.length;
		for(int i = 0; i<n; i++){
			if(array[i] == target){
				return i;
			}	
		}
		return -1;
	}
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		
		int arr1[] = {2,5,6,8,9,7};
		
		System.out.print("Target: ");
		int target = sc.nextInt();
		
		int result = Search(arr1, target);
	
		System.out.println(target + " is at the index of " + result);
	}	
}