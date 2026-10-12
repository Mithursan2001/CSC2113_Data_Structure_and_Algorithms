import java.util.Scanner;
public class P4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Name: ");
		String name=sc.nextLine();
		
		System.out.println("Age: ");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Address: ");
		String address=sc.nextLine();
	}
}