public class Solution {
    public int majorityElement(int[] nums) {
        //Boyer-Moore Vote Algorithm - O(n)
        
        /***
            * Step 1: Find a candidate for majority element. - O(n)
            * Step 2: Check if this candidate is a majority element. O(n)
            *
            * Step1:
            * Find the candidate for majority element
            * 1: Initialize count of current candidate as 0, count = 0
            * 2: Iterate over the array and do following steps:
            *   (a) If count == 0, set candidate = array[i], count = 1
            * (b) Else (i) If candidate == array[i], set count = count + 1 (ii) else set count = count - 1
            * 
            * Step 2: 
            * Check if candidate is Majority Element
            * 1: If count == 0, there is no majority element.
            * 2: Else, iterate over array to get count of candidate. 
            * (a) If count is greater than n/2, return candidate (b) Else return null;
        */
        
        int candidate = 0;
        int count = 0;
        
        //Step 1
        for(int i=0; i < nums.length; i++){
            
            if(count == 0){
                candidate = nums[i];
                count++;
            }else{
                if(candidate == nums[i]){
                    count++;
                }else{
                    count--;
                }
            }
            
        }//Step 1 end - we found our majorityCandidate
        
        //Step 2 - Confirm if the majority candidate is actually a majority element
        if(count == 0){
            return 0;
        }
        
        count = 0;
        //Get real count of candidate
        for(int i =0 ; i < nums.length; i++){
            if(candidate == nums[i]){
                count++;
            }
        }
                
        
        return (count > nums.length/2) ? candidate : 0;
    }
}