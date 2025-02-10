class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> noc=new ArrayList<>();
        int greatest=0;
        for(int i:candies){
            greatest=Math.max(greatest,i);
        }
        for(int i:candies){
            if(i+extraCandies>=greatest) noc.add(true);
            else noc.add(false);
        }


        return noc;
    }
}