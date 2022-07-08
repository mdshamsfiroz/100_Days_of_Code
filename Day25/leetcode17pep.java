class Solution {
    static String[] codes = {" ", " ","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
   public ArrayList<String> letterCombinations(String digits) {
        if(digits.length() == 0){
           ArrayList<String> bres = new ArrayList<>();
           bres.add("");
           return bres;
       }

       char ch = digits.charAt(0);
       String ros = digits.substring(1);

       ArrayList<String> rres = letterCombinations(ros);
       ArrayList<String> mres = new ArrayList<>();

       for(char chcode: codes[ch - 48].toCharArray()){
           for(String rstr: rres){
               mres.add(chcode + rstr);
           }
       }

       return mres;
   }
}