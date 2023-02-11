import java.util.EmptyStackException;
import java.util.Scanner;

public class StackDemo {
    public  static Node top;
    public static int length;
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    StackDemo(){
        top=null;
        length=0;
    }
    public static int getLength(){
        return length;
    }
    public static boolean isEmpty(){
        return length==0;
    }
    public static void push(int data){
        Node temp=new Node(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public static int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            int result=top.data;
            top=top.next;
            length--;
            return result;
        }
    }
    public static int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return top.data;
        }
    }


    public static void main(String[] args) {
        getLength();
        push(0);
        push(1);
        push(2);
        push(3);
        System.out.println(peek());
        pop();
        System.out.println(peek());
        pop();
        System.out.println(peek());


    }

}
