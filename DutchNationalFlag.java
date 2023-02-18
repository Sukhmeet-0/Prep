import java.util.Arrays;

// sort arrays of 0s 1s and 2s
public class DutchNationalFlag {
    public static void sort(int []a){
        int i=0,j=0,k=a.length-1;
        while(i<=k){
            if(a[i]==0){
                swap(a,i,j);
                i++;j++;
            }
            else if(a[i]==1){
                i++;
            }
            else if(a[i]==2){
                swap(a,i,k);
                k--;
            }
        }
    }
    public static void swap(int []a,int i,int k){
        int temp=a[i];
        a[i]=a[k];
        a[k]=temp;
    }
    public static void main(String[] args) {
        int a[]={0,1,2,2,1,0,0,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
