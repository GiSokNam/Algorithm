import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int maxMatch = matchCount + zeroCount;
        int minMatch = matchCount;

        return new int[] {
            getRank(maxMatch),
            getRank(minMatch)
        };
    }

    private int getRank(int matchCount) {
        if (matchCount >= 6) return 1;
        if (matchCount == 5) return 2;
        if (matchCount == 4) return 3;
        if (matchCount == 3) return 4;
        if (matchCount == 2) return 5;
        return 6;
    }
}