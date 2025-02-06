import java.util.Hashtable;
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        Hashtable<Integer,Character> ht = new Hashtable<>();
            for(int i = 0 ; i < s.length(); i++){
                ht.put(indices[i],s.charAt(i));
            }
            for(int i =0; i < s.length(); i++){
                sb.append(ht.get(i));
            }
        return sb.toString();
    }
}
