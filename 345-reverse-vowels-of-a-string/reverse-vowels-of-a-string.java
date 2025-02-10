class Solution {
    public String reverseVowels(String s) {
        StringBuilder rev = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        String vowel = "aeiouAEIOU";

        while (i < j) {
            while (i < j && vowel.indexOf(rev.charAt(i)) == -1) {
                i++;
            }
            while (i < j && vowel.indexOf(rev.charAt(j)) == -1) {
                j--;
            }
            char temp = rev.charAt(i);
            rev.setCharAt(i, rev.charAt(j));
            rev.setCharAt(j, temp);
            
            i++;
            j--;
        }
        return rev.toString(); 
    }
}
