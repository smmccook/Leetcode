class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > greatest) greatest = candies[i];
        }
        
        List<Boolean> kidsWithCandies = new ArrayList<Boolean>();
        
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= greatest)kidsWithCandies.add(true); 
            else kidsWithCandies.add(false);
        }
      
        
        return kidsWithCandies;
    }
}
