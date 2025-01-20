class Solution {
    public boolean areOccurrencesEqual(String s) {
       StringBuilder sb= new StringBuilder(s);
       int[] l = new int[sb.length()];
       for(int i=0; i<sb.length();i++){
        int c=0;
        for(int j=0; j<sb.length();j++){
        if(sb.charAt(i)==sb.charAt(j))
        c++;
       } 
       l[i]=c;
       }
       int o=0;
       for(int i = 0; i<l.length;i++){
        if(l[0]==l[i]){
            o++;
        }
       }
       return o==l.length;
    }
}
