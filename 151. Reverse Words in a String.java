class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result="";
        for(int i=words.length-1; i>=0;i--){
            String temp = words[i];
            if(temp.length()>0){
            result+=words[i]+" ";
            }
        }
    return result.substring(0,result.length()-1);
    }
}
