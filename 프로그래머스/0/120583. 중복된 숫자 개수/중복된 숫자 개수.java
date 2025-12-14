class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int value : array) {
            if (value == n) count++;
        }
        return count;
    }
}