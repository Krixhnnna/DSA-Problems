class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> str = new ArrayList<String>();
        for(int k=0; k<words.length;k++){
            for(int i = 0; i<words.length; i++){
                if(k!=i && words[k].contains(words[i]) && !str.contains(words[i])){
                    str.add(words[i]);
                }
            }
        }
        return str;
    }
}
