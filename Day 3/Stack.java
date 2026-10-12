import java.util.*;
class Stack{
	int maxsize,top,arr[],temp;
	
	Stack(int size){
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
		Stack s1=new Stack(10);
		Stack s2=new Stack(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements to push into the stack:");
		for(int i=0; i<5;i++){
			int m=sc.nextInt();
			s1.push(m);
		}
		System.out.println("s1--------------");
		s1.displayarr();
		
		
		System.out.println("s2--------------");
		while (!s1.isEmpty()){
			s2.push(s1.pop());
		}
		System.out.println("");
		s2.displayarr();
	}
}
