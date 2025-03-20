import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> result = new LinkedList<>();
        while (result.add(n) && n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        return result;
    }
}