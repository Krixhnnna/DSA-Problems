class Solution {
    public int maxDiff(int num) {
        int min = num, max = num;
        for (char x = '0'; x <= '9'; x++) {
            for (char y = '0'; y <= '9'; y++) {
                String s = String.valueOf(num).replace(x, y);
                if (s.charAt(0) != '0') {
                    int val = Integer.parseInt(s);
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }
            }
        }
        return max - min;
    }
}
