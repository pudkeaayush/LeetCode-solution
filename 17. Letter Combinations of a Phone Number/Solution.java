public class Solution {
    private void combination(String[] str , StringBuilder tempString , int len, int pos , List<String> ans , String digits) {
        if(tempString.length() == len) {
            ans.add(new String(tempString.toString()));
            return;
        }
        String temp = str[Character.getNumericValue(digits.charAt(pos))];
        for( int i = 0; i < temp.length(); i++) {
            tempString.append(temp.charAt(i));
            int tempStringLength = tempString.length();
            combination(str, tempString , len , pos + 1, ans , digits);
            //tempString.remove(temp.length() - 1);
            tempString.setLength(tempStringLength - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] str = {"","" ,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List < String > ans = new ArrayList < String >();
        if(digits.length() == 0)
            return ans;
        combination(str , new StringBuilder() , digits.length() , 0 , ans, digits);
        return ans;
    }
}
