import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> {
                    int v = arr[i];
                    return (v >= 50 && v % 2 == 0) ? v / 2 :
                           (v < 50 && v % 2 != 0) ? v * 2 : v;
                })
                .toArray();
    }
}