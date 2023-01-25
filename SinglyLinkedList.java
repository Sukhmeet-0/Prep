/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    private Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new Node(1);
        Node one=new Node(2);
        Node two=new Node(3);
        Node three=new Node(4);

        sll.head.next=one;
        one.next=two;
        two.next=three;
        three.next=null;

        Node temp=sll.head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
}