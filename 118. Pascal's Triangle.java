class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> inner = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    inner.add(1);  
                } else {
                    List<Integer> prev = list.get(i - 1);
                    int sum = prev.get(j - 1) + prev.get(j);
                    inner.add(sum);
                }
            }

            list.add(inner);
        }

        return list;
    }
}
