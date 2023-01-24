import java.util.Arrays;

public class RemoveEvenInteger {
    public static void main(String[] args) {
        int a[]={2,3,5,67,43,22,44,7,8,9};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        int c=0;
        int b[]=new int[(a.length)-count];
        for(int j=0;j<a.length;j++){
            if(a[j]%2!=0){
                b[c]=a[j];
                c++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
