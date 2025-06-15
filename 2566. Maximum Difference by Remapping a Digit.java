class Solution {
    public int minMaxDifference(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        int a=0;
        int b=0;
        char fst1= ' ';
        char fst2= ' ';
        for(int i = 0 ; i < sb.length();i++){
            if(a<1 && sb.charAt(i)!='9'){
                fst1 = sb.charAt(i);
                a++;
            }
             if(b<1 && sb.charAt(i)!=0){
                fst2 = sb.charAt(i);
                b++;
            }
        }
        StringBuilder max = new StringBuilder();
        for(int i = 0 ; i < sb.length(); i++){
            if(sb.charAt(i)==fst1){
                max.append(9);
            }
            else{
                max.append(sb.charAt(i));
            }
        }
        StringBuilder min = new StringBuilder();
        for(int i = 0 ; i < sb.length(); i++){
            if(sb.charAt(i)==fst2){
                min.append(0);
            }
            else{
                min.append(sb.charAt(i));
            }
        }
        String ma = max.toString();
        String mi = min.toString();
        int x = Integer.parseInt(ma);
        int y = Integer.parseInt(mi);
        int result = Math.abs(x-y);
        return result;
    }
}
