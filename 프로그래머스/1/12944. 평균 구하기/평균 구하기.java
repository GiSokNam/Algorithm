class Solution {
    public double solution(int[] arr) {
        long sum = 0L;

        for (int value : arr) {
            sum += value;
        }

        return (double) sum / arr.length;
    }
}