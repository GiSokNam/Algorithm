import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : new int[]{a, b, c, d}) 
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        List<Integer> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys, (x, y) -> freq.get(y) - freq.get(x));

        switch (freq.size()) {
            case 1:
                return 1111 * a;
            case 2:
                int p = keys.get(0), q = keys.get(1);
                return (freq.get(p) == 3) ? (int) Math.pow(10 * p + q, 2)
                        : (p + q) * Math.abs(p - q);
            case 3:
                return keys.get(1) * keys.get(2);
            default:
                return Collections.min(keys);
        }
    }
}