import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int a[]={2,3,5,6,8,9};
        int maxInd=a.length-1;
        int minInd=0;
        int max=a[maxInd]+1;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                a[i]=a[i]+(a[maxInd]%max)*max;
                maxInd--;
            }else{
                a[i]=a[i]+(a[minInd]%max)*max;
                minInd++;
            }
        }
        for(int i=0;i<a.length;i++){
            a[i]=a[i]/max;
        }
        System.out.println(Arrays.toString(a));
    }
}
