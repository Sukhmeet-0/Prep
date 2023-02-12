import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree{
    private static Node root;
    private  static class Node{
        private int data;
        private Node left;
        private  Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static  void create(){
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);


        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    private static void preOrder(Node root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);

        //OR

        if(root==null){
            return;
        }
        Stack<Node>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    private static void inOrder(Node root){
        if(root==null){
            return;
        }
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);

        //OR

        Stack<Node>stack=new Stack<>();
        Node temp=root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }

    }
    private static void postOrder(Node root){
        if(root==null)return ;
//        postOrder((root.left));
//        postOrder(root.right);
//        System.out.print(root.data+" ");

        //OR

        Node current=root;
        Stack<Node>stack=new Stack<>();
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current=current.left;

            }else{
                Node temp=stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty()&&temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current=temp;
                }
            }
        }
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }

    }
    public static int findMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }
    public static void main(String[] args) {
        create();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(findMax(root));
    }
}