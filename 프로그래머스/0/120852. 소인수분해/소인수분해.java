import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new LinkedHashSet<>();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        return factors.stream().mapToInt(Integer::intValue).toArray();
    }
}