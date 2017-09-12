public class Solution {
    public int removeElement(int[] nums, int val) {
      
      int firstPointer = 0;
      int lastPointer = nums.length - 1;
      
      while(firstPointer <= lastPointer){
        if(nums[firstPointer] == val)    {
            nums[firstPointer] = nums[lastPointer];
            lastPointer--;
        }else{
            firstPointer++;   
        }
      }
      
      return lastPointer+1;
      
    }
}