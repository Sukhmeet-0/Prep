import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreatestElement(int[]a){
        int []result=new int[a.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty()&& stack.peek()<=a[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                result[i]= stack.peek();
            }
            stack.push(a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreatestElement(new int[]{4, 7, 3, 4, 8, 1})));
    }
}
