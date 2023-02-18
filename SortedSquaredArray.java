import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int []a={-4,-3,0,2,5,10};
//        for(int i=0;i<a.length;i++){
//            a[i]=Math.abs(a[i]*a[i]);
//        }
//        Arrays.sort(a);


        //or

        int n= a.length;
        int []result=new int[n];
        int i=0,j=n-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(a[i])>Math.abs(a[j])){
                result[k]=a[i]*a[i];
                i++;
            }else{
                result[k]=a[j]*a[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
