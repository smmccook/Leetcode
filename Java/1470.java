class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;
        int[] shuffle = new int[nums.length];
        for(int i = 0; i < nums.length && n < nums.length ; i += 2, n++, j++){
            shuffle[i] = nums[j];
            shuffle[i+1] = nums[n];            
        }
        return shuffle;
    }
}
