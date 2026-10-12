class Queue{
	
	int maxsize,queueArr[],front,rear,nItem;
	Queue(int size){
		front=-1;
		rear=-1;
		maxsize=size;
		queueArr=new int[maxsize];
	}
	public void enqueue(int x){	
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
	
	public int dequeue(){
		int tmp = 0;
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
		Queue Q=new Queue(5);
		Q.enqueue(2);
		Q.enqueue(3);
		Q.enqueue(4);
		Q.enqueue(5);
		Q.enqueue(6);
		
		Q.displayQ();
		Q.enqueue(6);

		System.out.println("--------------");
		
		Q.dequeue();
		Q.dequeue();	
		
		Q.displayQ();
	}
	
}








