class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumleft=new int[nums.length+1];
        int[] sumright=new int[nums.length+1];
        sumleft[0]=0;
        sumright[nums.length]=0;
        int ans=-1;

        for(int i=1;i<=nums.length;i++){
            sumleft[i]=nums[i-1]+sumleft[i-1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            sumright[i] = nums[i] + sumright[i + 1];
        }
        for(int i=0;i<=nums.length-1;i++){
            if(sumleft[i]==sumright[i+1]){
                ans=i;
                break;
            }
        }
        return ans;

    }
}