class Solution {
    public int minDeletionSize(String[] s) {
        int n = s.length, m = s[0].length(), c = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                if (s[i].charAt(j) < s[i - 1].charAt(j)) {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
