class Solution {
    public boolean checkString(String s) {
        HashSet <Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.contains("ba")){
                return false;
            }
        }
        return true;
        
    }
}