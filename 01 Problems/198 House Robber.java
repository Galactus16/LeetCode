public class Solution {
    public int rob(int[] nums) {
        
        int rob = 0; //Max loot when current house is looted
        int notRob = 0; //Max loot when current house is not looted
        
        for(int loot : nums){
            int currentLoot = notRob + loot; //Prev House not robeed and this house looted
            notRob = Math.max(rob,notRob); //if not rob ith house, then take max of rob or notRob of i-1 th house
            rob = currentLoot; //if house would be looted - for next iteration purpose
        }
        
        return Math.max(rob,notRob);
    }
}