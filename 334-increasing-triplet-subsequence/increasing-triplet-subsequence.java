class Solution {
    public boolean increasingTriplet(int[] nums) {
        int lowest=Integer.MAX_VALUE;
        int seclowest=Integer.MAX_VALUE;
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<lowest){
                lowest=nums[i];
            }else if(nums[i]>seclowest && nums[i]<lowest){
                lowest=nums[i];
            }else if(nums[i]<seclowest && nums[i]>lowest){
                seclowest=nums[i];}

            if(nums[i]>lowest && nums[i]>seclowest){
                ans=true;

            }

            


        }
        return ans;
        
    }
}