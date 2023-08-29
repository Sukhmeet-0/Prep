import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(a==null || a.length==0){
            System.out.println(res);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int target_2=target-a[i]-a[j];
                int front=j+1;
                int back=n-1;
                while(front<back){
                    int two_sum=a[front]+a[back];
                    if(two_sum<target_2)front++;
                    else if(two_sum>target_2) back--;
                    else{
                        List<Integer>quad=new ArrayList<>();
                        quad.add(a[i]);
                        quad.add(a[j]);
                        quad.add(a[front]);
                        quad.add(a[back]);
                        res.add(quad);
                        while(front<back && a[front]==quad.get(2))++front;
                        while(front<back && a[back]==quad.get(3))--back;

                    }
                }
                while(j+1<n && a[j+1]==a[j])++j;
            }
            while(i+1<n&&a[i+1]==a[i])++i;
        }

        System.out.println(res);
        sc.close();

    }
}
