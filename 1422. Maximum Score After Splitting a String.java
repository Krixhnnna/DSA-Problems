class Solution {
    public int maxScore(String s) {
        String left = "";
        String right = "";
        List<Integer> max = new ArrayList<>();
        for(int i = 0; i<s.length()-1; i++){
            int lc = 0;
            int rc = 0;
            left+=s.charAt(i);
            right = s.substring(i+1);
            for(char l : left.toCharArray()){
                if(l == '0'){
                    lc+=1;
                }
            }
            for(char r : right.toCharArray()){
                if(r == '1'){
                    rc+=1;
                }
            max.add(lc+rc);

            }
        }
        return Collections.max(max);
    }
}
