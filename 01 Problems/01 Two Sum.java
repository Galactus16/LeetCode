public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        
        if(nums.length == 2){
            result[0] = 0;
            result[1] = 1;
        }else{
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            
            for(int i= 0 ; i < nums.length; i++){
                if(h.containsKey(target-nums[i])){
                    result[0] = h.get(target-nums[i]);
                    result[1] = i;
                    break;
                }else{
                    h.put(nums[i], i);
                }
            }
        }
        
        return result;
    }
}