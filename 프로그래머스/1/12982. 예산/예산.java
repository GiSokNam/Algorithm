import java.util.Arrays;

class Solution {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int supportedCount = 0;
        int remainingBudget = budget;

        for (int amount : d) {
            if (remainingBudget < amount) {
                break;
            }
            remainingBudget -= amount;
            supportedCount++;
        }

        return supportedCount;
    }
}