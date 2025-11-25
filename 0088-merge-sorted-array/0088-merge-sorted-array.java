class Solution {
    public void merge(int[] A, int m, int[] B, int n) {

        int idx = m + n - 1; // final index
        int i = m - 1;        // last valid element of A
        int j = n - 1;        // last element of B

        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[idx--] = A[i--];
            } else {
                A[idx--] = B[j--];
            }
        }

        // only B may have remaining elements
        while (j >= 0) {
            A[idx--] = B[j--];
        }
    }
}
