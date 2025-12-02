class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack();
        Stack<Character> st = new Stack();
        for(int i= 0 ; i < s.length(); i++){
            if(s.charAt(i)=='#' && !ss.isEmpty()){
                ss.pop();
            }
            else if(s.charAt(i)=='#' && ss.isEmpty()){
                continue;
            }
            else{
                ss.push(s.charAt(i));
            }
        }

        for(int i= 0 ; i < t.length(); i++){
            
            if(t.charAt(i)=='#'&& !st.isEmpty()){
                st.pop();
            }
            else if(t.charAt(i)=='#' && st.isEmpty()){
                continue;
            }
            else{
                st.push(t.charAt(i));
            }
        }
        return ss.toString().equals(st.toString());
    }
}
