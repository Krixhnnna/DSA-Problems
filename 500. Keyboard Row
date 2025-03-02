class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        for(String str:words){
            int f=0, s=0, t=0;
            int n = str.length();
            for(int i=0; i < n; i++){
                if(first.contains(String.valueOf(str.charAt(i)).toLowerCase())){
                    f++;
                }
                else if(second.contains(String.valueOf(str.charAt(i)).toLowerCase())){
                    s++;
                }
                else if(third.contains(String.valueOf(str.charAt(i)).toLowerCase())){
                    t++;
                }
                if(f==n || s==n || t==n){
                    list.add(str);
                }
            }
        }

        String[] result = new String[list.size()];
        list.toArray(result);
        return result;
    }
}
