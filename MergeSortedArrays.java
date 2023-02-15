import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int []a={1,2,3,5,7,9};
        int []b={2,4,6,8};
        int n=a.length;

        int m=b.length;
        int []result=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]==b[j]){
                result[k]=a[i];
                k++;
                i++;
                result[k]=b[j];
                k++;
                j++;
            }
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
            }else{
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            result[k]=a[i];
            i++;k++;
        }
        while(j<b.length){
            result[k]=b[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
