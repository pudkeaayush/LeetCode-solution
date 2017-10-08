class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for( int i = S.length() - 1; i >= 0; i--) {
            if(S.charAt(i) != '-') {
                if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
                    str.append(Character.toUpperCase(S.charAt(i)));
                else
                    str.append(S.charAt(i));
                count++;
                if(count == K && i != 0) {
                    str.append("-");
                    count = 0;
                }
            }
        }
        String result = str.reverse().toString();
        result = result.replaceFirst ("^-*", "");
        return result;
    }
}
