import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        int c = 0;
        for(int i : digits){
            str+=String.valueOf(i);
        }
          BigInteger a = new BigInteger(str);
          a = a.add(BigInteger.ONE);
          str = a.toString();
        int[] arr = new int[str.length()];
            for(int i = 0 ; i < str.length(); i++){
            arr[i]=Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        return arr;
    }
}
