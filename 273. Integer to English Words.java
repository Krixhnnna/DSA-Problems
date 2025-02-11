class Solution {
    public String numberToWords(int num) {
     
    if(num == 0){
        return "Zero";
    }
    return numToWord(num);
    }

private String numToWord(int num){
           String[] belowten = {"", "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
           String[] belowtwenty = {"Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
              String[] belowhundred = {"", "Ten","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

              if(num < 10){
                return belowten[num];
              }
              if(num < 20){
                return belowtwenty[num-10];
              }
              if(num < 100){
                return belowhundred[num/10] + (num % 10 != 0 ? " " + numToWord(num%10) : "");
              }
              if(num < 1000){
                return numToWord(num/100) + " Hundred" +(num % 100 != 0 ? " " + numToWord(num%100) : "");
              }
              if(num < 1000000){
                return numToWord(num/1000) + " Thousand" +(num % 1000 != 0 ? " " + numToWord(num%1000) : "");
              }
              if(num < 1000000000){
                return numToWord(num/1000000) + " Million" +(num % 1000000 != 0 ? " " + numToWord(num%1000000) : "");
              }
              
            return numToWord(num/1000000000) + " Billion" +(num % 1000000000 != 0 ? " " + numToWord(num%1000000000) : "");
              
      
    }
}
