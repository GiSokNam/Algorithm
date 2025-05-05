class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] delta = new int[n + 1];

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            delta[s] += 1;
            if (e + 1 < n) delta[e + 1] -= 1;
        }

        int cum = 0;
        for (int i = 0; i < n; i++) {
            cum += delta[i];
            arr[i] += cum;
        }

        return arr;
    }
}