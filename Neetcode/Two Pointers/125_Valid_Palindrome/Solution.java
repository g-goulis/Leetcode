public class Solution {
    public boolean isPalindrome(String s) {
        char c1, c2;
        if(s.length() == 0) {
            return true;
        }

        int p1 = 0;
        int p2 = s.length() - 1;

        s = s.toLowerCase();

        while(p1 <= p2) {
            c1 = s.charAt(p1);
            c2 = s.charAt(p2);

            if(!Character.isLetterOrDigit(c1)) {
                p1++;
                continue;
            } else if(!Character.isLetterOrDigit(c2)) {
                p2--;
                continue;
            }

            if(c1 - c2 != 0) {
                return false;
            }
            p1++;
            p2--;

        }

        return true;
    }

}