class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[ len1 + len2 ];
        for( int i = len2 - 1; i >= 0; i--) {
            for( int j = len1 - 1; j >= 0; j--) {
                int posCarry = i + j;
                int posRemainder = i + j + 1;
                int mul = ( num2.charAt(i) - '0' ) * ( num1.charAt(j) - '0' );
                int sum = mul + result[posRemainder];
                result[posRemainder] = sum % 10;
                result[posCarry] += sum / 10;
            }
        }
        int index = 0;
        while((index < len1 + len2) && result[index] == 0 )
            index++;
        StringBuilder resultStr = new StringBuilder();
        for( int i = index; i < result.length; i++)
            resultStr.append(result[i]);
        if(!resultStr.toString().equals(""))
            return resultStr.toString();
        else
            return "0";
    }
}
