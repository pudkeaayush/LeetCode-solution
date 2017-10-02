class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int word_len = word.length();
        int abbr_len = abbr.length();
        int i = 0 , j = 0;
        while( i < word_len && j < abbr_len) {
            if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }
            else {
                // If the characters are not same return false
                if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
                    return false;
                }
                StringBuilder str = new StringBuilder();
                while(j < abbr_len && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
                    str.append(abbr.charAt(j));
                    j++;
                }
                if(str.toString().length() > 0)
                    i += Integer.parseInt(str.toString());
            }
        }
        return i == word_len && j == abbr_len;
    }
}
