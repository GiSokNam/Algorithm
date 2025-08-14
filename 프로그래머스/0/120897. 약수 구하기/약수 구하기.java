import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisors.add(i);
        }
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}