public class Solution {
    public int lengthOfLastWord(String s) {
        String delimit = "[\\s]+";
        String[] arr = s.split(delimit);
        
        return arr.length == 0 ? 0 : arr[arr.length-1].length();
    }
}