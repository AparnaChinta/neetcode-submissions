class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] s1 = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j) {
            while(i < j && !Character.isLetterOrDigit(s1[i])) {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s1[j])) {
                j--;
            }
            if(s1[i] != s1[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
