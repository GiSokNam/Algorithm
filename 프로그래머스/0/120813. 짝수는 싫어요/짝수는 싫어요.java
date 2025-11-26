class Solution {
    public int[] solution(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .toArray();
    }
}