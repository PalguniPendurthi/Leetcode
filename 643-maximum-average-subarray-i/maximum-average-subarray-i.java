class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0.0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg= sum/k;
        double curravg=0.0;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k];
            sum = sum + nums [i];
            curravg = sum / k;
            avg=Math.max(avg,curravg);
        }
        return avg;
        
    }
}