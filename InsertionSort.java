import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []a={3,5,6,3,23,2,8,6,8,4,4,33,6};
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int temp=a[i];
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
