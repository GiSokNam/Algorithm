class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isComposite(i)) count++;
        }
        return count;
    }

    private boolean isComposite(int num) {
        if (num < 4) return false;
        int divisorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) divisorCount++;
            if (divisorCount >= 3) return true;
        }
        return false;
    }
}