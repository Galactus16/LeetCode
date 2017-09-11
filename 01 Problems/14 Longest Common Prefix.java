public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder();
        
        if(strs.length == 0){
            return sb.toString();
        }
        
        int minLen = Integer.MAX_VALUE;
        int minInd = 0;
        
        //Finds the s with minLen and also the index of that String in strs[]
        for(int i=0; i<strs.length; i++){
            if(strs[i].length() <= minLen){
                minLen = strs[i].length();
                minInd = i;
            }
        }
        
        //Now we compare with this String in strs[i]
        for(int i=0; i < strs[minInd].length(); i++){
            char c = strs[minInd].charAt(i);
            int count = 0;
            
            for(int j=0; j<strs.length;j++){
                if(strs[j].charAt(i) == c){
                    count++;
                }else{
                    break;
                }
            }
            
            if(count == strs.length){
                sb.append(c);
            }else{
                break;
            }
        }
        
        return sb.toString();
    }
}