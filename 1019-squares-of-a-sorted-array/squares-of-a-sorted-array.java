class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] out=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     out[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(out);
        // return out;
        int left=0;
        int right=nums.length-1;
        int[] result=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int square;
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                square=nums[right];
                right--;
            }else{
                square=nums[left];
                left++;
            }
            result[i]=square*square;
        }
        return result;
        
    }
}