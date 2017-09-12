public class Solution {
    public String convert(String s, int numRows) {
        
        if(s.length() == 0 || s.isEmpty() ) return s;
        
        
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i=0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        
        int charCount = 1;
        while(charCount <= s.length()){
            for(int j = 0;(charCount <= s.length()) && j < numRows ; j++){
                sb[j].append(s.charAt(charCount - 1));
                charCount++;
            }
            
            for(int j = numRows - 2; (charCount <= s.length()) && j > 0 ; j--){
                sb[j].append(s.charAt(charCount - 1));
                charCount++;
            }
        }
        
        StringBuilder sbFinal = new StringBuilder();
        
        for(int j = 0; j < numRows; j++){
            sbFinal.append(sb[j]);    
        }
        
        return sbFinal.toString();
    }
}