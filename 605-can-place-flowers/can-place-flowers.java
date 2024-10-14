class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; 
        int i = 0; 

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1; // Plant a flower
                    count++; // Increment the count of planted flowers
                    i++; // Move to the next position (skip the next one since we can't plant there)
                }
            }
            i++; // Move to the next spot
        }

        return count >= n; // Check if we can plant at least n flowers
    }
}
