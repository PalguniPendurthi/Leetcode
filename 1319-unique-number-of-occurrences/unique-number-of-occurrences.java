class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            h1.put(arr[i], h1.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>(h1.values());
        return set.size() == h1.size();
    }
}
