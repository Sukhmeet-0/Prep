import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length*2];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;
        System.out.println(Arrays.toString(a));
    }
}
