//Implement a stack for char datatype
class Queue1{
	
	int maxsize,front,rear,nItem;
	char queueArr[];
	
	Queue1(int size){
		front=-1;
		rear=-1;
		maxsize=size;
		queueArr=new char[maxsize];
	}
	public void enqueue(char x){	
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			if(rear==-1 && front==-1){
				front=0;
				rear=0;
			}
			else{
			rear=rear+1;
			}			
			queueArr[rear]=x;		
			nItem++;
		}
	}
	
	public char dequeue(){
		char tmp = 0;
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			tmp = queueArr[front];
			if(rear==front){
				front=-1;
				rear = -1;
			}
			else{
				front = front + 1;			
			}
			nItem--;
		}
		return tmp;
	}
	
	public boolean isFull(){
		return rear==maxsize-1;
	}
	
	public boolean isEmpty(){
		if(rear==-1 && front==-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void displayQ(){
		for(int i=front;i<=rear;i++)
			System.out.print(queueArr[i]+" ");
	}
	
	public int peek(){
		return queueArr[rear];
	}
	
	public static void main(String[] args){
		Queue1 Q=new Queue1(5);
		Q.enqueue('a');
		Q.enqueue('b');
		Q.enqueue('c');
		Q.enqueue('d');
		Q.enqueue('e');
		
		Q.displayQ();
		Q.enqueue('f');

		System.out.println("--------------");
		
		Q.dequeue();
		Q.dequeue();	
		
		Q.displayQ();
	}
	
}








