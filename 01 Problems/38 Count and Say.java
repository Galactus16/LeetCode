public class Solution {
       
    public String countAndSay(int n) {
        return countAndSay("1", n-1);
    }
    
    private String countAndSay(String s, int num){
        if (num == 0) return s;
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char ch = s.charAt(0);
        
        for(char c : s.toCharArray()){
            if(ch == c){
                count++;
            }else{
                sb.append(count);
                sb.append(ch);
                ch = c;
                count=1;
            }
        }
        
        sb.append(count);
        sb.append(ch);
        return countAndSay(sb.toString(),num-1);
    }
}