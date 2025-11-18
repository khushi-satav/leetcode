class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);  // sort

        char[] first = strs[0].toCharArray();
        char[] second = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < first.length && i < second.length; i++) {
            if(first[i] != second[i])
                break;
            result.append(first[i]);
        }

        return result.toString();
    }
}
