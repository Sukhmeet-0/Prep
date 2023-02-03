public class CircularLinkedList {
    private static Node head,tail;
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void insert(int data){
        Node curr=new Node(data);
        Node temp=head;
        if(head==null){
            head=curr;
            tail=curr;
            tail.next=head;
        }else {
            tail.next=curr;
            tail=curr;
            tail.next=head;
        }
    }
    public static void insert(int position,int data){
        Node temp=head;
        Node curr=new Node(data);
        int count=0;
        if(head==null){
            System.out.println("Empty");
            return;
        }else{
            while(count<position){
                temp=temp.next;
                count++;
            }
            curr.next=temp.next;
            temp.next=curr;
        }

    }
    public static void deleteStart(){
        if(head==null){
            System.out.println("Empty");
        }else{
            head=head.next;
            tail.next=head;
        }
    }
    public static void deleteEnd(){
        if(head==null){
            System.out.println("Empty");
        }else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
        }
    }
    public static void deleteAtPosition(int position){
        int count=0;
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
        }else{
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
        }
    }
    public static void display(){
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            do{
                System.out.print(current.data+" -> ");
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(1,6);
//        deleteStart();
//        deleteEnd();
        deleteAtPosition(2);
        display();
    }

}
