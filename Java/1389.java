class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        // add to Arraylist so that you don't have to shift in place in int[]
        for(int i = 0; i < nums.length; i++){
            target.add(index[i], nums[i]);
        }
        // no conversion from Integer -> int, need to make new int[] array
        int[] targetArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            targetArray[i] = target.get(i);
        }
        return targetArray;
    }
}
