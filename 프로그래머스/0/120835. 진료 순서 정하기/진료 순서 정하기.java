import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        return Arrays.stream(emergency)
                .map(e -> (int) Arrays.stream(emergency)
                        .filter(x -> x > e).count() + 1)
                .toArray();
    }
}