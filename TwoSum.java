import java.util.Scanner;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }   

        int ans[]=new int[2];

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j] && arr[i]+arr[j]==tar){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
