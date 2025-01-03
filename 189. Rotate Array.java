class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len > 1) {
            k %= len;
            int[] result = Arrays.copyOf(nums, len);
            for (int i = 0; i < len; i++) {
                nums[(i + k) % len] = result[i];
            }
        }
    }
}
