public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)
            return true;
        int mid = s.length() / 2;
        int j = s.length() - 1;
        int i = 0;
        while ( i < j ) {
           if( Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) ) {
               //System.out.println("Yo");
               if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) )
                   return false;
               else {
                   i++;
                   j--;
               }
           }
           else if(Character.isLetterOrDigit(s.charAt(i) ) && !Character.isLetterOrDigit(s.charAt(j )))
               j--;
           else if(!Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) )
               i++;
           else if (!Character.isLetterOrDigit(s.charAt(i) ) && !Character.isLetterOrDigit(s.charAt(j ))) {
                 i++;
                 j--;
           }
        }
        return true;
    }
}
