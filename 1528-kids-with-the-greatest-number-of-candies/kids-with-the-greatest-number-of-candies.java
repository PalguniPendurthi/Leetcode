class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int maxc=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
             maxc=Math.max(maxc,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int maxe=candies[i]+extraCandies;
            if(maxe < maxc){
                res.add(false);
            }else{
                res.add(true);

            }

        }

        return res;
    }
}