class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s.length();i++) {
            char ch1 = s1[i];
            char ch2 = s2[i];
            if(ch1 != ch2) {
                return false;
            }
        }
        
        return true;
    }
}
