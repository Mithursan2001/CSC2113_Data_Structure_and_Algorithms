import java.util.*;
class StackBinary{
	int maxsize,top,arr[],temp;
	
	StackBinary(int size){
		top=-1;
		maxsize=size;
		arr=new int[maxsize];
	}
	
	public boolean isFull(){
		return top==maxsize-1;
	}
	
	void push(int e){	
		if(isFull()){
			System.out.println("Stack is Full");
		}
		else{
			top=top+1;	
			arr[top]=e;		
		}
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			temp=arr[top];
			top=top-1;		
		}
		return temp;
	}
	
	public void displayarr(){
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}
	
	public int peek(){
		return arr[top];
	}
	
	public static void main(String args[]){
		StackBinary s1=new StackBinary(100);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a decimal number:");
		int m=sc.nextInt();
		
		
		while(m>0){
			int remainder=m%2;
			s1.push(remainder);
			m=m/2;
		}
		
		System.out.println("Binary representation: ");
		while (!s1.isEmpty()){
			System.out.print(s1.pop());
		}
		System.out.println("");
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		for (int i=2; i<=n; i++){
			while(n%i==0){
				s1.push(i);
				n=n/i;
			}
		}
		System.out.println("Prime factors in descending order: ");
		s1.displayarr();
	}
}
