class Solution {

    int[] dp = new int[46]; // to store the values in the array

    public int stairs(int n){
        if(n==1 || n==2){
            return n;
        }

        if(dp[n] != 0){ //checks the values in the array,as the array values as initially 0
            return dp[n]; 
        }

        dp[n] = stairs(n-1) + stairs(n-2); //storing values
        return dp[n];
    }

    public int climbStairs(int n) {
        return stairs(n);
    }
}
