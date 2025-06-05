import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        boolean[] seen = new boolean[100_001];
        int idx = 0;
        for (int n : arr) {
            if (!seen[n]) {
                seen[n] = true;
                answer[idx++] = n;
                if (idx == k) break;
            }
        }
        return answer;
    }
}