public class FindMissingArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,8,9,10};
        int sum2=0;
        int s=10;
        int sum=(s*(s+1))/2;
        for(int i=0;i<a.length;i++){
            sum2+=a[i];
        }
        System.out.println(sum-sum2);
    }    
}