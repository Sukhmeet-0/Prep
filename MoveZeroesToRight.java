import java.util.Arrays;

public class MoveZeroesToRight {
    public static void main(String[] args) {
        int a[]={0,1,30,4,0,23,0,21,34,5};
        int left=0;
        int right=a.length-1;
        while(left<right){
            // System.out.println(a[left]+" , "+a[right]);
            if(a[left]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }else{
                left++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
