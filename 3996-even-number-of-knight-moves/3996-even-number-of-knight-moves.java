class Solution {
    public boolean canReach(int[] start, int[] target) {
        int samecolour = (start[0]+start[1])%2;
        int targetcolour = (target[0]+target[1])%2;
        return samecolour == targetcolour;
    }
}