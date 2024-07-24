class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> nmap=new HashMap<>();
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(nmap.containsKey(complement)){
                out[0]=nmap.get(complement);
                out[1]=i;

            }
            nmap.put(nums[i],i);
        }
        return out;
    }
}