public class Solution {
    public String reverseWords(String s) {
        String delimit = "[ ]+";
        String[] arr = s.trim().split(delimit);
        StringBuilder sb = new StringBuilder();
        
        for(int i=arr.length - 1; i>=0 ;i--){
            sb.append(arr[i]+" ");
        }
        
        return sb.toString().trim();
    }
}