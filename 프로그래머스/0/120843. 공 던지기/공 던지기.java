class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int index = (2 * (k - 1)) % n;
        return numbers[index];
    }
}