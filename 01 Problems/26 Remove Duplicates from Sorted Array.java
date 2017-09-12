public class Solution {
    public int removeDuplicates(int[] nums) {
        int firstpointer = 0;
        int secondpointer = firstpointer + 1;
        int resultsize = nums.length;
        
        for(; secondpointer < nums.length; secondpointer++){
            if(nums[firstpointer] == nums[secondpointer]){
                resultsize--;
            }else{
                firstpointer++;
                nums[firstpointer] = nums[secondpointer];
            }
        }
        return resultsize;
    }
}