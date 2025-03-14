import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return Arrays.stream(queries)
                .mapToInt(q -> Arrays.stream(arr, q[0], q[1] + 1)
                        .filter(n -> n > q[2])
                        .min()
                        .orElse(-1))
                .toArray();
    }
}