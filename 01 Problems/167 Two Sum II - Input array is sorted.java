public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] resultIndex = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        
        while(leftPointer < rightPointer){
            if(target == numbers[leftPointer] + numbers[rightPointer]){
                resultIndex[0] = leftPointer + 1 ;
                resultIndex[1] = rightPointer + 1;
                break;
            }else if (target > numbers[leftPointer] + numbers[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        return resultIndex;
        
    }
}