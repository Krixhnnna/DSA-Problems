class Solution {
    public String reverseVowels(String s) {
       StringBuilder sb = new StringBuilder();
       List<String> v = new ArrayList<>();
       sb.append(s);
       String vowels = "AEIOUaeiou";
        for (int i = sb.length() - 1; i >= 0; i--) { 
         if (vowels.contains(String.valueOf(sb.charAt(i)))) { 
        v.add(String.valueOf(sb.charAt(i))); 
        sb.replace(i, i + 1, "$"); 
    }
}
    int in=0;
       for(int i = 0; i <=sb.length()-1; i++){
        if(sb.charAt(i)=='$'){
            sb.replace(i, i+1,v.get(in)); 
            in++;
        }
       }
       if(vowels.contains(String.valueOf(sb.charAt(sb.length()-1)))){
        sb.replace(sb.length()-1, sb.length(),v.get(v.size()-1)); 
       }
       return sb.toString();
    }
}
