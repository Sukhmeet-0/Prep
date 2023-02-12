import java.util.ArrayList;
import java.util.Arrays;

class BinarySearchTree{
    private  static Node root;
    static int []arr=new int[10];
    static int count=0;
    private  static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void insert(int data){
        root=insert(root,data);
    }
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return  root;
        }else{
            if(data<root.data){
                root.left=insert(root.left,data);
            }
            if(data>root.data){
                root.right=insert(root.right,data);
            }
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        arr[count]=(root.data);
        count++;
        inOrder(root.right);
    }
    public static void search(Node root,int data){
        if(root==null){
            System.out.println("Not Found");
            return;
        }
        if(root.data==data){
            System.out.println("Found data");
            return;
        }
        if(data<root.data){
            search(root.left,data);
            return;
        }
        if(data>root.data){
            search(root.right,data);
            return;
        }
    }
    public static boolean valid(){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        insert(5);
        insert(3);
        insert(7);
        insert(1);
        inOrder(root);
        System.out.println();
        search(root,33);
        System.out.println(valid());
        System.out.println(Arrays.toString(arr));
    }
}