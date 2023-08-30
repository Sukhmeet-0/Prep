
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }





        
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longestStreak=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int current=num;
                int currentstreak=1;
                while(set.contains(current+1)){
                    current=current+1;
                    currentstreak++;
                }
                longestStreak=Math.max(currentstreak,longestStreak);
            }
        }
        System.out.println(longestStreak);


        
    }
}
