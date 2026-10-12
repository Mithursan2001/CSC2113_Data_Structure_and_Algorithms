//Implement a stack for String datatype
class Queue2{
	
	int maxsize,front,rear,nItem;
	String queueArr[];
	
	Queue2(int size){
		front=-1;
		rear=-1;
		maxsize=size;
		queueArr=new String[maxsize];
	}
	public void enqueue(String x){	
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
	
	public String dequeue(){
		String tmp = "";
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
	
	public String peek(){
		return queueArr[rear];
	}
	
	public static void main(String[] args){
		Queue2 Q=new Queue2(5);
		Q.enqueue("Yatheesh");
		Q.enqueue("Thokirsan");
		Q.enqueue("Mithu");

		System.out.println("--------------");
		
		Q.dequeue();
		Q.dequeue();	
		
		Q.displayQ();
	}
	
}








