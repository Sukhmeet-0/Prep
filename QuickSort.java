import java.util.Arrays;

public class QuickSort {
    public static int partition(int a[],int low,int high){
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return (i + 1);
    }
    public static  void sort(int []a,int low,int high){
        if(low<high){
            int p=partition(a,low,high);
            sort(a,low,p-1);
            sort(a,p+1,high);
        }

    }
    public static void main(String[] args) {
        int []a={1,3,5,66,4,8,9,0};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
