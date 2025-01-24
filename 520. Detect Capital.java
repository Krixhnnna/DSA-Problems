class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        String one = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word.equals(up) || word.equals(low) || word.equals(one)){
            return true;
        }
            return false;
}}
