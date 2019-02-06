package stacks;

public class queuesusingarray {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public queuesusingarray(int capacity)
    {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public queuesusingarray()
    {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size()
    {
        return size;
    }

    boolean isempty()
    {
        return (size() == 0);
    }

    int front()
    {
        if (size() == 0) {
            return -1;
        } else {
            return data[front];
        }
    }
    
    void enqueue(int element)
    {
        if (size() == data.length) {
            System.out.println("khali ho gya");
            return;
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if (rear == data.length) {
            rear = -1;
            front = -1;
        }
        data[rear] = element;
    }
    
    int dequeue()
    {
        if (size != 0) {
            int temp = data[front];
            front++;
            size--;
            if (front == data.length) {
                front = 0;
                //rear = -1;
            }
            return temp;
        }
        return -1;
    }
    
    public static void reverseQueue(queuesusingarray q) {
    	int size = q.size ;
    	for(int i=0 ; i<size ; i++)
    	{
    		q.enqueue(q.dequeue());
    	}
  	}

    public static void main(String[] args) {
        queuesusingarray s1 = new queuesusingarray(5);
        for (int i = 1; i <= 5; i++) {
            s1.enqueue(i);
        }
//        while (!(s1.isempty())) {
//            System.out.println(s1.dequeue());
//        }
        reverseQueue(s1);
        while (!(s1.isempty())) {
            System.out.println(s1.dequeue());
        }
    }
}
