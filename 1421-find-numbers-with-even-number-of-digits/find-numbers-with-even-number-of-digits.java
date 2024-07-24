class Solution {
    public int findNumbers(int[] nums) {
        int out=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int cnt=0;
            while(curr!=0){
                curr=curr/10;
                cnt++;
            }
            if(cnt%2==0){
                out++;

            }
        }
        return out;
        
    }
}