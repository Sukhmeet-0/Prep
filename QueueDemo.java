import java.util.NoSuchElementException;

public class QueueDemo {
    private static Node rear,front;
    private  static int length;
    private  static class Node{
        private  int data;
        private  Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    QueueDemo(){
        rear=null;
        front=null;
        length=0;
    }
    public static void length(){
        System.out.println(length);
    }
    public static  boolean isEmpty(){
        return length==0;
    }
    public static void enqueue(int data){
        Node temp=new Node(data);
        if(isEmpty()){
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public static void print(){
        if(isEmpty()){
            System.out.println("Empty");
        }else{
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        System.out.println(result);
    }
    public static void main(String[] args) {
        enqueue(0);
        enqueue(1);
        enqueue(2);
        print();
        dequeue();
        print();
    }
}
