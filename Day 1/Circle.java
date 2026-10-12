import java.util.*;
class Circle{
	
	public double calculateArea(double a){
		return Math.PI*a*a;
	}
	
	public static void main(String args[]){
		Circle M1=new Circle();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter tne radius : ");
		int n = sc.nextInt();
		
		System.out.println("Calculate Area : "+M1.calculateArea(n));
	}
}