import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * LongestCharSequenceWithoutRepeatingChars
 */
public class LongestCharSequenceWithoutRepeatingChars {

    public static void main(String[] args) {
        int count=0;
        int temp=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character>set =new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                count++;
            }else{
                temp=Math.max(temp,count);
                count=0;
                set.clear();
            }
        }



        System.out.println(temp);
        sc.close();
    }
    
}