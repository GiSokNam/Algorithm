class Solution {
    public double solution(int[] numbers) {
        long sum = 0L;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }
}