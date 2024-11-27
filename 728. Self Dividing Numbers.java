class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        boolean div;
        int temp;
        for(int i=left;i<=right;i++){
            div=true;
            int original = i;
            while(original!=0){
                temp = original % 10;
                if(temp==0 || i % temp !=0){
                    div = false;
                    break;
                }
                original= original/10;
            }
            if(div){
               list.add(i);
            }
        }return list;
    }
}
