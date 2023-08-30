import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }



        HashMap<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if( sum == 0){
                maxi=i+1;
            }else{
                if(map.get(sum)!=null){
                  maxi=Math.max(maxi,i-map.get(sum));  
                }else{
                    map.put(sum,i);
                }
            }
        }
        System.out.println(maxi);


    }
}
