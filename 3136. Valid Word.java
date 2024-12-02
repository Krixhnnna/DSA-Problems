class Solution {
    public boolean isValid(String word) {
        int digit = 0;
        int upper = 0;
        int lower = 0;
        int vowels = 0;
        int cons = 0;

        
        if (word.length() < 3) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = 1;
            } 

            else if (Character.isLetter(ch)) {
                cons = 1;
            }

            if (Character.isDigit(ch)) {
                digit = 1;
            }

           
            if (Character.isUpperCase(ch)) {
                upper = 1;
            }

           
            if (Character.isLowerCase(ch)) {
                lower = 1;
            }
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return false;
            }
        }
        return vowels == 1 && cons == 1 && (upper == 1 || lower == 1);
    }
}
