class Solution {
    public int numberOfSteps (int num) {
        int numberOfSteps = 0;
        while(num != 0){
            if(num % 2 != 0) num -= 1;
            else num = num / 2;
            numberOfSteps++;
        }
        return numberOfSteps;
    }
}
