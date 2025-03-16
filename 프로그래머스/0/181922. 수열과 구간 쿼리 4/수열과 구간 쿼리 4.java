import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        Arrays.stream(queries).forEach(q -> 
            Arrays.setAll(arr, i -> (i >= q[0] && i <= q[1] && i % q[2] == 0) ? arr[i] + 1 : arr[i])
        );
        return arr;
    }
}