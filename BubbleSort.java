import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []a={3,4,5,22,7,8,8,55,65,4,0,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
