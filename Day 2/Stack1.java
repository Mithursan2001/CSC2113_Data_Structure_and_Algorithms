//Implement a stack for char datatype
class Stack1{
	
	int maxsize,top;
	char arr[],temp=0;
	
	Stack1(int size){
		top=-1;
		maxsize=size;
		arr=new char[maxsize];
	}
	public boolean isFull(){
		return top==maxsize-1;
	}
	
	void push(char e){	//top=-1
		if(isFull()){
			System.out.println("Stack is Full");
		}
		else{
			top=top+1;	//top=-1+1=0
			arr[top]=e;		
			//arr[++top]=e;
		}
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	char pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			temp=arr[top];
			top=top-1;		
			//temp=arr[top--];
		}
		return temp;
	}
	
	public void displayarr(){
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}
	
	public char peek(){
		return arr[top];
	}
	public static void main(String[] args){
		Stack1 s=new Stack1(5);
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		s.displayarr();
		System.out.println("The top most element is: "+s.peek());
	}
	
}