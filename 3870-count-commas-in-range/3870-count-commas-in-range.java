class Solution {
    public int countCommas(int n) {
        if(n < 1000) return 0;
        return n - 999;


//        if(n >= 1000){
//         int commaCount = n - 999;
//            return commaCount;
//        } else {
//            return 0;
//        }
    }
}