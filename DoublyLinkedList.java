public class DoublyLinkedList {
    private static Node head;
    private static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void insert(int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(head==null)head=new Node(data);
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public static void insertAtPosition(int index,int data){
        Node curr=new Node(data);
        Node temp=head;
        if(head==null){
            System.out.println("List empty");
            return;
        }
        int count=0;
        while(count<index-1){
            temp=temp.next;
            count++;
        }
        curr.next=temp.next;
        curr.next.prev=curr;
        temp.next=curr;
        curr.prev=temp;

    }

    public static void display(Node head){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void deleteStart(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public static void deleteEnd(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public static void deleteAtPosition(int index){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        int count=0;
        Node temp=head;
        while(count<index-1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    public static void main(String[] args) {
        insert(0);
        insert(2);
        insert(3);
        insert(4);
        insertAtPosition(1,1);
//        display(head);
//        deleteStart();
//        display(head);
        deleteEnd();
        display(head);
        deleteAtPosition(1);
        display(head);
    }
}
