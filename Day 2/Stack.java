class Stack{
	
	int maxsize,arr[],top,temp;
	Stack(int size){
		top=-1;
		maxsize=size;
		arr=new int[maxsize];
	}
	public boolean isFull(){
		return top==maxsize-1;
	}
	
	void push(int e){	//top=-1
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
	
	int pop(){
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
	
	public int peek(){
		return arr[top];
	}
	
	public static void main(String[] args){
		Stack s=new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.displayarr();
		System.out.println("The top most element is: "+s.peek());
		System.out.println("--------------");
		s.push(8);		//over flow
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();		//underflow
		s.displayarr();
	}
	
}