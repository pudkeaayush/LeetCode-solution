public class Solution {
    void printCharacter (char[] arr)
    {
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    private void generateParent(List < String > list , int left , int right , char str[] , int count) {
        if( left < 0 && right < left)
            return;
        if( left == 0 && right == 0) {
            String temp = new String(str);
            list.add(temp);
        }
        else {
            if( left > 0) {
                str[count] = '(';
                //System.out.println(count + " "  + left + " " + right + "left");
                //printCharacter(str);
                generateParent(list , left - 1, right , str , count + 1);
            }
            if( right > left) {
                str[count] = ')';
                //printCharacter(str);
                //System.out.println(count + " " + left + " " + right);
                generateParent(list , left , right - 1 , str , count + 1);
            }
        }
        
    }
    
    public List<String> generateParenthesis(int n) {
        List < String > list = new ArrayList < String >();
        generateParent( list , n , n , new char[n * 2] , 0);
        return list;
    }
}
