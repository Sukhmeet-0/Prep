/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    private static Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int  LengthOfList(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void insertStart(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }
    public static void insert(int data,int position){
        int count=0;
        Node temp=new Node(data);
        Node curr=head;
        while(count!=position-1){
            curr=curr.next;
            count++;
        }
        temp.next=curr.next;
        curr.next=temp;
        
    }
    public static void insertEnd(int data){
        Node temp=head;
        Node curr=new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;
        curr.next=null;
    }
    public static void deleteStart(){
        if(head==null){
            System.out.println("Linked List not Found");
        }else{
            head=head.next;
        }
    }
    public static void deleteEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.next=null;
        temp.next=null;
    }
    public static void delete(int position){
        int count=0;
        Node temp=head;
        while(count!=position-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
    }
    public static void search(int data){
        Node temp=head;
        if(head==null){
            System.out.println("List not exist");
            return;
        }
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Data Found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not found");
    }
    public static void findMiddleNode(){
        if(head==null){
            System.out.println("Linked List empty");
            return;
        }
        Node ptr=head;
        Node fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            ptr=ptr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println("Middle Node is : "+ ptr.data);
    }
    public static void findNthElementFromEnd(int position){
        if(head==null){
            System.out.println("List empty");
            return;
        }
        Node mainPtr=head;
        Node refPtr=head;
        int count=0;
        while(count<position){
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        System.out.println("Value at position "+position+" from end is "+mainPtr.data);
    }
    public static Node reverse(){
        if(head==null){
            return head;
        }
        Node curr=head;
        Node next=null;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void removeDuplicates(){
        if(head==null){
            System.out.println("Empty list");
            return ;
        }
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.data==cur.next.data){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
    }
    public static void insertIntoSortedlist(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.next=null;
            return;
        }
        Node curr=head;
        Node temp=null;
        while(curr.data<newNode.data && curr!=null){
            temp=curr;
            curr=curr.next;
        }
        newNode.next=curr;
        temp.next=newNode;
    }
    public static void deleteKey(int data){
        Node curr=head;
        Node temp=null;
        if(head==null){
            System.out.println("List empty");
            return;
        }
        while(curr!=null && curr.data!=data){
            temp=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Key not found");
            return;
        }else{
            temp.next=curr.next;
        }

        
    }
    public static boolean findLoop(){
        if(head==null){
            System.out.println("No List");
            return false;
        }
        Node sp=head;
        Node fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // SinglyLinkedList.head=new Node(1);
        // Node one=new Node(2);
        // Node two=new Node(3);
        // Node three=new Node(4);
        
        // SinglyLinkedList.head.next=one;
        // one.next=two;
        // two.next=three;
        // three.next=null;

        // display(head);
        // insertStart(0);
        // display(head);
        // display(head);
        // insertEnd(6);
        // insertEnd(6);
        // insertEnd(6);
        // insertEnd(7);
        // insertEnd(7);
        // insertEnd(8);
        // display(head);
        // display(head);
        // insert(5, 5);
        // display(head);
        // deleteStart();
        // display(head);
        // deleteEnd();
        // display(head);
        // delete(3);
        // insertEnd(6);
        // display(head);
        // search(6);
        // // System.out.println(LengthOfList());
        // Node rev=reverse();
        // // display(rev);
        // findMiddleNode();
        // findNthElementFromEnd(2);
        // removeDuplicates();
        // display(head);
        // insertIntoSortedlist(5);
        // display(head);
        // deleteKey(8);
        // display(head);

        SinglyLinkedList.head=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        Node six=new Node(6);

        head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        // six.next=null;
        six.next=three;

        System.out.println(findLoop());

    }
}