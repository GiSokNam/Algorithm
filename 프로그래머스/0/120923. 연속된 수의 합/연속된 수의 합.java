class Solution {
    public int[] solution(int num, int total) {
        int start = (2 * total / num - num + 1) / 2;
        return java.util.stream.IntStream.range(start, start + num).toArray();
    }
}