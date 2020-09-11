class Solution {
    public int[] decompressRLElist(int[] nums) {
        int[] decompressRLElist;
        int listSize = 0;
        for(int i = 0; i < nums.length; i += 2){
            listSize += nums[i];
        }
        decompressRLElist = new int[listSize];
        
        int currentIndex = 0;
        for(int i = 0; i < nums.length; i += 2){
            Arrays.fill(decompressRLElist, currentIndex, currentIndex + nums[i], nums[i+1]);
            currentIndex += nums[i];
        }
        return decompressRLElist;
    }
}
