import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> {
                    int dist = Math.abs(a - n) - Math.abs(b - n);
                    return dist == 0 ? b - a : dist;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}