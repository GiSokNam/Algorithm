import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;

        return IntStream.range(0, len)
                .map(i -> {
                    if ("right".equals(direction)) {
                        return numbers[(i - 1 + len) % len];
                    } else {
                        return numbers[(i + 1) % len];
                    }
                })
                .toArray();
    }
}