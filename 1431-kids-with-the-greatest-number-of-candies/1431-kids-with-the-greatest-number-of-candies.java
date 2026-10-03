class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int Max=0;
        for(int i=0;i<candies.length;i++){
           if(candies[i]>Max){
                Max=candies[i];
           }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=Max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}