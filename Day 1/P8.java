import java.util.Scanner;
public class P8{
	
	class Dad{
		int money=100;
	}
	
	class Son extends Dad{
		
	}
	
	public static void main(String args[]){
		P8 M1=new P8();
		Son s=M1.new Son();
		
		System.out.println(s.money);
	}
}	