class Solution {
    public int numJewelsInStones(String J, String S) {
        int numJewelsInStones = 0;
        for(int i = 0; i < S.length();i++){
            for(int j = 0; j < J.length(); j++){
                if(J.charAt(j)== S.charAt(i)) numJewelsInStones++;
            }
        }
        return numJewelsInStones;
    }
}
