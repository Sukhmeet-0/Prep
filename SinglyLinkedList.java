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
        if(head==null){
            head=curr;
            head.next=null;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        curr.next=null;
        temp.next=curr;
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
    public static boolean containsLoop(){
        Node ptr=head;
        Node fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            ptr=ptr.next;
            if(fastPtr==ptr){
                return true;
            }
        }
        return false;
    } 
    public static Node startNode(){
        Node fastptr=head;
        Node ptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            ptr=ptr.next;
            if(fastptr==ptr){
                return getStartingNode(ptr);
            }
        }
        return null;
    }
    private static Node getStartingNode(Node ptr){
        Node temp=head;
        while(temp!=ptr){
            temp=temp.next;
            ptr=ptr.next;
        }
        return temp;
    }
    public static void findMeetingPoint(){
        Node fp=head;
        Node p=head;
        while(fp!=null && fp.next!=null){
            fp=fp.next.next;
            p=p.next;
            if(p==fp){
                removeLoop(p);
                return;
            }
        }
    }
    public static void removeLoop(Node p){
        Node temp=head;
        while(p.next!=temp.next){
            temp=temp.next;
            p=p.next;
        }
        p.next=null;
    }
    
    public static Node addTwoList(Node a, Node b){
        Node dummy=new Node(0);
        Node tail=dummy;
        int carry=0;
        while(a!=null || b!=null){
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=x+y+carry;
            carry=sum/10;
            tail.next=new Node(sum%10);
            tail=tail.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        if(carry>0){
            tail=new Node(carry);

        }
        return dummy.next;
    }public static Node merge(Node a, Node b){
        Node dummy=new Node(0);
        Node tail=dummy;
        if(a==null){
            return b;
        }
        else if(b==null){
            return a;
        }
        while(a!=null || b!=null){
            
            if(a.data<=b.data|| b==null){
                tail.next=a;
                a=a.next;
            }else if(a.data>=b.data || a==null){
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        while(a!=null){
            tail.next=a;
            a=a.next;
            tail=tail.next;
        }
        while(b!=null){
            tail.next=b;
            b=b.next;
            tail=tail.next;
        }
        // tail.next=null;
        return dummy.next;
    }
    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        // s.head=new Node(1);
        s.insertEnd(2);
        s.insertEnd(3);

        display(s.head);

        SinglyLinkedList ss=new SinglyLinkedList();
        // ss.head=new Node(4);
        ss.insertEnd(5);
        ss.insertEnd(7);
        // ss.insertEnd(8);
        // ss.insertEnd(9);
        // ss.insertEnd(7);

        display(ss.head);
        // display(addTwoList(s.head, ss.head));
        
        display(merge(s.head, ss.head));

        


    }
}