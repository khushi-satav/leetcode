import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        // Copy original array
        int[] copy = arr.clone();

        // Sort the copy
        Arrays.sort(copy);

        // Store element -> rank
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : copy) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        // Replace elements with their rank
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}