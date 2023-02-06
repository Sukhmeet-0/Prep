import java.util.Stack;

public class ReverseString {
    static Stack<Character>stack=new Stack<>();
    public static String Reverse(String s){
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            stack.push(a[i]);
        }
        String ss="";
        for(int i=0;i<a.length;i++){
            ss+=stack.pop();
        }
        return ss;
    }
    public static void main(String[] args) {
        System.out.println(Reverse("Sukhmeet"));

    }
}
