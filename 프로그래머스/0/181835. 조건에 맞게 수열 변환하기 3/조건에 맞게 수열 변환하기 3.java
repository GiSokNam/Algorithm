import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                     .map(num -> k % 2 == 1 ? num * k : num + k)
                     .toArray();
    }
}