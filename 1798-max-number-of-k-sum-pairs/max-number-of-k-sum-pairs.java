class Solution {
    public int maxOperations(int[] nums, int k) {
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k||nums[i]==k){
                nums[i]=0;
                zeros++;
            }
        }
        Arrays.sort(nums);
        int cnt=0;
        int i=zeros;
        int j=nums.length-1;
        while(i<j){
        if(nums[i]+nums[j]==k){
            i++;
            j--;
            cnt++;
        }else if(nums[i]+nums[j]<k){
            i++;
        }else if(nums[i]+nums[j]>k){
            j--;
        }}
        return cnt;
    }
}