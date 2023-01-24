import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[a.length-1-i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
