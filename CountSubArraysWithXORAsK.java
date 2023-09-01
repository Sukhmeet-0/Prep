import java.util.HashMap;
import java.util.Scanner;

public class CountSubArraysWithXORAsK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();





        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        int xorr=0;
        for(int i=0;i<n;i++){
            xorr=xorr^a[i];
            if(map.get(xorr^k)!=null){
                cnt+=map.get(xorr^k);
            }
            if(xorr==k){
                cnt++;
            }
            if(map.get(xorr)!=null){
                map.put(xorr,map.get(xorr)+1);
            }
            else{
                map.put(xorr,1);
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
