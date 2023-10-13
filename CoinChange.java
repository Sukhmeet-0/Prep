import java.util.Arrays;

public class CoinChange{
    public static void main(String[] args) {
        int n=18;
        
        int a[]={7,5,1};
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans=coinChange(a, n,dp);
        System.out.println(ans);
    }
    public static int coinChange(int[] coins, int amount,int[]dp) {
        if(amount==0){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
                int subAns=0;
                if(dp[amount-coins[i]]!=-1){
                    subAns=dp[amount-coins[i]];
                }
                subAns=coinChange(coins, amount-coins[i],dp);
                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1;
                }
            }
        }
        
        return dp[amount]= ans;
    }
}