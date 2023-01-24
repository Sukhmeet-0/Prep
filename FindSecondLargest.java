import java.util.Arrays;

public class FindSecondLargest {
    public static void main(String[] args) {
        int a[]={1,2,3,45,5,5,435,4,38,43};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}
