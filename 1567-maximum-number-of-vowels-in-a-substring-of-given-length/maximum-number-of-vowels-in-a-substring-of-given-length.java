class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int counter = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(arr[i])) {
                counter++;
            }
        }
        int maxVowels = counter;

        for (int i = k; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                counter++;
            }
            if (isVowel(arr[i - k])) {
                counter--;
            }
            maxVowels = Math.max(maxVowels, counter);
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
