import java.util.Scanner;
public class P7{
	
	public int sum(int a,int b){ 
		return a+b;
	}
	public int multi(int a,int b){ 
		return a*b;
	}
	
	public static void main(String args[]){
		P7 M1=new P7();
		
		System.out.println("Addition : "+M1.sum(10,20));
		System.out.println("Multiplication : "+M1.multi(10,20));
	}
}	