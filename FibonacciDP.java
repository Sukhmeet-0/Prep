public class FibonacciDP {
    // top down
    public static int fib(int[]memo,int n){
        if(memo[n]==0){
            if(n<2){
                memo[n]=n;
            }else{
                int left=fib(memo,n-1);
                int right=fib(memo,n-2);
                memo[n]=left+right;
            }
        }
        return memo[n];
    }
    public static void main(String[] args) {

         //Bottom up
//        int []a=new int[5+1];
//        a[0]=0;
//        a[1]=1;
//        for(int i=2;i<a.length;i++){
//            a[i]=a[i-1]+a[i-2];
//        }
//        System.out.println(a[5]);

        System.out.println(fib(new int[6+1],6));

    }
}
