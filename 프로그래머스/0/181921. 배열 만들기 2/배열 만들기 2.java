import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] result = IntStream.rangeClosed(l, r)
                .filter(i -> String.valueOf(i).matches("[05]+"))
                .toArray();
        return result.length == 0 ? new int[]{-1} : result;
    }
}