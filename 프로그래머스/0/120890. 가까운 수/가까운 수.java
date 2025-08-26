import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return Arrays.stream(array)
                .boxed()
                .min((a, b) -> {
                    int da = Math.abs(a - n), db = Math.abs(b - n);
                    return da == db ? a - b : da - db;
                })
                .get();
    }
}