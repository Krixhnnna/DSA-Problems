class Solution {
    public String reformatNumber(String number) {

        String n = number.replaceAll("[\\s-]", "");
        int l=n.length();

        StringBuilder r = new StringBuilder();
        int a = 0;
         while (l > 4) {
            r.append(n, a, a + 3).append("-");
            a += 3;
            l -= 3;
        }

       if (l == 4) {
            r.append(n, a, a + 2).append("-").append(n, a + 2, a + 4);
        } else {
            r.append(n.substring(a)); 
        }

        return r.toString();
    }
}
