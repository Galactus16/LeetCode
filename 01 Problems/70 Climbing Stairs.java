public class Solution {
    public int climbStairs(int n) {
        int seed1 = 1;
        int seed2 = 2;
        
        if(n<=2)
            return n;
        int numofways = 0;
        for(int i=2; i<n; i++){
            numofways = seed1 + seed2;
            seed1 = seed2;
            seed2 = numofways;
        }
        
        return numofways;
        
    }
    
}