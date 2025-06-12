import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        for (String str : strArr) {
            lengthCount.merge(str.length(), 1, Integer::sum);
        }
        return lengthCount.values().stream()
                .max(Integer::compareTo)
                .orElse(0);
    }
}