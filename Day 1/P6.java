import java.util.Scanner;
public class P6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter tne Number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.print(i);
			System.out.println();
		}
			
	}
}