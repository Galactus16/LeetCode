public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        if(s.length() % 2 == 1){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    stk.push(')');
                    break;
                case '{':
                    stk.push('}');
                    break;
                case '[':
                    stk.push(']');
                    break;
                case ']': case ')': case '}':
                    if(stk.empty() || stk.pop() != s.charAt(i)){
                        return false;
                    }
                    break;
            }
        }
        return stk.empty();
    }
}