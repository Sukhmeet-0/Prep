import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []a={3,5,6,3,23,2,8,6,8,4,4,33,6};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
