public class Solution {
    public int maxDistance(String s, int k) {
        int n = 0, s_ = 0, e = 0, w = 0, res = 0;
        for (char c : s.toCharArray()) {
            if (c == 'N') n++;
            else if (c == 'S') s_++;
            else if (c == 'E') e++;
            else w++;

            int t1 = Math.min(Math.min(n, s_), k);
            int t2 = Math.min(Math.min(e, w), k - t1);
            res = Math.max(res, calc(n, s_, t1) + calc(e, w, t2));
        }
        return res;
    }

    private int calc(int a, int b, int t) {
        return Math.abs(a - b) + t * 2;
    }
}
