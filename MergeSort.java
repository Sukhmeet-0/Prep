import java.util.Arrays;

public class MergeSort {
    static    int a[]={3,5,6,44,2,113,1};
    public static void sort(int []a,int[]temp,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            sort(a,temp,low,mid);
            sort(a,temp,mid+1,high);
            merge(a,temp,low,mid,high);
        }

    }
    public static void merge(int []a,int []temp,int low,int mid,int high){
        for(int i=low;i<=high;i++){
            temp[i]=a[i];
        }
        int i=low,j=mid+1,k=low;
        while(i<=mid && j<=high){
            if(temp[i]<=a[j]){
                a[k]=temp[i];
                i++;
            }else{
                a[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            a[k]=temp[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        sort(a,new int[a.length],0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
