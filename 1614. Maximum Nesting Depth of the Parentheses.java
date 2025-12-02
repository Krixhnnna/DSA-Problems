class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack();
        List<Integer> list = new ArrayList<>();
        int c=1;
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                list.add(c);
                c++;
            }
            else if(s.charAt(i)==')'){
                st.pop();
                c--;
            }
        }
        int max=0;
        if(list.size()!=0){
        max = Collections.max(list);
        }
        return max;
    }
}
