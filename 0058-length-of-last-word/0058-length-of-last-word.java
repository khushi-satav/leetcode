class Solution { 
    public int lengthOfLastWord(String s) { 

        String S = s.trim(); 
        int count = 0; 

        for(int i = S.length() - 1; i >= 0; i--) { 
            if(S.charAt(i) != ' ') { 
                count++; 
            } else { 
                break; 
            } 
        } 

        return count; 
    } 
}