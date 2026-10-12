import java.util.*;
public class P3{
	int a=10;								//instance variable
	static int b=20;						//static variable
	public static void main(String args[]){
		String name="P.Mithursan";			//local variable
		
			System.out.println(name); 		//local variable
			P3 ob=new P3();					//instance variable
			System.out.println(ob.a);	
			System.out.println(b);			//static variable
			
	}
}